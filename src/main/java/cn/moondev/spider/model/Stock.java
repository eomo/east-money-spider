package cn.moondev.spider.model;

import org.jeecgframework.poi.excel.annotation.Excel;

/**
 * 股票模型
 */
public class Stock {

    // 代码
    @Excel(name = "代码")
    public String stockCode;

    // 类型
    public String stockType;

    // 名称
    @Excel(name = "名称")
    public String stockName;

    // 市场分层
    @Excel(name = "市场分层")
    public String level;

    // 转让方式
    @Excel(name = "转让方式")
    public String transfer;

    // 券商是否持续督导
    @Excel(name = "券商是否持续督导")
    public String supervision;

    // 总股本(万股)
    @Excel(name = "总股本(万股)")
    public Float capital;

    // 有限公司设立日期
    @Excel(name = "有限公司设立日期")
    public String limitedCompanyCreateDate;

    // 股份公司设立日期
    @Excel(name = "股份公司设立日期")
    public String stockCompanyCreateDate;

    // 申报挂牌日
    @Excel(name = "申报挂牌日")
    public String applyListingDate;

    // 挂牌日期
    @Excel(name = "挂牌日期")
    public String listingDate;

    // 挂牌前两年总资产(万元)
    @Excel(name = "挂牌前两年总资产(万元)")
    public Float totalAssetTwoYearBeforeListing;

    // 挂牌前两年净资产(万元)
    @Excel(name = "挂牌前两年净资产(万元)")
    public Float netAssetTwoYearBeforeListing;

    // 挂牌前两年营业收入(万元)
    @Excel(name = "挂牌前两年营业收入(万元)")
    public Float operatingReceiptTwoYearBeforeListing;

    // 挂牌前两年净利润(万元)
    @Excel(name = "挂牌前两年净利润(万元)")
    public Float netProfitTwoYearBeforeListing;

    // 挂牌前一年总资产(万元)
    @Excel(name = "挂牌前一年总资产(万元)")
    public Float totalAssetOneYearBeforeListing;

    // 挂牌前一年净资产(万元)
    @Excel(name = "挂牌前一年净资产(万元)")
    public Float netAssetOneYearBeforeListing;

    // 挂牌前一年营业收入(万元)
    @Excel(name = "挂牌前一年营业收入(万元)")
    public Float operatingReceiptOneYearBeforeListing;

    // 挂牌前一年净利润(万元)
    @Excel(name = "挂牌前一年净利润(万元)")
    public Float netProfitOneYearBeforeListing;

    // 挂牌当年总资产(万元)
    @Excel(name = "挂牌当年总资产(万元)")
    public Float totalAssetForListingYear;

    // 挂牌前是否有投资机构进入
    @Excel(name = "挂牌前是否有投资机构进入",replace = {"是_Y","否_N"})
    public String pevcInvestBeforeListing;

    // 是否有对赌条款
    @Excel(name = "是否有对赌条款",replace = {"是_Y","否_N"})
    public String putOptions;

    // 约定IPO
    @Excel(name = "约定IPO")
    public String arrangeIpo;

    // 约定业绩
    @Excel(name = "约定业绩")
    public String arrangePerformance;

    // 同时约定IPO和业绩
    @Excel(name = "同时约定IPO和业绩")
    public String arrangeIpoPerformance;

    // 对赌类型：1 约定IPO，2 约定业绩，3 同时约定IPO和业绩
    public String putOptionsType;

    // 从申报挂牌到挂牌日定向增发金额
    @Excel(name = "从申报挂牌到挂牌日定向增发金额")
    public Float additionalAmountBeforeListing;

    // 挂牌当日是否有定向增发
    @Excel(name = "挂牌当日是否有定向增发",replace = {"是_Y","否_N"})
    public String isAdditionalAmountListingToday;

    // 定向增发金额(万元)
    @Excel(name = "定向增发金额(万元)")
    public Float additionalAmount;

    // 挂牌时大股东持股比例
    @Excel(name = "挂牌时大股东持股比例")
    public Float maxShareholdRatio;

    // 挂牌当日市值
    @Excel(name = "挂牌当日市值")
    public Float marketValueListingToday;

    // 挂牌5日市值
    @Excel(name = "挂牌5日市值")
    public Float marketValueFiveDayBeforeListing;

    // 挂牌20日市值
    @Excel(name = "挂牌20日市值")
    public Float marketValueTwentyDayBeforeListing;

    // 所属园区
    @Excel(name = "所属园区")
    public String park;

    // 证监会行业(2012)
    @Excel(name = "证监会行业(2012)")
    public String industry;



}
