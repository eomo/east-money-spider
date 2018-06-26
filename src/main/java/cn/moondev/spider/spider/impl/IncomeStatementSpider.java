package cn.moondev.spider.spider.impl;

import cn.moondev.framework.provider.okhttp3.OkHttpOperations;
import cn.moondev.framework.provider.okhttp3.OkHttpRequest;
import cn.moondev.spider.mapper.IncomeStatementMapper;
import cn.moondev.spider.model.IncomeStatement;
import cn.moondev.spider.model.ReportDateType;
import cn.moondev.spider.model.StockType;
import cn.moondev.spider.spider.FinancialSpider;
import cn.moondev.spider.spider.handler.IncomeStatementHandler;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 * 利润表
 */
@Component
public class IncomeStatementSpider extends FinancialSpider {

    @Autowired
    private OkHttpOperations okHttpOperations;
    @Autowired
    private IncomeStatementMapper incomeStatementMapper;

    @Override
    public void crawl4GEM(String stock, String endDate, String reportType, ReportDateType dateType) {
        OkHttpRequest request = new OkHttpRequest();
        request.domain = "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/lrbAjax";
        request.requestHeader.put("Host", "emweb.securities.eastmoney.com");
        request.requestParams.put("companyType", "4");
        // 按报告周期查询
        request.requestParams.put("reportDateType", dateType == ReportDateType.YEAR ? "1" : "0");
        request.requestParams.put("reportType", reportType);
        request.requestParams.put("endDate", endDate);
        request.requestParams.put("code", "sz" + stock);
        List<IncomeStatement> models = okHttpOperations.syncRequest(request, new IncomeStatementHandler(StockType.GEM.toString()));
        if (CollectionUtils.isEmpty(models)) {
            return;
        }
        List<String> reportDates = Lists.newArrayList();
        for (IncomeStatement model : models) {
            model.dateType = dateType.value();
            model.stockType = StockType.GEM.toString();
            reportDates.add(model.reportDate);
            incomeStatementMapper.upsert(model);
        }
        Collections.sort(reportDates);
        crawl4GEM(stock, reportDates.get(0), reportType, dateType);
    }

    @Override
    public void crawl4NEEQ(String stock, ReportDateType dateType) {
        OkHttpRequest request = new OkHttpRequest();
        request.domain = "http://xinsanban.eastmoney.com/api/F10/Finance/lrb";
        request.requestHeader.put("Host", "xinsanban.eastmoney.com");
        request.requestHeader.put("Referer", "http://xinsanban.eastmoney.com/F10/finance/lrb/" + stock + ".html");
        request.requestHeader.put("X-Requested-With", "XMLHttpRequest");
        // 按报告周期查询
        request.requestParams.put("dateType", ReportDateType.YEAR == dateType ? "6" : "0");
        request.requestParams.put("MSECUCODE", stock);
        List<IncomeStatement> sheets = okHttpOperations.syncRequest(request, new IncomeStatementHandler(StockType.NEEQ.toString()));
        if (CollectionUtils.isEmpty(sheets)) {
            return;
        }
        for (IncomeStatement sheet : sheets) {
            sheet.dateType = dateType.value();
            sheet.stockType = StockType.NEEQ.toString();
            if (Strings.isNullOrEmpty(sheet.securityCode)) {
                sheet.securityCode = stock;
            }
            incomeStatementMapper.upsert(sheet);
        }
    }
}
