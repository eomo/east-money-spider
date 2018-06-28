package cn.moondev.spider.model;

import com.alibaba.fastjson.JSONObject;

public class Company {
    // 公司名称
    public String companyName;
    // 英文名称
    public String englishName;
    // 曾用名
    public String nameUsedBefore;
    // 股票代码
    public String stockCode;
    // 股票简称
    public String stockShortName;
    // 市场
    public String market;
    // 证券类别
    public String bondType;
    // 所属东财行业
    public String emIndustry;
    // 所属证监会行业
    public String sfcIndustry;
    // 上市交易所
    public String exchange;
    // 总经理
    public String manager;
    // 法人代表
    public String legalPerson;
    // 董事长
    public String chairman;
    // 董秘
    public String secretary;
    // 证券事务代表
    public String stockDeputy;
    // 独立董事
    public String independentDirector;
    // 联系电话
    public String contact;
    // 电子信箱
    public String email;
    // 传真
    public String fax;
    // 公司网址
    public String website;
    // 办公地址
    public String officeAddress;
    // 注册地址
    public String registerAddress;
    // 区域
    public String zone;
    // 邮政编码
    public String postCode;
    // 注册资本
    public String capital;
    // 工商登记
    public String businessRegist;
    // 雇员人数
    public int employeeNum;
    // 管理人员人数
    public int managerNum;
    // 律师事务所
    public String lawOffice;
    // 会计师事务所
    public String accountingFirm;
    // 公司简介
    public String brief;
    // 经营范围
    public String businessScope;
    // 成立日期
    public String establishDate;
    // 上市日期
    public String listingDate;
    // 发行市盈率(倍)
    public String ipopeRatio;
    // 网上发行日期
    public String issueDate;
    // 发行方式
    public String issueWay;
    // 每股面值(元)
    public String perShareValue;
    // 发行量(股)
    public String circulation;
    // 每股发行价(元)
    public String perSharePrice;
    // 发行费用(元)
    public String issueCost;
    // 发行总市值(元)
    public String marketValue;
    // 募集资金净额(元)
    public String placement;
    // 首日开盘价(元)
    public String openPriceFirstDay;
    // 首日收盘价(元)
    public String closePriceFirstDay;
    // 首日换手率
    public String turnoverRateFirstDay;
    // 首日最高价(元)
    public String maxPriceFirstDay;
    // 网下配售中签率
    public String offlineLotWinningRate;
    // 定价中签率
    public String pricingLotWinningRate;

    public Company(JSONObject json) {
        this.stockCode = json.getString("agdm");
        this.stockShortName = json.getString("agjc");
//        this. = json.getString("bgdm");
        this.officeAddress = json.getString("bgdz");
//        this. = json.getString("bgjc");
//        this. = json.getString("cym");
        this.fax = json.getString("cz");
        this.independentDirector = json.getString("dlds");
        this.secretary = json.getString("dm");
        this.chairman = json.getString("dsz");
        this.email = json.getString("dzxx");
        this.legalPerson = json.getString("frdb");
        this.managerNum = json.getInteger("glryrs");
        this.businessRegist = json.getString("gsdj");
        this.brief = json.getString("gsjj");
        this.companyName = json.getString("gsmc");
        this.website = json.getString("gswz");
        this.employeeNum = json.getInteger("gyrs");
//        this. = json.getString("hgdm");
//        this. = json.getString("hgjc");
        this.businessScope = json.getString("jyfw");
        this.accountingFirm = json.getString("kjssws");
        this.lawOffice = json.getString("lssws");
        this.contact = json.getString("lxdh");
        this.zone = json.getString("qy");
        this.emIndustry = json.getString("sshy");
        this.exchange = json.getString("ssjys");
        this.sfcIndustry = json.getString("sszjhhy");
        this.englishName = json.getString("ywmc");
        this.postCode = json.getString("yzbm");
        this.registerAddress = json.getString("zcdz");
        this.capital = json.getString("zczb");
        this.manager = json.getString("zjl");
        this.bondType = json.getString("zqlb");
        this.stockDeputy = json.getString("zqswdb");
        this.establishDate = json.getString("clrq");
        this.pricingLotWinningRate = json.getString("djzql");
        this.issueWay = json.getString("fxfs");
        this.issueCost = json.getString("fxfy");
        this.circulation = json.getString("fxl");
        this.ipopeRatio = json.getString("fxsyl");
        this.marketValue = json.getString("fxzsz");
        this.perSharePrice = json.getString("mgfxj");
        this.perShareValue = json.getString("mgmz");
        this.placement = json.getString("mjzjje");
        this.turnoverRateFirstDay = json.getString("srhsl");
        this.openPriceFirstDay = json.getString("srkpj");
        this.closePriceFirstDay = json.getString("srspj");
        this.maxPriceFirstDay = json.getString("srzgj");
        this.listingDate = json.getString("ssrq");
        this.issueDate = json.getString("wsfxrq");
        this.offlineLotWinningRate = json.getString("wxpszql");
    }
}
