package cn.moondev.spider.spider.impl;

import cn.moondev.framework.provider.okhttp3.OkHttpOperations;
import cn.moondev.framework.provider.okhttp3.OkHttpRequest;
import cn.moondev.spider.mapper.CashFlowStatementMapper;
import cn.moondev.spider.model.CashFlowStatement;
import cn.moondev.spider.model.ReportDateType;
import cn.moondev.spider.model.StockType;
import cn.moondev.spider.spider.FinancialSpider;
import cn.moondev.spider.spider.handler.CashFlowStatementHandler;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * 现金流量表
 */
@Component
public class CashFlowStatementSpider extends FinancialSpider {

    @Autowired
    private OkHttpOperations okHttpOperations;
    @Autowired
    private CashFlowStatementMapper cashFlowStatementMapper;

    @Override
    public void crawl4GEM(String stock, String endDate, String reportType, ReportDateType dateType) {
        OkHttpRequest request = new OkHttpRequest();
        request.domain = "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/xjllbAjax";
        request.requestHeader.put("Host", "emweb.securities.eastmoney.com");
        request.requestParams.put("companyType", "4");
        // 按报告周期查询
        request.requestParams.put("reportDateType", ReportDateType.YEAR == dateType ? "1" : "0");
        request.requestParams.put("reportType", reportType);
        request.requestParams.put("endDate", endDate);
        request.requestParams.put("code", "sz" + stock);
        List<CashFlowStatement> cashFlowStatements = okHttpOperations.syncRequest(request, new CashFlowStatementHandler(StockType.GEM.toString()));
//        if (CollectionUtils.isEmpty(cashFlowStatements)) {
//            return;
//        }
        List<String> reportDates = Lists.newArrayList();
        for (CashFlowStatement cfs : cashFlowStatements) {
            cfs.dateType = dateType.value();
            cfs.stockType = "GEM";
            reportDates.add(cfs.reportDate);
            cashFlowStatementMapper.upsert(cfs);
        }
        Collections.sort(reportDates);
        crawl4GEM(stock, reportDates.get(0), reportType, dateType);
    }

    @Override
    public void crawl4NEEQ(String stock, ReportDateType dateType) {
        OkHttpRequest request = new OkHttpRequest();
        request.domain = "http://xinsanban.eastmoney.com/api/F10/Finance/xjllb";
        request.requestHeader.put("Host", "xinsanban.eastmoney.com");
        request.requestHeader.put("Referer", "http://xinsanban.eastmoney.com/F10/finance/xjllb/" + stock + ".html");
        request.requestHeader.put("X-Requested-With", "XMLHttpRequest");
        // 按报告周期查询
        request.requestParams.put("dateType", ReportDateType.YEAR == dateType ? "6" : "0");
        request.requestParams.put("MSECUCODE", stock);
        List<CashFlowStatement> sheets = okHttpOperations.syncRequest(request, new CashFlowStatementHandler(StockType.NEEQ.toString()));
//        if (CollectionUtils.isEmpty(sheets)) {
//            return;
//        }
        for (CashFlowStatement sheet : sheets) {
            sheet.dateType = dateType.value();
            sheet.stockType = StockType.NEEQ.toString();
            if (Strings.isNullOrEmpty(sheet.stockCode)) {
                sheet.stockCode = stock;
            }
            cashFlowStatementMapper.upsert(sheet);
        }
    }
}
