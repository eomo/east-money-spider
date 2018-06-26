package cn.moondev.spider.spider;

import cn.moondev.spider.model.ReportDateType;

/**
 * 财务分析数据爬取
 */
public abstract class FinancialSpider implements Spider {

    @Override
    public void spider(String stock) {
        // 创业板
        if (stock.startsWith("3")) {
            // 按报告周期查询
            crawl4GEM(stock, "", "1", ReportDateType.REPORT);
            // 按年度查询
            crawl4GEM(stock, "", "1", ReportDateType.YEAR);
            // 按季度查询
            crawl4GEM(stock, "", "2", ReportDateType.QUARTER);
        } else if (stock.startsWith("8") || stock.startsWith("4")) {
            // 按报告周期查询
            crawl4NEEQ(stock, ReportDateType.QUARTER);
            // 按年度查询
            crawl4NEEQ(stock, ReportDateType.YEAR);
        }
    }

    /**
     * 创业板数据抓取
     * GEM = Growth Enterprise Market
     *
     * @param stock      股票代码
     * @param endDate    结束日期
     * @param reportType 报告类型
     * @param dateType   报告周期：R 按报告周期查询，Y 按年度查询，Q 按季度查询，M 按月度查询
     */
    public abstract void crawl4GEM(String stock, String endDate, String reportType, ReportDateType dateType);

    /**
     * 新三板数据抓取
     * NEEQ = National Equities Exchange and Quotations（全国中小企业股份转让系统）
     *
     * @param stock
     */
    public abstract void crawl4NEEQ(String stock, ReportDateType dateType);


}
