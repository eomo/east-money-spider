package cn.moondev.spider.model;

import org.jeecgframework.poi.excel.annotation.Excel;

/**
 * 新三板企业PEVC投资明细
 */
public class NeeqPevcInvest {
    // 证券代码
    @Excel(name = "证券代码")
    public String stockCode;
    // 证券名称
    @Excel(name = "证券名称")
    public String stockName;
    // 挂牌日期
    @Excel(name = "挂牌日期")
    public String listingDate;
    // 投资机构家数
    @Excel(name = "投资机构家数")
    public Integer investNum;
    // 累计投资金额(万元)
    @Excel(name = "累计投资金额(万元)")
    public Float totalInvestAmount;
    // 交易方式
    @Excel(name = "交易方式")
    public String tradeWay;
    // 股份总量(万股)
    @Excel(name = "股份总量(万股)")
    public Float generalCapital;
    // 最新市值(万元)
    @Excel(name = "最新市值(万元)")
    public Float latestMarketValue;
    // 营业收入(最新财年)
    @Excel(name = "营业收入(最新财年)")
    public Float latestOperatingReceipt;
    // 利润率(最新财年)
    @Excel(name = "利润率(最新财年)")
    public Float profit;
    // 所属证监会行业
    @Excel(name = "所属证监会行业")
    public String industry;

}
