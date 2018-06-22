package cn.moondev.spider.spider;

import cn.moondev.framework.provider.okhttp3.OkHttpOperations;
import cn.moondev.framework.provider.okhttp3.OkHttpRequest;
import cn.moondev.spider.mapper.BalanceSheetMapper;
import cn.moondev.spider.model.BalanceSheet;
import cn.moondev.spider.spider.handler.BalanceSheetHandler;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

@Component
public class BalanceSheetSpider {

    @Autowired
    private OkHttpOperations okHttpOperations;
    @Autowired
    private BalanceSheetMapper balanceSheetMapper;

    public void crawl(String stock) {
        // 创业板
        if (stock.startsWith("3")) {
            // 按报告周期查询
            crawl4GEM(stock, "", "0");
            // 按年度查询
            crawl4GEM(stock, "", "1");
        } else if (stock.startsWith("8") || stock.startsWith("4")) {

        }
    }


    /**
     * 抓取资产负债表(创业板)
     * GEM = Growth Enterprise Market
     *
     * @param stock 股票代码
     */
    private void crawl4GEM(String stock, String endDate, String reportDateType) {
        OkHttpRequest request = new OkHttpRequest();
        request.domain = "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/zcfzbAjax";
        request.requestHeader.put("Host", "emweb.securities.eastmoney.com");
        request.requestParams.put("companyType", "4");
        // 按报告周期查询
        request.requestParams.put("reportDateType", reportDateType);
        request.requestParams.put("reportType", "0");
        request.requestParams.put("endDate", endDate);
        request.requestParams.put("code", "sz" + stock);
        List<BalanceSheet> sheets = okHttpOperations.syncRequest(request, new BalanceSheetHandler());
        if (CollectionUtils.isEmpty(sheets)) {
            return;
        }
        List<String> reportDates = Lists.newArrayList();
        for (BalanceSheet sheet : sheets) {
            sheet.dateType = "0".equals(reportDateType) ? "R" : "Y";
            sheet.stockType = "GEM";
            reportDates.add(sheet.reportDate);
            balanceSheetMapper.upsert(sheet);
        }
        Collections.sort(reportDates);
        crawl4GEM(stock, reportDates.get(0), reportDateType);
    }

    /**
     * 抓取资产负债表(新三板)
     * NEEQ = National Equities Exchange and Quotations（全国中小企业股份转让系统）
     *
     * @param stock
     */
    private void crawl4NEEQ(String stock) {

    }
}
