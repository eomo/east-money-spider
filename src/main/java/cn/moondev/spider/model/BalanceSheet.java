package cn.moondev.spider.model;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 资产负债表
 */
public class BalanceSheet {

    // 股票代码
    @JSONField(name="SECURITYCODE")
    public String securityCode;

    // 日期
    @JSONField(name = "REPORTDATE")
    public String reportDate;

    // 日期类型
    public String dateType;

    //**************************************************
    //******************** 流动资产 *********************
    //**************************************************
    // 货币资金
    @JSONField(name = "MONETARYFUND")
    public long monetaryFund;
    // 结算备付金
    @JSONField(name = "SETTLEMENTPROVISION")
    public long settlementProvision;
    // 拆出资金
    @JSONField(name = "LENDFUND")
    public long lendFund;
    // 以公允价值计量且其变动计入当期损益的金融资产
    @JSONField(name = "FVALUEFASSET")
    public long fairValueFinancialAsset;
    // 交易性金融资产
    @JSONField(name = "TRADEFASSET")
    public long tradeFinancialAsset;
    // 指定为以公允价值计量且其变动计入当期损益的金融资产
    @JSONField(name = "DEFINEFVALUEFASSET")
    public long defineFairValueFinancialAsset;
    // 应收票据
    @JSONField(name = "BILLREC")
    public long billReceivable;
    // 应收账款
    @JSONField(name = "ACCOUNTREC")
    public long accountsReceivable;
    // 预付款项
    @JSONField(name = "ADVANCEPAY")
    public long prepayments;
    // 应收保费
    @JSONField(name = "PREMIUMREC")
    public long premiumsReceivable;
    // 应收分保账款(指公司开展分保业务而发生的各种应收款项)
    @JSONField(name = "RIREC")
    public long accountsReceivableReinsurance;
    // 应收分保合同准备金
    @JSONField(name = "RICONTACTRESERVEREC")
    public long receivableReinsuranceContractReserve;
    // 应收利息
    @JSONField(name = "INTERESTREC")
    public long interestReceivable;
    // 应收股利
    @JSONField(name = "DIVIDENDREC")
    public long dividendReceivable;
    // 其他应收款
    @JSONField(name = "OTHERREC")
    public long otherReceivable;
    // 应收出口退税
    @JSONField(name = "EXPORTREBATEREC")
    public long receivableExportTaxRebate;
    // 应收补贴款
    @JSONField(name = "SUBSIDYREC")
    public long subsidyReceivable;
    // 内部应收款
    @JSONField(name = "INTERNALREC")
    public long internalReceivable;
    // 买入返售金融资产
    @JSONField(name = "BUYSELLBACKFASSET")
    public long buyBackResaleFinancialAsset;
    // 存货
    @JSONField(name = "INVENTORY")
    public long inventory;
    // 划分为持有待售的资产
    @JSONField(name = "CLHELDSALEASS")
    public long assetsHeldForSale;
    // 一年内到期的非流动资产
    @JSONField(name = "NONLASSETONEYEAR")
    public long nonLiquidAssetOneYear;
    // 其他流动资产
    @JSONField(name = "OTHERLASSET")
    public long otherLiquidAsset;
    // 流动资产合计
    @JSONField(name = "SUMLASSET")
    public long sumLiquidAsset;

