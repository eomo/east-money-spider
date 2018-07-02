package cn.moondev.spider.model;

import cn.moondev.framework.provider.excel.annotation.ExcelColumn;

/**
 * 公司基本资料
 */
public class CompanyBaseInfo {

    // 代码
    @ExcelColumn(name = "代码")
    public String stockCode;

    // 名称
    @ExcelColumn(name = "名称")
    public String companyName;

    // 挂牌日期
    @ExcelColumn(name = "挂牌日期")
    public String listingDate;

    // 首次成交日
    @ExcelColumn(name = "首次成交日")
    public String firstDealDate;

    // 交易方式
    @ExcelColumn(name = "交易方式")
    public String transactionMode;

    // 股东户数
    @ExcelColumn(name = "股东户数")
    public Integer shareHolderNum;

    // 公司全称
    @ExcelColumn(name = "公司全称")
    public String fullName;

    // 组织形式
    @ExcelColumn(name = "组织形式")
    public String orgType;

    // 公司介绍
    @ExcelColumn(name = "公司介绍")
    public String introduce;

    // 主营业务
    @ExcelColumn(name = "主营业务")
    public String mainBusiness;

    // 注册资本(亿元)
    @ExcelColumn(name = "注册资本(亿元)")
    public Float registeredCapital;

    // 有限公司设立日
    @ExcelColumn(name = "有限公司设立日")
    public String limitedCompanyDate;

    // 股份公司成立日
    @ExcelColumn(name = "股份公司成立日")
    public String commonLawCompanyDate;

    // 法人代表
    @ExcelColumn(name = "法人代表")
    public String legalPerson;

    // 信息披露人
    @ExcelColumn(name = "信息披露人")
    public String infoDiscloser;

    // 实际控制人
    @ExcelColumn(name = "实际控制人")
    public String actualController;

    // 最终控制人
    @ExcelColumn(name = "最终控制人")
    public String ultimateController;

    // 地区
    @ExcelColumn(name = "地区")
    public String area;

    // 城市
    @ExcelColumn(name = "城市")
    public String city;

    // 所属园区
    @ExcelColumn(name = "所属园区")
    public String park;

    // 注册地址
    @ExcelColumn(name = "注册地址")
    public String registerAddress;

    // 联系电话
    @ExcelColumn(name = "联系电话")
    public String contacts;

    // 传真
    @ExcelColumn(name = "传真")
    public String fax;

    // 公司网址
    @ExcelColumn(name = "公司网址")
    public String website;

    // 主办券商(持续督导)
    @ExcelColumn(name = "主办券商(持续督导)")
    public String supervision;

    // 主办券商(推荐挂牌)
    @ExcelColumn(name = "主办券商(推荐挂牌)")
    public String recommend;

    // 会计师事务所
    @ExcelColumn(name = "会计师事务所")
    public String accountingFirm;

    // 法律顾问
    @ExcelColumn(name = "法律顾问")
    public String legalAdviser;


    // 证监会行业
    @ExcelColumn(name = "证监会行业")
    public String industry;

}
