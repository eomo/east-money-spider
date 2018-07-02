package cn.moondev.spider.model;

import cn.moondev.spider.utils.NumberUtils;
import cn.moondev.spider.utils.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Strings;

/**
 * 利润表(损益表)
 */
public class IncomeStatement {

    // 日期类型
    public String dateType;

    // 股票代码
    public String stockCode;

    // 日期
    public String reportDate;

    // 股票类型
    public String stockType;
    //*******************************************
    //************* 1.营业收入********************
    //*******************************************
    // 营业总收入
    public long grossRevenue;

    // 营业收入
    public long operatingReceipt;

    // 利息收入
    public long interestRevenue;

    // 已赚保费
    public long premiumEarned;

    // 手续费及佣金收入
    public long commreve;

    // 其他业务收入
    public long otherRevenue;

    // 营业总收入其他项目(新三板)
    public long grossRevenueOther;

    //*******************************************
    //************* 2.营业成本********************
    //*******************************************
    // 营业总成本
    public long totalOperatingCost;

    // 营业成本
    public long operatingCost;

    // 利息支出
    public long interestExp;

    // 手续费及佣金支出
    public long commissionExp;

    // 研发费用
    public long rdExp;

    // 退保金
    public long surrenderPremium;

    // 赔付支出净额
    public long netIndemnityExp;

    // 提取保险合同准备金净额
    public long netContractReserve;

    // 保单红利支出
    public long expendituresDividendPolicy;

    // 分保费用
    public long amortizedReinsuranceExp;

    // 其他业务成本
    public long otherExp;

    // 营业税金及附加
    public long salesTax;

    // 销售费用
    public long salesExp;

    // 管理费用
    public long manageExp;

    // 财务费用
    public long financialExp;

    // 资产减值损失
    public long assetValueLoss;

    // 营业总成本其他项目(新三板)
    public long operatingCostOther;

    //*******************************************
    //************* 3.其他经营收益****************
    //*******************************************
    // 其他经营收益
    // 加:公允价值变动收益
    public long fairValueIncome;

    // 投资收益
    public long investmentIncome;

    // 其中:对联营企业和合营企业的投资收益
    public long investmentJoinIncome;

    // 汇兑收益
    public long exchangeIncome;

    //*******************************************
    //************* 4.营业利润********************
    //*******************************************
    // 营业利润
    public long operatingProfit;

    // 加:营业外收入
    public long nonBusinessRevenue;

    // 营业外收入中，非流动资产处置利得
    public long nonCurrentAssetRevenue;

    // 减:营业外支出
    public long nonBusinessExp;

    // 营业外支出中，非流动资产处置净损失
    public long nonCurrentAssetLoss;

    // 营业利润其他项目(新三板)
    public long operatingProfitOther;
    // 营业利润平衡项目(新三板)
    public long operatingProfitBalance;

    //*******************************************
    //************* 5.利润总额********************
    //*******************************************
    // 利润总额
    public long sumProfit;

    // 减:所得税费用
    public long incomeTax;

    // 加:影响利润总额的其他项目(新三板)
    public long sumProfitOther;

    // 利润总额平衡项目(新三板)
    public long sumProfitBalance;

    // 被合并方在合并前实现利润
    public long combinedNetProfit;

    //*******************************************
    //************* 6.净利润**********************
    //*******************************************
    // 净利润（利润总额-所得税费用-被合并方在合并前实现利润）
    public long netProfit;

    // 其中:归属于母公司股东的净利润
    public long parentNetProfit;

    // 少数股东损益
    public long minorityIncome;

    // 扣除非经常性损益后的净利润
    public long netProfitAfterLoss;

    // 加:影响净利润的其他项目(新三板)
    public long plusNetProfitOther;

    // 未确认投资损失(新三板)
    public long unconfirmInvestLoss;

    // 净利润其他项目(新三板)
    public long minusNetProfitOther;

    // 净利润差额(合计平衡项目)
    public long netProfitBalance;

    //*********************************************
    //************* 7.每股收益**********************
    //*********************************************
    // 基本每股收益
    public long basicEps;

    // 稀释每股收益
    public long dilutedEps;

    //*********************************************
    //************* 8.其他综合收益******************
    //*********************************************
    // 其他综合收益
    public long oci;

    // 归属于母公司股东的其他综合收益
    public long parentCompanyOCI;

    // 归属于少数股东的其他综合收益
    public long minorityShareholderOCI;

    //*********************************************
    //************* 9.综合收益综合******************
    //*********************************************
    // 综合收益总额
    public long sumci;

    // 归属于母公司所有者的综合收益总额
    public long parentCompayCI;

    // 归属于少数股东的综合收益总额
    public long minorityShareholderCI;

    public IncomeStatement() {

    }

