package cn.moondev.spider.model;

import cn.moondev.framework.provider.excel.annotation.ExcelColumn;

/**
 * 新三板企业PEVC投资明细
 */
public class NeeqPevcInvest {
    // 证券代码
    @ExcelColumn(name = "证券代码")
    public String stockCode;
    // 证券名称
    @ExcelColumn(name = "证券名称")
    public String stockName;
    // 挂牌日期
    @ExcelColumn(name = "挂牌日期")
    public String listingDate;
    // 投资机构家数
    @ExcelColumn(name = "投资机构家数")
    public Integer investNum;
    // 累计投资金额(万元)
    @ExcelColumn(name = "累计投资金额(万元)")
    public Float totalInvestAmount;
    // 交易方式
    @ExcelColumn(name = "交易方式")
    public String tradeWay;
    // 股份总量(万股)
    @ExcelColumn(name = "股份总量(万股)")
    public Float generalCapital;
    // 最新市值(万元)
    @ExcelColumn(name = "最新市值(万元)")
    public Float latestMarketValue;
    // 营业收入(最新财年)
    @ExcelColumn(name = "营业收入(最新财年)")
    public Float latestOperatingReceipt;
    // 利润率(最新财年)
    @ExcelColumn(name = "利润率(最新财年)")
    public Float profit;
    // 所属证监会行业
    @ExcelColumn(name = "所属证监会行业")
    public String industry;

}
