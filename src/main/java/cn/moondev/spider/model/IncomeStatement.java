package cn.moondev.spider.model;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 利润表(损益表)
 */
public class IncomeStatement {

    // 日期类型
    public String dateType;

    // 股票代码
    @JSONField(name="SECURITYCODE")
    public String securityCode;

    // 日期
    @JSONField(name = "REPORTDATE")
    public String reportDate;

    // 营业总收入
    @JSONField(name = "TOTALOPERATEREVE")
    public long grossRevenue;

    // 营业收入
    @JSONField(name = "OPERATEREVE")
    public long operatingReceipt;

    // 利息收入
    @JSONField(name = "INTREVE")
    public long interestRevenue;

    // 已赚保费
    @JSONField(name = "PREMIUMEARNED")
    public long premiumEarned;

    // 手续费及佣金收入
    @JSONField(name = "COMMREVE")
    public long commreve;

    // 其他业务收入
    @JSONField(name = "OTHERREVE")
    public long otherRevenue;

    // 营业总成本
    @JSONField(name = "TOTALOPERATEEXP")
    public long totalOperatingCost;

    // 营业成本
    @JSONField(name = "OPERATEEXP")
    public long operatingCost;

    // 利息支出
    @JSONField(name = "INTEXP")
    public long interestExp;

    // 手续费及佣金支出
    @JSONField(name = "COMMEXP")
    public long commissionExp;

    // 研发费用
    @JSONField(name = "RDEXP")
    public long rdExp;

    // 退保金
    @JSONField(name = "SURRENDERPREMIUM")
    public long surrenderPremium;

    // 赔付支出净额
    @JSONField(name = "NETINDEMNITYEXP")
    public long netIndemnityExp;

    // 提取保险合同准备金净额
    @JSONField(name = "NETCONTACTRESERVE")
    public long netContractReserve;

    // 保单红利支出
    @JSONField(name = "POLICYDIVIEXP")
    public long expendituresDividendPolicy;

    // 分保费用
    @JSONField(name = "RIEXP")
    public long amortizedReinsuranceExp;

    // 其他业务成本
    @JSONField(name = "OTHEREXP")
    public long otherExp;

    // 营业税金及附加
    @JSONField(name = "OPERATETAX")
    public long salesTax;

    // 销售费用
    @JSONField(name = "SALEEXP")
    public long salesExp;

    // 管理费用
    @JSONField(name = "MANAGEEXP")
    public long manageExp;

    // 财务费用
    @JSONField(name = "FINANCEEXP")
    public long financialExp;

    // 资产减值损失
    @JSONField(name = "ASSETDEVALUELOSS")
    public long assetValueLoss;

    // 其他经营收益
    // 加:公允价值变动收益
    @JSONField(name = "FVALUEINCOME")
    public long fairValueIncome;

    // 投资收益
    @JSONField(name = "INVESTINCOME")
    public long investmentIncome;

    // 其中:对联营企业和合营企业的投资收益
    @JSONField(name = "INVESTJOINTINCOME")
    public long investmentJoinIncome;

    // 汇兑收益
    @JSONField(name = "EXCHANGEINCOME")
    public long exchangeIncome;

    // 营业利润
    @JSONField(name = "OPERATEPROFIT")
    public long operatingProfit;

    // 加:营业外收入
    @JSONField(name = "NONOPERATEREVE")
    public long nonBusinessRevenue;

    // 营业外收入中，非流动资产处置利得
    @JSONField(name = "NONLASSETREVE")
    public long nonCurrentAssetRevenue;

    // 减:营业外支出
    @JSONField(name = "NONOPERATEEXP")
    public long nonBusinessExp;

    // 营业外支出中，非流动资产处置净损失
    @JSONField(name = "NONLASSETNETLOSS")
    public long nonCurrentAssetLoss;

    // 利润总额
    @JSONField(name = "SUMPROFIT")
    public long sumProfit;

    // 减:所得税费用
    @JSONField(name = "INCOMETAX")
    public long incomeTax;

    // 被合并方在合并前实现利润
    @JSONField(name = "COMBINEDNETPROFITB")
    public long combinedNetProfit;

    // 净利润（利润总额-所得税费用-被合并方在合并前实现利润）
    @JSONField(name = "NETPROFIT")
    public long netProfit;

    // 其中:归属于母公司股东的净利润
    @JSONField(name = "PARENTNETPROFIT")
    public long parentNetProfit;

    // 少数股东损益
    @JSONField(name = "MINORITYINCOME")
    public long minorityIncome;

    // 扣除非经常性损益后的净利润
    @JSONField(name = "KCFJCXSYJLR")
    public long netProfitAfterLoss;

    // 基本每股收益
    @JSONField(name = "BASICEPS")
    public long basicEps;

    // 稀释每股收益
    @JSONField(name = "DILUTEDEPS")
    public long dilutedEps;

    // 其他综合收益
    @JSONField(name = "OTHERCINCOME")
    public long oci;

    // 归属于母公司股东的其他综合收益
    @JSONField(name = "PARENTOTHERCINCOME")
    public long parentCompanyOCI;

    // 归属于少数股东的其他综合收益
    @JSONField(name = "MINORITYOTHERCINCOME")
    public long minorityShareholderOCI;

    // 综合收益总额
    @JSONField(name = "SUMCINCOME")
    public long sumci;

    // 归属于母公司所有者的综合收益总额
    @JSONField(name = "PARENTCINCOME")
    public long parentCompayCI;

    // 归属于少数股东的综合收益总额
    @JSONField(name = "MINORITYCINCOME")
    public long minorityShareholderCI;
}
