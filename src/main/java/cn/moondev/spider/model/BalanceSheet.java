package cn.moondev.spider.model;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 资产负债表
 */
public class BalanceSheet {

    //**************************************************
//******************** 流动资产 *********************
//**************************************************
    // 货币资金
    @JSONField(name = "MONETARYFUND")
    public float monetaryFund;
    // 结算备付金
    @JSONField(name = "SETTLEMENTPROVISION")
    public float settlementProvision;
    // 拆出资金
    @JSONField(name = "LENDFUND")
    public float lendFund;
    // 以公允价值计量且其变动计入当期损益的金融资产
    @JSONField(name = "FVALUEFASSET")
    public float fairValueFinancialAsset;
    // 交易性金融资产
    @JSONField(name = "TRADEFASSET")
    public float tradeFinancialAsset;
    // 指定为以公允价值计量且其变动计入当期损益的金融资产
    @JSONField(name = "DEFINEFVALUEFASSET")
    public float defineFairValueFinancialAsset;
    // 应收票据
    @JSONField(name = "BILLREC")
    public float billReceivable;
    // 应收账款
    @JSONField(name = "ACCOUNTREC")
    public float accountsReceivable;
    // 预付款项
    @JSONField(name = "ADVANCEPAY")
    public float prepayments;
    // 应收保费
    @JSONField(name = "PREMIUMREC")
    public float premiumsReceivable;
    // 应收分保账款(指公司开展分保业务而发生的各种应收款项)
    @JSONField(name = "RIREC")
    public float accountsReceivableReinsurance;
    // 应收分保合同准备金
    @JSONField(name = "RICONTACTRESERVEREC")
    public float receivableReinsuranceContractReserve;
    // 应收利息
    @JSONField(name = "INTERESTREC")
    public float interestReceivable;
    // 应收股利
    @JSONField(name = "DIVIDENDREC")
    public float dividendReceivable;
    // 其他应收款
    @JSONField(name = "OTHERREC")
    public float otherReceivable;
    // 应收出口退税
    @JSONField(name = "EXPORTREBATEREC")
    public float receivableExportTaxRebate;
    // 应收补贴款
    @JSONField(name = "SUBSIDYREC")
    public float subsidyReceivable;
    // 内部应收款
    @JSONField(name = "INTERNALREC")
    public float internalReceivable;
    // 买入返售金融资产
    @JSONField(name = "BUYSELLBACKFASSET")
    public float buyBackResaleFinancialAsset;
    // 存货
    @JSONField(name = "INVENTORY")
    public float inventory;
    // 划分为持有待售的资产
    @JSONField(name = "CLHELDSALEASS")
    public float assetsHeldForSale;
    // 一年内到期的非流动资产
    @JSONField(name = "NONLASSETONEYEAR")
    public float nonLiquidAssetOneYear;
    // 其他流动资产
    @JSONField(name = "OTHERLASSET")
    public float otherLiquidAsset;
    // 流动资产合计
    @JSONField(name = "SUMLASSET")
    public float sumLiquidAsset;

    //**************************************************
//******************* 非流动资产 ********************
//**************************************************
    // 发放委托贷款及垫款
    @JSONField(name = "LOANADVANCES")
    public float loanAdvances;
    // 可供出售金融资产
    @JSONField(name = "SALEABLEFASSET")
    public float saleableFinancialAsset;
    // 持有至到期的投资
    @JSONField(name = "HELDMATURITYINV")
    public float heldMaturityInvestment;
    // 长期应收款
    @JSONField(name = "LTREC")
    public float longTermReceivable;
    // 长期股权投资
    @JSONField(name = "LTEQUITYINV")
    public float longTermEquityInvestment;
    // 投资性房地产
    @JSONField(name = "ESTATEINVEST")
    public float estateInvestment;
    // 固定资产
    @JSONField(name = "FIXEDASSET")
    public float fixedAsset;
    // 在建工程
    @JSONField(name = "CONSTRUCTIONPROGRESS")
    public float constructionInProgress;
    // 工程物资
    @JSONField(name = "CONSTRUCTIONMATERIAL")
    public float constructionMaterial;
    // 固定资产清理
    @JSONField(name = "LIQUIDATEFIXEDASSET")
    public float liquidateFixedAsset;
    // 生产性生物资产
    @JSONField(name = "PRODUCTBIOLOGYASSET")
    public float productBiologyAsset;
    // 油气资产
    @JSONField(name = "OILGASASSET")
    public float oilGasAsset;
    // 无形资产
    @JSONField(name = "INTANGIBLEASSET")
    public float intangibleAsset;
    // 开发支出
    @JSONField(name = "DEVELOPEXP")
    public float developexp;
    // 商誉
    @JSONField(name = "GOODWILL")
    public float goodwill;
    // 长期待摊费用
    @JSONField(name = "LTDEFERASSET")
    public float longTermDeferAsset;
    // 递延所得税资产
    @JSONField(name = "DEFERINCOMETAXASSET")
    public float deferredIncomeTaxAsset;
    // 其他非流动资产
    @JSONField(name = "OTHERNONLASSET")
    public float otherNonLiquidAsset;
    // 非流动资产合计
    @JSONField(name = "SUMNONLASSET")
    public float sumNonLiquidAsset;
    // 资产总计
    @JSONField(name = "SUMASSET")
    public float sumAsset;

