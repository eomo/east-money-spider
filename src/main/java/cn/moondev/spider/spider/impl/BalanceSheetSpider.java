package cn.moondev.spider.spider.impl;

import cn.moondev.framework.provider.okhttp3.OkHttpOperations;
import cn.moondev.framework.provider.okhttp3.OkHttpRequest;
import cn.moondev.spider.mapper.BalanceSheetMapper;
import cn.moondev.spider.model.BalanceSheet;
import cn.moondev.spider.model.ReportDateType;
import cn.moondev.spider.model.StockType;
import cn.moondev.spider.spider.FinancialSpider;
import cn.moondev.spider.spider.handler.BalanceSheetHandler;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 * 资产负债表
 */
@Component
public class BalanceSheetSpider extends FinancialSpider {

    @Autowired
    private OkHttpOperations okHttpOperations;
    @Autowired
    private BalanceSheetMapper balanceSheetMapper;

    @Override
    public void crawl4GEM(String stock, String endDate, String reportType, ReportDateType dateType) {
        // 资产负债表不提供按季度查询的接口
        if (ReportDateType.QUARTER == dateType) {
            return;
        }
        OkHttpRequest request = new OkHttpRequest();
        request.domain = "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/zcfzbAjax";
        request.requestHeader.put("Host", "emweb.securities.eastmoney.com");
        request.requestParams.put("companyType", "4");
        // 按报告周期查询
        request.requestParams.put("reportDateType", ReportDateType.YEAR == dateType ? "1" : "0");
        request.requestParams.put("reportType", reportType);
        request.requestParams.put("endDate", endDate);
        request.requestParams.put("code", "sz" + stock);
        List<BalanceSheet> sheets = okHttpOperations.syncRequest(request, new BalanceSheetHandler(StockType.GEM.toString()));
        if (CollectionUtils.isEmpty(sheets)) {
            return;
        }
        List<String> reportDates = Lists.newArrayList();
        for (BalanceSheet sheet : sheets) {
            sheet.dateType = dateType.value();
            sheet.stockType = StockType.GEM.toString();
            reportDates.add(sheet.reportDate);
            balanceSheetMapper.upsert(sheet);
        }
        Collections.sort(reportDates);
        crawl4GEM(stock, reportDates.get(0), reportType, dateType);
    }

    @Override
    public void crawl4NEEQ(String stock, ReportDateType dateType) {
        OkHttpRequest request = new OkHttpRequest();
        request.domain = "http://xinsanban.eastmoney.com/api/F10/Finance/zcfzb";
        request.requestHeader.put("Host", "xinsanban.eastmoney.com");
        request.requestHeader.put("Referer", "http://xinsanban.eastmoney.com/F10/finance/zcfzb/" + stock + ".html");
        request.requestHeader.put("X-Requested-With", "XMLHttpRequest");
        // 按报告周期查询
        request.requestParams.put("dateType", ReportDateType.YEAR == dateType ? "6" : "0");
        request.requestParams.put("MSECUCODE", stock);
        List<BalanceSheet> sheets = okHttpOperations.syncRequest(request, new BalanceSheetHandler(StockType.NEEQ.toString()));
        if (CollectionUtils.isEmpty(sheets)) {
            return;
        }
        for (BalanceSheet sheet : sheets) {
            sheet.dateType = dateType.value();
            sheet.stockType = StockType.NEEQ.toString();
            if (Strings.isNullOrEmpty(sheet.stockCode)) {
                sheet.stockCode = stock;
            }
            balanceSheetMapper.upsert(sheet);
        }
    }
}