    //**************************************************
    //******************* 非流动资产 ********************
    //**************************************************
    // 发放委托贷款及垫款
    @JSONField(name = "LOANADVANCES")
    public long loanAdvances;
    // 可供出售金融资产
    @JSONField(name = "SALEABLEFASSET")
    public long saleableFinancialAsset;
    // 持有至到期的投资
    @JSONField(name = "HELDMATURITYINV")
    public long heldMaturityInvestment;
    // 长期应收款
    @JSONField(name = "LTREC")
    public long longTermReceivable;
    // 长期股权投资
    @JSONField(name = "LTEQUITYINV")
    public long longTermEquityInvestment;
    // 投资性房地产
    @JSONField(name = "ESTATEINVEST")
    public long estateInvestment;
    // 固定资产
    @JSONField(name = "FIXEDASSET")
    public long fixedAsset;
    // 在建工程
    @JSONField(name = "CONSTRUCTIONPROGRESS")
    public long constructionInProgress;
    // 工程物资
    @JSONField(name = "CONSTRUCTIONMATERIAL")
    public long constructionMaterial;
    // 固定资产清理
    @JSONField(name = "LIQUIDATEFIXEDASSET")
    public long liquidateFixedAsset;
    // 生产性生物资产
    @JSONField(name = "PRODUCTBIOLOGYASSET")
    public long productBiologyAsset;
    // 油气资产
    @JSONField(name = "OILGASASSET")
    public long oilGasAsset;
    // 无形资产
    @JSONField(name = "INTANGIBLEASSET")
    public long intangibleAsset;
    // 开发支出
    @JSONField(name = "DEVELOPEXP")
    public long developexp;
    // 商誉
    @JSONField(name = "GOODWILL")
    public long goodwill;
    // 长期待摊费用
    @JSONField(name = "LTDEFERASSET")
    public long longTermDeferAsset;
    // 递延所得税资产
    @JSONField(name = "DEFERINCOMETAXASSET")
    public long deferredIncomeTaxAsset;
    // 其他非流动资产
    @JSONField(name = "OTHERNONLASSET")
    public long otherNonLiquidAsset;
    // 非流动资产合计
    @JSONField(name = "SUMNONLASSET")
    public long sumNonLiquidAsset;
    // 资产总计
    @JSONField(name = "SUMASSET")
    public long sumAsset;

    //**************************************************
    //********************* 流动负债 ********************
    //**************************************************
    // 短期借款
    @JSONField(name = "STBORROW")
    public long shortTermLoan;
    // 向中央银行借款
    @JSONField(name = "BORROWFROMCBANK")
    public long loanFromCenterBank;
    // 吸收存款及同业存放
    @JSONField(name = "DEPOSIT")
    public long deposit;
    // 拆入资金
    @JSONField(name = "BORROWFUND")
    public long loanFromOtherBank;
    // 以公允价值计量且其变动计入当期损益的金融负债
    @JSONField(name = "FVALUEFLIAB")
    public long fairValueFinancialLiabilities;
    // 其中：交易性金融负债
    @JSONField(name = "TRADEFLIAB")
    public long tradeFinancialLiabilities;
    // 指定以公允价值计量且其变动计入当期损益的金融负债
    @JSONField(name = "DEFINEFVALUEFLIAB")
    public long defineFairValueFinancialLiabilities;
    // 应付票据
    @JSONField(name = "BILLPAY")
    public long billPayable;
    // 应付账款
    @JSONField(name = "ACCOUNTPAY")
    public long accountsPayable;
    // 预收款项
    @JSONField(name = "ADVANCERECEIVE")
    public long advancesReceived;
    // 卖出回购金融资产款
    @JSONField(name = "SELLBUYBACKFASSET")
    public long financialAssetsSoldForRepurchase;
    // 应付手续费及佣金
    @JSONField(name = "COMMPAY")
    public long feeCommissionPayable;
    // 应付职工薪酬
    @JSONField(name = "SALARYPAY")
    public long salaryPayable;
    // 应交税费
    @JSONField(name = "TAXPAY")
    public long taxPayable;
    // 应付利息
    @JSONField(name = "INTERESTPAY")
    public long interestIned;
    // 应付股利
    @JSONField(name = "DIVIDENDPAY")
    public long dividendsPayable;
    // 应付分保账款 ripay
    @JSONField(name = "RIPAY")
    public long accountsPayableReinsurance;
    // 内部应付款
    @JSONField(name = "INTERNALPAY")
    public long internalPayable;
    // 其他应付款
    @JSONField(name = "OTHERPAY")
    public long otherPayable;
    // 预计流动负债
    @JSONField(name = "ANTICIPATELLIAB")
    public long anticipateCashLiabilities;
    // 保险合同准备金
    @JSONField(name = "CONTACTRESERVE")
    public long reserveFundForInsuranceContracts;
    // 代理买卖证券款
    @JSONField(name = "AGENTTRADESECURITY")
    public long actingTradingSecurities;
    // 代理承销证券款
    @JSONField(name = "AGENTUWSECURITY")
    public long actingUnderwritingSecurities;
    // 一年内的递延收益
    @JSONField(name = "DEFERINCOMEONEYEAR")
    public long deferredIncomeOneYear;
    // 应付短期债券
    @JSONField(name = "STBONDREC")
    public long shortTermBondsPayable;
    // 划分为持有待售的负债
    @JSONField(name = "CLHELDSALELIAB")
    public long liabilitiesForSale;
    // 一年内到期的非流动负债
    @JSONField(name = "NONLLIABONEYEAR")
    public long nonCashLiabilitiesOneYear;
    // 其他流动负债
    @JSONField(name = "OTHERLLIAB")
    public long otherCashLiabilities;
    // 流动负债合计
    @JSONField(name = "SUMLLIAB")
    public long sumCashLiabilities;