    //**************************************************
//********************* 流动负债 ********************
//**************************************************
    // 短期借款
    @JSONField(name = "STBORROW")
    public float shortTermLoan;
    // 向中央银行借款
    @JSONField(name = "BORROWFROMCBANK")
    public float loanFromCenterBank;
    // 吸收存款及同业存放
    @JSONField(name = "DEPOSIT")
    public float deposit;
    // 拆入资金
    @JSONField(name = "BORROWFUND")
    public float loanFromOtherBank;
    // 以公允价值计量且其变动计入当期损益的金融负债
    @JSONField(name = "FVALUEFLIAB")
    public float fairValueFinancialLiabilities;
    // 其中：交易性金融负债
    @JSONField(name = "TRADEFLIAB")
    public float tradeFinancialLiabilities;
    // 指定以公允价值计量且其变动计入当期损益的金融负债
    @JSONField(name = "DEFINEFVALUEFLIAB")
    public float defineFairValueFinancialLiabilities;
    // 应付票据
    @JSONField(name = "BILLPAY")
    public float billPayable;
    // 应付账款
    @JSONField(name = "ACCOUNTPAY")
    public float accountsPayable;
    // 预收款项
    @JSONField(name = "ADVANCERECEIVE")
    public float advancesReceived;
    // 卖出回购金融资产款
    @JSONField(name = "SELLBUYBACKFASSET")
    public float financialAssetsSoldForRepurchase;
    // 应付手续费及佣金
    @JSONField(name = "COMMPAY")
    public float feeCommissionPayable;
    // 应付职工薪酬
    @JSONField(name = "SALARYPAY")
    public float salaryPayable;
    // 应交税费
    @JSONField(name = "TAXPAY")
    public float taxPayable;
    // 应付利息
    @JSONField(name = "INTERESTPAY")
    public float interestIned;
    // 应付股利
    @JSONField(name = "DIVIDENDPAY")
    public float dividendsPayable;
    // 应付分保账款 ripay
    @JSONField(name = "RIPAY")
    public float accountsPayableReinsurance;
    // 内部应付款
    @JSONField(name = "INTERNALPAY")
    public float internalPayable;
    // 其他应付款
    @JSONField(name = "OTHERPAY")
    public float otherPayable;
    // 预计流动负债
    @JSONField(name = "ANTICIPATELLIAB")
    public float anticipateCashLiabilities;
    // 保险合同准备金
    @JSONField(name = "CONTACTRESERVE")
    public float reserveFundForInsuranceContracts;
    // 代理买卖证券款
    @JSONField(name = "AGENTTRADESECURITY")
    public float actingTradingSecurities;
    // 代理承销证券款
    @JSONField(name = "AGENTUWSECURITY")
    public float actingUnderwritingSecurities;
    // 一年内的递延收益
    @JSONField(name = "DEFERINCOMEONEYEAR")
    public float deferredIncomeOneYear;
    // 应付短期债券
    @JSONField(name = "STBONDREC")
    public float shortTermBondsPayable;
    // 划分为持有待售的负债
    @JSONField(name = "CLHELDSALELIAB")
    public float liabilitiesForSale;
    // 一年内到期的非流动负债
    @JSONField(name = "NONLLIABONEYEAR")
    public float nonCashLiabilitiesOneYear;
    // 其他流动负债
    @JSONField(name = "OTHERLLIAB")
    public float otherCashLiabilities;
    // 流动负债合计
    @JSONField(name = "SUMLLIAB")
    public float sumCashLiabilities;