    public IncomeStatement(JSONObject json) {
        this.stockCode = json.getString("SECURITYCODE");
        if (!Strings.isNullOrEmpty(this.stockCode)) {
            this.stockCode = this.stockCode.substring(0, 6);
        }
        this.reportDate = StringUtils.convertReportDate(json.getString("REPORTDATE"));
        this.grossRevenue = NumberUtils.convertCent(json.getString("TOTALOPERATEREVE"));
        this.operatingReceipt = NumberUtils.convertCent(json.getString("OPERATEREVE"));
        this.interestRevenue = NumberUtils.convertCent(json.getString("INTREVE"));
        this.premiumEarned = NumberUtils.convertCent(json.getString("PREMIUMEARNED"));
        this.commreve = NumberUtils.convertCent(json.getString("COMMREVE"));
        this.otherRevenue = NumberUtils.convertCent(json.getString("OTHERREVE"));
        this.totalOperatingCost = NumberUtils.convertCent(json.getString("TOTALOPERATEEXP"));
        this.operatingCost = NumberUtils.convertCent(json.getString("OPERATEEXP"));
        this.interestExp = NumberUtils.convertCent(json.getString("INTEXP"));
        this.commissionExp = NumberUtils.convertCent(json.getString("COMMEXP"));
        this.rdExp = NumberUtils.convertCent(json.getString("RDEXP"));
        this.surrenderPremium = NumberUtils.convertCent(json.getString("SURRENDERPREMIUM"));
        this.netIndemnityExp = NumberUtils.convertCent(json.getString("NETINDEMNITYEXP"));
        this.netContractReserve = NumberUtils.convertCent(json.getString("NETCONTACTRESERVE"));
        this.expendituresDividendPolicy = NumberUtils.convertCent(json.getString("POLICYDIVIEXP"));
        this.amortizedReinsuranceExp = NumberUtils.convertCent(json.getString("RIEXP"));
        this.otherExp = NumberUtils.convertCent(json.getString("OTHEREXP"));
        this.salesTax = NumberUtils.convertCent(json.getString("OPERATETAX"));
        this.salesExp = NumberUtils.convertCent(json.getString("SALEEXP"));
        this.manageExp = NumberUtils.convertCent(json.getString("MANAGEEXP"));
        this.financialExp = NumberUtils.convertCent(json.getString("FINANCEEXP"));
        this.assetValueLoss = NumberUtils.convertCent(json.getString("ASSETDEVALUELOSS"));
        this.fairValueIncome = NumberUtils.convertCent(json.getString("FVALUEINCOME"));
        this.investmentIncome = NumberUtils.convertCent(json.getString("INVESTINCOME"));
        this.investmentJoinIncome = NumberUtils.convertCent(json.getString("INVESTJOINTINCOME"));
        this.exchangeIncome = NumberUtils.convertCent(json.getString("EXCHANGEINCOME"));
        this.operatingProfit = NumberUtils.convertCent(json.getString("OPERATEPROFIT"));
        this.nonBusinessRevenue = NumberUtils.convertCent(json.getString("NONOPERATEREVE"));
        if (StockType.GEM.toString().equals(stockType)) {
            this.nonCurrentAssetRevenue = NumberUtils.convertCent(json.getString("NONLASSETREVE"));
        } else {
            this.nonCurrentAssetRevenue = NumberUtils.convertCent(json.getString("FLDZCCZLD"));
        }
        this.nonBusinessExp = NumberUtils.convertCent(json.getString("NONOPERATEEXP"));
        this.nonCurrentAssetLoss = NumberUtils.convertCent(json.getString("NONLASSETNETLOSS"));
        this.sumProfit = NumberUtils.convertCent(json.getString("SUMPROFIT"));
        this.incomeTax = NumberUtils.convertCent(json.getString("INCOMETAX"));
        this.combinedNetProfit = NumberUtils.convertCent(json.getString("COMBINEDNETPROFITB"));
        this.netProfit = NumberUtils.convertCent(json.getString("NETPROFIT"));
        this.parentNetProfit = NumberUtils.convertCent(json.getString("PARENTNETPROFIT"));
        this.minorityIncome = NumberUtils.convertCent(json.getString("MINORITYINCOME"));
        this.netProfitAfterLoss = NumberUtils.convertCent(json.getString("KCFJCXSYJLR"));
        this.basicEps = NumberUtils.convertCent(json.getString("BASICEPS"));
        this.dilutedEps = NumberUtils.convertCent(json.getString("DILUTEDEPS"));
        this.oci = NumberUtils.convertCent(json.getString("OTHERCINCOME"));
        this.parentCompanyOCI = NumberUtils.convertCent(json.getString("PARENTOTHERCINCOME"));
        this.minorityShareholderOCI = NumberUtils.convertCent(json.getString("MINORITYOTHERCINCOME"));
        this.sumci = NumberUtils.convertCent(json.getString("SUMCINCOME"));
        this.parentCompayCI = NumberUtils.convertCent(json.getString("PARENTCINCOME"));
        this.minorityShareholderCI = NumberUtils.convertCent(json.getString("MINORITYCINCOME"));
        this.grossRevenueOther = NumberUtils.convertCent(json.getString("TOTALOPERATEREVEOTHER"));
        this.operatingCostOther = NumberUtils.convertCent(json.getString("TOTALOPERATEEXPOTHER"));
        this.operatingProfitOther = NumberUtils.convertCent(json.getString("OPERATEPROFITOTHER"));
        this.operatingProfitBalance = NumberUtils.convertCent(json.getString("OPERATEPROFITBALANCE"));
        this.sumProfitOther = NumberUtils.convertCent(json.getString("SUMPROFITOTHER"));
        this.sumProfitBalance = NumberUtils.convertCent(json.getString("SUMPROFITBALANCE"));
        this.plusNetProfitOther = NumberUtils.convertCent(json.getString("NETPROFITOTHER1"));
        this.unconfirmInvestLoss = NumberUtils.convertCent(json.getString("UNCONFIRMINVLOSS"));
        this.minusNetProfitOther = NumberUtils.convertCent(json.getString("NETPROFITOTHER2"));
        this.netProfitBalance = NumberUtils.convertCent(json.getString("NETPROFITBALANCE1"));
    }
}
