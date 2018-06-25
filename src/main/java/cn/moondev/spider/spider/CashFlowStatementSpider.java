package cn.moondev.spider.spider;

import cn.moondev.framework.provider.okhttp3.OkHttpOperations;
import cn.moondev.framework.provider.okhttp3.OkHttpRequest;
import cn.moondev.spider.mapper.CashFlowStatementMapper;
import cn.moondev.spider.model.CashFlowStatement;
import cn.moondev.spider.spider.handler.CashFlowStatementHandler;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

@Component
public class CashFlowStatementSpider {

    @Autowired
    private OkHttpOperations okHttpOperations;
    @Autowired
    private CashFlowStatementMapper cashFlowStatementMapper;

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

        }
    }


    /**
     * 抓取资产负债表(创业板)
     * GEM = Growth Enterprise Market
     *
     * @param stock      股票代码
     * @param endDate    结束日期
     * @param reportType 报告类型
     * @param dateType   报告周期：R 按报告周期查询，Y 按年度查询，Q 按季度查询，M 按月度查询
     */
    private void crawl4GEM(String stock, String endDate, String reportType, String dateType) {
        OkHttpRequest request = new OkHttpRequest();
        request.domain = "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/xjllbAjax";
        request.requestHeader.put("Host", "emweb.securities.eastmoney.com");
        request.requestParams.put("companyType", "4");
        // 按报告周期查询
        request.requestParams.put("reportDateType", "Y".equals(dateType) ? "1" : "0");
        request.requestParams.put("reportType", reportType);
        request.requestParams.put("endDate", endDate);
        request.requestParams.put("code", "sz" + stock);
        List<CashFlowStatement> cashFlowStatements = okHttpOperations.syncRequest(request, new CashFlowStatementHandler());
        if (CollectionUtils.isEmpty(cashFlowStatements)) {
            return;
        }
        List<String> reportDates = Lists.newArrayList();
        for (CashFlowStatement cfs : cashFlowStatements) {
            cfs.dateType = dateType;
            cfs.stockType = "GEM";
            reportDates.add(cfs.reportDate);
            cashFlowStatementMapper.upsert(cfs);
        }
        Collections.sort(reportDates);
        crawl4GEM(stock, reportDates.get(0), reportType, dateType);
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