    //**************************************************
//******************** 非流动负债 *******************
//**************************************************
    // 长期借款
    @JSONField(name = "LTBORROW")
    public float longTermLoan;
    // 应付债券
    @JSONField(name = "BONDPAY")
    public float bondPayable;
    // 应付债券 - 优先股
    @JSONField(name = "PREFERSTOCBOND")
    public float preferStockBond;
    // 应付债券 - 永续股
    @JSONField(name = "SUSTAINBOND")
    public float sustainStockBond;
    // 长期应付款
    @JSONField(name = "LTACCOUNTPAY")
    public float longTermAccountPayable;
    // 长期应付职工薪酬
    @JSONField(name = "LTSALARYPAY")
    public float longTermSalaryPayable;
    // 专项应付款
    @JSONField(name = "SPECIALPAY")
    public float accountPayableSpecialFunds;
    // 预计负债
    @JSONField(name = "ANTICIPATELIAB")
    public float estimatedLiabilities;
    // 递延收益
    @JSONField(name = "DEFERINCOME")
    public float deferredIncome;
    // 递延所得税负债
    @JSONField(name = "DEFERINCOMETAXLIAB")
    public float deferredTaxLiability;
    // 其他非流动负债
    @JSONField(name = "OTHERNONLLIAB")
    public float otherNonCurrentLiabilities;
    // 非流动负债合计
    @JSONField(name = "SUMNONLLIAB")
    public float sumNonCurrentLiabilities;
    // 负债合计
    @JSONField(name = "SUMLIAB")
    public float sumLiabilities;

    //************************************************************
//******************** 所有者权益(或股东权益) *******************
//************************************************************
    // 实收资本（或股本
    @JSONField(name = "SHARECAPITAL")
    public float paidInCapital;
    // 其他权益工具
    @JSONField(name = "OTHEREQUITY")
    public float otherEquity;
    // 其他权益工具 - 优先股
    @JSONField(name = "PREFERREDSTOCK")
    public float preferredtock;
    // 其他权益工具 - 永续债
    @JSONField(name = "SUSTAINABLEDEBT")
    public float sustainableDebt;
    // 其他权益工具 - 其他权益工具
    @JSONField(name = "OTHEREQUITYOTHER")
    public float otherEquityOther;
    // 资本公积
    @JSONField(name = "CAPITALRESERVE")
    public float capitalReserve;
    // 库存股
    @JSONField(name = "INVENTORYSHARE")
    public float inventoryShare;
    // 专项储备
    @JSONField(name = "SPECIALRESERVE")
    public float specialReserve;
    // 盈余公积
    @JSONField(name = "SURPLUSRESERVE")
    public float surplusReserve;
    // 一般风险准备
    @JSONField(name = "GENERALRISKPREPARE")
    public float generalRiskPrepare;
    // 未确定的投资损失
    @JSONField(name = "UNCONFIRMINVLOSS")
    public float unconfirmInvestmentLoss;
    // 未分配利润
    @JSONField(name = "RETAINEDEARNING")
    public float undistributedProfit;
    // 拟分配现金股利
    @JSONField(name = "PLANCASHDIVI")
    public float plancashdivi;
    // 外币报表折算差额
    @JSONField(name = "DIFFCONVERSIONFC")
    public float diffconversionfc;
    // 归属于母公司股东权益合计
    @JSONField(name = "SUMPARENTEQUITY")
    public float sumParentEquity;
    // 少数股东权益
    @JSONField(name = "MINORITYEQUITY")
    public float minorityEquity;
    // 股东权益合计
    @JSONField(name = "SUMSHEQUITY")
    public float sumshequity;
    // 负债和股东权益合计
    @JSONField(name = "SUMLIABSHEQUITY")
    public float sumliabshequity;


    public BalanceSheet() {

    }
}