    //**************************************************
    //******************** 非流动负债 *******************
    //**************************************************
    // 长期借款
    @JSONField(name = "LTBORROW")
    public long longTermLoan;
    // 应付债券
    @JSONField(name = "BONDPAY")
    public long bondPayable;
    // 应付债券 - 优先股
    @JSONField(name = "PREFERSTOCBOND")
    public long preferStockBond;
    // 应付债券 - 永续股
    @JSONField(name = "SUSTAINBOND")
    public long sustainStockBond;
    // 长期应付款
    @JSONField(name = "LTACCOUNTPAY")
    public long longTermAccountPayable;
    // 长期应付职工薪酬
    @JSONField(name = "LTSALARYPAY")
    public long longTermSalaryPayable;
    // 专项应付款
    @JSONField(name = "SPECIALPAY")
    public long accountPayableSpecialFunds;
    // 预计负债
    @JSONField(name = "ANTICIPATELIAB")
    public long estimatedLiabilities;
    // 递延收益
    @JSONField(name = "DEFERINCOME")
    public long deferredIncome;
    // 递延所得税负债
    @JSONField(name = "DEFERINCOMETAXLIAB")
    public long deferredTaxLiability;
    // 其他非流动负债
    @JSONField(name = "OTHERNONLLIAB")
    public long otherNonCurrentLiabilities;
    // 非流动负债合计
    @JSONField(name = "SUMNONLLIAB")
    public long sumNonCurrentLiabilities;
    // 负债合计
    @JSONField(name = "SUMLIAB")
    public long sumLiabilities;

    //************************************************************
    //******************** 所有者权益(或股东权益) *******************
    //************************************************************
    // 实收资本（或股本
    @JSONField(name = "SHARECAPITAL")
    public long paidInCapital;
    // 其他权益工具
    @JSONField(name = "OTHEREQUITY")
    public long otherEquity;
    // 其他权益工具 - 优先股
    @JSONField(name = "PREFERREDSTOCK")
    public long preferredtock;
    // 其他权益工具 - 永续债
    @JSONField(name = "SUSTAINABLEDEBT")
    public long sustainableDebt;
    // 其他权益工具 - 其他权益工具
    @JSONField(name = "OTHEREQUITYOTHER")
    public long otherEquityOther;
    // 资本公积
    @JSONField(name = "CAPITALRESERVE")
    public long capitalReserve;
    // 库存股
    @JSONField(name = "INVENTORYSHARE")
    public long inventoryShare;
    // 专项储备
    @JSONField(name = "SPECIALRESERVE")
    public long specialReserve;
    // 盈余公积
    @JSONField(name = "SURPLUSRESERVE")
    public long surplusReserve;
    // 一般风险准备
    @JSONField(name = "GENERALRISKPREPARE")
    public long generalRiskPrepare;
    // 未确定的投资损失
    @JSONField(name = "UNCONFIRMINVLOSS")
    public long unconfirmInvestmentLoss;
    // 未分配利润
    @JSONField(name = "RETAINEDEARNING")
    public long undistributedProfit;
    // 拟分配现金股利
    @JSONField(name = "PLANCASHDIVI")
    public long plancashdivi;
    // 外币报表折算差额
    @JSONField(name = "DIFFCONVERSIONFC")
    public long diffconversionfc;
    // 归属于母公司股东权益合计
    @JSONField(name = "SUMPARENTEQUITY")
    public long sumParentEquity;
    // 少数股东权益
    @JSONField(name = "MINORITYEQUITY")
    public long minorityEquity;
    // 股东权益合计
    @JSONField(name = "SUMSHEQUITY")
    public long sumshequity;
    // 负债和股东权益合计
    @JSONField(name = "SUMLIABSHEQUITY")
    public long sumliabshequity;


    public BalanceSheet() {

    }
}
