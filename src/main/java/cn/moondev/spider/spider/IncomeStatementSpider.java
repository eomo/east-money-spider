package cn.moondev.spider.spider;

import cn.moondev.framework.provider.okhttp3.OkHttpOperations;
import cn.moondev.framework.provider.okhttp3.OkHttpRequest;
import cn.moondev.spider.mapper.IncomeStatementMapper;
import cn.moondev.spider.model.IncomeStatement;
import cn.moondev.spider.model.StockType;
import cn.moondev.spider.spider.handler.IncomeStatementHandler;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

@Component
public class IncomeStatementSpider {

    @Autowired
    private OkHttpOperations okHttpOperations;
    @Autowired
    private IncomeStatementMapper incomeStatementMapper;

    public void crawl(String stock) {
        // 创业板
        if (stock.startsWith("3")) {
            // 按报告周期查询
            crawl4GEM(stock, "", "1", "R");
            // 按年度查询
            crawl4GEM(stock, "", "1", "Y");
            // 按季度查询
            crawl4GEM(stock, "", "2", "Q");
        } else if (stock.startsWith("8") || stock.startsWith("4")) {
            // 按报告周期查询
            crawl4NEEQ(stock, "0");
            // 按年度查询
            crawl4NEEQ(stock, "6");
        }
    }


    /**
     * 抓取利润表(创业板)
     * GEM = Growth Enterprise Market
     *
     * @param stock      股票代码
     * @param endDate    结束日期
     * @param reportType 报告类型
     * @param dateType   报告周期：R 按报告周期查询，Y 按年度查询，Q 按季度查询，M 按月度查询
     */
    private void crawl4GEM(String stock, String endDate, String reportType, String dateType) {
        OkHttpRequest request = new OkHttpRequest();
        request.domain = "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/lrbAjax";
        request.requestHeader.put("Host", "emweb.securities.eastmoney.com");
        request.requestParams.put("companyType", "4");
        // 按报告周期查询
        request.requestParams.put("reportDateType", "Y".equals(dateType) ? "1" : "0");
        request.requestParams.put("reportType", reportType);
        request.requestParams.put("endDate", endDate);
        request.requestParams.put("code", "sz" + stock);
        List<IncomeStatement> models = okHttpOperations.syncRequest(request, new IncomeStatementHandler(StockType.GEM.toString()));
        if (CollectionUtils.isEmpty(models)) {
            return;
        }
        List<String> reportDates = Lists.newArrayList();
        for (IncomeStatement model : models) {
            model.dateType = dateType;
            model.stockType = StockType.GEM.toString();
            reportDates.add(model.reportDate);
            incomeStatementMapper.upsert(model);
        }
        Collections.sort(reportDates);
        crawl4GEM(stock, reportDates.get(0), reportType, dateType);
    }

    /**
     * 抓取利润表(新三板)
     * NEEQ = National Equities Exchange and Quotations（全国中小企业股份转让系统）
     *
     * @param stock
     */
    private void crawl4NEEQ(String stock, String reportDateType) {
        OkHttpRequest request = new OkHttpRequest();
        request.domain = "http://xinsanban.eastmoney.com/api/F10/Finance/zcfzb";
        request.requestHeader.put("Host", "xinsanban.eastmoney.com");
        request.requestHeader.put("Referer", "http://xinsanban.eastmoney.com/F10/finance/zcfzb/836728.html");
        request.requestHeader.put("X-Requested-With", "XMLHttpRequest");
        request.requestParams.put("companyType", "4");
        // 按报告周期查询
        request.requestParams.put("dateType", reportDateType);
        request.requestParams.put("MSECUCODE", stock);
        List<IncomeStatement> sheets = okHttpOperations.syncRequest(request, new IncomeStatementHandler(StockType.NEEQ.toString()));
        if (CollectionUtils.isEmpty(sheets)) {
            return;
        }
        for (IncomeStatement sheet : sheets) {
            sheet.dateType = "0".equals(reportDateType) ? "R" : "Y";
            sheet.stockType = StockType.NEEQ.toString();
            if (Strings.isNullOrEmpty(sheet.securityCode)) {
                sheet.securityCode = stock;
            }
            incomeStatementMapper.upsert(sheet);
        }
    }
}
