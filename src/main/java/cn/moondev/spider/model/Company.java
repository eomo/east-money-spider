package cn.moondev.spider.model;

import cn.moondev.spider.utils.NumberUtils;
import cn.moondev.spider.utils.StringUtils;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public class Company {
    // 公司名称
    public String companyName;
    // 转让方式(新三板)
    public String transfer = "";
    // 市场分层(新三板)
    public String level = "";
    // 持续督导券商(新三板)
    public String supervision = "";
    // 推荐挂牌券商(新三板)
    public String listingSupervision = "";
    // 英文名称
    public String englishName = "";
    // 股票代码
    public String stockCode;
    // 股票类型
    public String stockType;
    // 股票简称
    public String stockShortName = "";
    // 证券类别
    public String bondType = "";
    // 所属证监会行业
    public String industry = "";
    // 上市交易所
    public String exchange = "";
    // 法人代表
    public String legalPerson = "";
    // 董事长
    public String chairman = "";
    // 董秘
    public String secretary = "";
    // 联系电话
    public String contact = "";
    // 电子信箱
    public String email = "";
    // 传真
    public String fax = "";
    // 公司网址
    public String website = "";
    // 办公地址
    public String officeAddress = "";
    // 注册地址
    public String registerAddress = "";
    // 注册资本
    public String capital = "";
    // 工商登记
    public String businessRegist = "";
    // 雇员人数
    public int employeeNum;
    // 管理人员人数
    public int managerNum;
    // 律师事务所
    public String lawOffice = "";
    // 会计师事务所
    public String accountingFirm = "";
    // 公司简介
    public String brief = "";
    // 经营范围
    public String businessScope = "";
    // 成立日期
    public String establishDate = "";
    // 上市/挂牌日期
    public String listingDate = "";
    // 发行市盈率(倍)
    public String ipopeRatio = "";
    // 网上发行日期
    public String issueDate = "";
    // 首次交易日(新三板)
    public String firstTradeDate = "";
    // 发行方式
    public String issueWay = "";
    // 每股面值(元)
    public String perShareValue = "";
    // 发行量(股)/总股本
    public String circulation = "";
    // 流通股本
    public String flowEquity = "";
    // 每股发行价(元)
    public String perSharePrice = "";
    // 发行费用(元)
    public String issueCost = "";
    // 发行总市值(元)
    public String marketValue = "";
    // 募集资金净额(元)
    public String placement = "";
    // 首日开盘价(元)
    public String openPriceFirstDay = "";
    // 首日收盘价(元)
    public String closePriceFirstDay = "";
    // 首日换手率
    public String turnoverRateFirstDay = "";
    // 首日最高价(元)
    public String maxPriceFirstDay = "";
    // 网下配售中签率
    public String offlineLotWinningRate = "";
    // 定价中签率
    public String pricingLotWinningRate = "";

    public Company(){

    }

    public Company(JSONObject json) {
        this.stockType = "GEM";
        this.stockCode = StringUtils.notEmptyStr(json.getString("agdm"), json.getString("bgdm"), json.getString("hgdm")).substring(0,6);
        this.stockShortName = StringUtils.notEmptyStr(json.getString("agjc"), json.getString("bgjc"), json.getString("bgjc"));
        this.officeAddress = json.getString("bgdz");
        this.fax = json.getString("cz");
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
        this.businessScope = json.getString("jyfw");
        this.accountingFirm = json.getString("kjssws");
        this.lawOffice = json.getString("lssws");
        this.contact = json.getString("lxdh");
        this.exchange = json.getString("ssjys");
        this.industry = json.getString("sszjhhy");
        this.englishName = json.getString("ywmc");
        this.registerAddress = json.getString("zcdz");
        this.capital = json.getString("zczb");
        this.bondType = json.getString("zqlb");
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

    public Company(Map<String, String> map) {
        this.stockType = "NEEQ";
        this.stockCode = map.get("证券代码").substring(0,6);;
        this.listingDate = map.get("挂牌日期");
        this.transfer = map.get("转让方式");
        this.circulation = map.get("总股本(万股)");
        this.listingSupervision = map.get("推荐挂牌券商");
        this.companyName = map.get("公司全称");
        this.establishDate = map.get("成立日期");
        this.chairman = map.get("实际控制人");
        this.legalPerson = map.get("法人代表");
        this.contact = map.get("公司电话");
        this.email = map.get("公司邮箱");
        this.accountingFirm = map.get("会记事务所");
        this.businessScope = map.get("主营业务");
        this.industry = map.get("行业分类");
        this.registerAddress = map.get("注册地址");
        this.officeAddress = map.get("办公地址");
        this.brief = map.get("公司简介");
        this.stockShortName = map.get("证券简称");
        this.firstTradeDate = map.get("首次交易日");
        this.level = map.get("市场分层");
        this.flowEquity = map.get("流通股本(万股)");
        this.supervision = map.get("持续督导券商");
        this.capital = map.get("注册资本(亿元)");
        this.employeeNum = NumberUtils.parseInt(map.get("员工总数"));
        this.secretary = map.get("公司董秘");
        this.fax = map.get("公司传真");
        this.website = map.get("公司网址");
        this.lawOffice = map.get("律师事务所");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Company{");
        sb.append("companyName='").append(companyName).append('\'');
        sb.append(", stockCode='").append(stockCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}