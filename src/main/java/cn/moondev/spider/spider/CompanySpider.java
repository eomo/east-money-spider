package cn.moondev.spider.spider;

import cn.moondev.framework.provider.okhttp3.OkHttpOperations;
import cn.moondev.framework.provider.okhttp3.OkHttpRequest;
import cn.moondev.spider.mapper.CompanyMapper;
import cn.moondev.spider.model.Company;
import cn.moondev.spider.model.StockType;
import cn.moondev.spider.spider.handler.CompanyHandler;
import com.google.common.collect.Maps;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CompanySpider implements Spider {

    private static final Logger LOG = LoggerFactory.getLogger(CompanySpider.class);

    @Autowired
    private OkHttpOperations okHttpOperations;
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public void spider(String stock) {
        // 创业板
        if (stock.startsWith("3")) {
            crawl4GEM(stock);
        } else if (stock.startsWith("8") || stock.startsWith("4")) {
            try {
                crawl4NEEQ(stock);
            } catch (Exception e) {
                LOG.error("抓取公司信息失败,stock={}", stock, e);
            }
        }
        LOG.info("抓取公司成功,stock={}", stock);
    }

    /**
     * 创业板数据抓取
     * GEM = Growth Enterprise Market
     *
     * @param stock 股票代码
     */
    public void crawl4GEM(String stock) {
        OkHttpRequest request = new OkHttpRequest();
        request.domain = "http://emweb.securities.eastmoney.com/PC_HSF10/CompanySurvey/CompanySurveyAjax";
        request.requestHeader.put("Host", "emweb.securities.eastmoney.com");
        request.requestHeader.put("Referer", "http://emweb.securities.eastmoney.com/CompanySurvey/Index?type=web&code=sz" + stock);
        request.requestHeader.put("X-Requested-With", "XMLHttpRequest");
        request.requestParams.put("code", "sz" + stock);
        List<Company> companies = okHttpOperations.syncRequest(request, new CompanyHandler(StockType.NEEQ.toString()));
        if (!CollectionUtils.isEmpty(companies)) {
            for (Company company : companies) {
                companyMapper.upsert(company);
            }
        }
    }

    /**
     * 新三板数据抓取
     * NEEQ = National Equities Exchange and Quotations（全国中小企业股份转让系统）
     *
     * @param stock
     */
    public void crawl4NEEQ(String stock) throws IOException {
        Map<String, String> map = Maps.newHashMap();
        String url = "http://xinsanban.eastmoney.com/F10/CompanyInfo/Introduction/" + stock + ".html";
        Document doc = Jsoup.connect(url).get();
        map.putAll(parse2Map(doc, "ul.company-page-left > li"));
        map.putAll(parse2Map(doc, "ul.company-page-right > li"));
        if (!CollectionUtils.isEmpty(map)) {
            Company company = new Company(map);
            companyMapper.upsert(company);
        }
    }

    private Map<String, String> parse2Map(Document doc, String tag) {
        Map<String, String> map = Maps.newHashMap();
        Elements tags = doc.select(tag);
        String key = "", value = "";
        for (Element ul : tags) {
            Elements spans = ul.children();
            for (Element span : spans) {
                if (span.className().equalsIgnoreCase("company-page-item-left")) {
                    key = span.text();
                } else {
                    value = span.text();
                }
                map.put(key, value);
            }
        }
        return map;
    }
}
