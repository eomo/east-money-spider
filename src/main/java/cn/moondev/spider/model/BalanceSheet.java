package cn.moondev.spider.model;

import cn.moondev.spider.utils.NumberUtils;
import cn.moondev.spider.utils.StringUtils;
import com.alibaba.fastjson.JSONObject;

/**
 * 资产负债表
 */
public class BalanceSheet {

    // 股票代码 SECURITYCODE
    public String securityCode;

    // 日期 REPORTDATE
    public String reportDate;

    // 日期类型
    public String dateType;

    // 股票类型
    public String stockType;

    //**************************************************
    //******************** 流动资产 *********************
    //**************************************************
    // 货币资金 MONETARYFUND
    public long monetaryFund;
    // 结算备付金 SETTLEMENTPROVISION
    public long settlementProvision;
    // 拆出资金 LENDFUND
    public long lendFund;
    // 以公允价值计量且其变动计入当期损益的金融资产 FVALUEFASSET
    public long fairValueFinancialAsset;
    // 交易性金融资产 TRADEFASSET
    public long tradeFinancialAsset;
    // 指定为以公允价值计量且其变动计入当期损益的金融资产 DEFINEFVALUEFASSET
    public long defineFairValueFinancialAsset;
    // 应收票据 BILLREC
    public long billReceivable;
    // 应收账款 ACCOUNTREC
    public long accountsReceivable;
    // 预付款项 ADVANCEPAY
    public long prepayments;
    // 应收保费 PREMIUMREC
    public long premiumsReceivable;
    // 应收分保账款(指公司开展分保业务而发生的各种应收款项) RIREC
    public long accountsReceivableReinsurance;
    // 应收分保合同准备金 RICONTACTRESERVEREC
    public long receivableReinsuranceContractReserve;
    // 应收利息 INTERESTREC
    public long interestReceivable;
    // 应收股利 DIVIDENDREC
    public long dividendReceivable;
    // 其他应收款 OTHERREC
    public long otherReceivable;
    // 应收出口退税 EXPORTREBATEREC
    public long receivableExportTaxRebate;
    // 应收补贴款 SUBSIDYREC
    public long subsidyReceivable;
    // 内部应收款 INTERNALREC
    public long internalReceivable;
    // 买入返售金融资产 BUYSELLBACKFASSET
    public long buyBackResaleFinancialAsset;
    // 存货 INVENTORY
    public long inventory;
    // 划分为持有待售的资产 CLHELDSALEASS
    public long assetsHeldForSale;
    // 一年内到期的非流动资产 NONLASSETONEYEAR
    public long nonLiquidAssetOneYear;
    // 其他流动资产 OTHERLASSET
    public long otherLiquidAsset;
    // 流动资产合计 SUMLASSET
    public long sumLiquidAsset;

    //**************************************************
    //******************* 非流动资产 ********************
    //**************************************************
    // 发放委托贷款及垫款 LOANADVANCES
    public long loanAdvances;
    // 可供出售金融资产 SALEABLEFASSET
    public long saleableFinancialAsset;
    // 持有至到期的投资 HELDMATURITYINV
    public long heldMaturityInvestment;
    // 长期应收款 LTREC
    public long longTermReceivable;
    // 长期股权投资 LTEQUITYINV
    public long longTermEquityInvestment;
    // 投资性房地产 ESTATEINVEST
    public long estateInvestment;
    // 固定资产 FIXEDASSET
    public long fixedAsset;
    // 在建工程 CONSTRUCTIONPROGRESS
    public long constructionInProgress;
    // 工程物资 CONSTRUCTIONMATERIAL
    public long constructionMaterial;
    // 固定资产清理 LIQUIDATEFIXEDASSET
    public long liquidateFixedAsset;
    // 生产性生物资产 PRODUCTBIOLOGYASSET
    public long productBiologyAsset;
    // 油气资产 OILGASASSET
    public long oilGasAsset;
    // 无形资产 INTANGIBLEASSET
    public long intangibleAsset;
    // 开发支出 DEVELOPEXP
    public long developexp;
    // 商誉 GOODWILL
    public long goodwill;
    // 长期待摊费用 LTDEFERASSET
    public long longTermDeferAsset;
    // 递延所得税资产 DEFERINCOMETAXASSET
    public long deferredIncomeTaxAsset;
    // 其他非流动资产 OTHERNONLASSET
    public long otherNonLiquidAsset;
    // 非流动资产合计 SUMNONLASSET
    public long sumNonLiquidAsset;
    // 资产总计 SUMASSET
    public long sumAsset;

    //**************************************************
    //********************* 流动负债 ********************
    //**************************************************
    // 短期借款 STBORROW
    public long shortTermLoan;
    // 向中央银行借款 BORROWFROMCBANK
    public long loanFromCenterBank;
    // 吸收存款及同业存放 DEPOSIT
    public long deposit;
    // 拆入资金 BORROWFUND
    public long loanFromOtherBank;
    // 以公允价值计量且其变动计入当期损益的金融负债 FVALUEFLIAB
    public long fairValueFinancialLiabilities;
    // 其中：交易性金融负债 TRADEFLIAB
    public long tradeFinancialLiabilities;
    // 指定以公允价值计量且其变动计入当期损益的金融负债 DEFINEFVALUEFLIAB
    public long defineFairValueFinancialLiabilities;
    // 应付票据 BILLPAY
    public long billPayable;
    // 应付账款 ACCOUNTPAY
    public long accountsPayable;
    // 预收款项 ADVANCERECEIVE
    public long advancesReceived;
    // 卖出回购金融资产款 SELLBUYBACKFASSET
    public long financialAssetsSoldForRepurchase;
    // 应付手续费及佣金 COMMPAY
    public long feeCommissionPayable;
    // 应付职工薪酬 SALARYPAY
    public long salaryPayable;
    // 应交税费 TAXPAY
    public long taxPayable;
    // 应付利息 INTERESTPAY
    public long interestIned;
    // 应付股利 DIVIDENDPAY
    public long dividendsPayable;
    // 应付分保账款 RIPAY
    public long accountsPayableReinsurance;
    // 内部应付款 INTERNALPAY
    public long internalPayable;
    // 其他应付款 OTHERPAY
    public long otherPayable;
    // 预计流动负债 ANTICIPATELLIAB
    public long anticipateCashLiabilities;
    // 保险合同准备金 CONTACTRESERVE
    public long reserveFundForInsuranceContracts;
    // 代理买卖证券款 AGENTTRADESECURITY
    public long actingTradingSecurities;
    // 代理承销证券款 AGENTUWSECURITY
    public long actingUnderwritingSecurities;
    // 一年内的递延收益 DEFERINCOMEONEYEAR
    public long deferredIncomeOneYear;
    // 应付短期债券 STBONDREC
    public long shortTermBondsPayable;
    // 划分为持有待售的负债 CLHELDSALELIAB
    public long liabilitiesForSale;
    // 一年内到期的非流动负债 NONLLIABONEYEAR
    public long nonCashLiabilitiesOneYear;
    // 其他流动负债 OTHERLLIAB
    public long otherCashLiabilities;
    // 流动负债合计 SUMLLIAB
    public long sumCashLiabilities;

    //**************************************************
    //******************** 非流动负债 *******************
    //**************************************************
    // 长期借款 LTBORROW
    public long longTermLoan;
    // 应付债券 BONDPAY
    public long bondPayable;
    // 应付债券-优先股 PREFERSTOCBOND
    public long preferStockBond;
    // 应付债券-永续股 SUSTAINBOND
    public long sustainStockBond;
    // 长期应付款 LTACCOUNTPAY
    public long longTermAccountPayable;
    // 长期应付职工薪酬 LTSALARYPAY
    public long longTermSalaryPayable;
    // 专项应付款 SPECIALPAY
    public long accountPayableSpecialFunds;
    // 预计负债 ANTICIPATELIAB
    public long estimatedLiabilities;
    // 递延收益 DEFERINCOME
    public long deferredIncome;
    // 递延所得税负债 DEFERINCOMETAXLIAB
    public long deferredTaxLiability;
    // 其他非流动负债 OTHERNONLLIAB
    public long otherNonCurrentLiabilities;
    // 非流动负债合计 SUMNONLLIAB
    public long sumNonCurrentLiabilities;
    // 负债合计 SUMLIAB
    public long sumLiabilities;

    //************************************************************
    //******************** 所有者权益(或股东权益) *******************
    //************************************************************
    // 实收资本（或股本) SHARECAPITAL
    public long paidInCapital;
    // 其他权益工具 OTHEREQUITY
    public long otherEquity;
    // 其他权益工具-优先股 PREFERREDSTOCK
    public long preferredtock;
    // 其他权益工具-永续债 SUSTAINABLEDEBT
    public long sustainableDebt;
    // 其他权益工具-其他权益工具 OTHEREQUITYOTHER
    public long otherEquityOther;
    // 资本公积 CAPITALRESERVE
    public long capitalReserve;
    // 库存股 INVENTORYSHARE
    public long inventoryShare;
    // 专项储备 SPECIALRESERVE
    public long specialReserve;
    // 盈余公积 SURPLUSRESERVE
    public long surplusReserve;
    // 一般风险准备 GENERALRISKPREPARE
    public long generalRiskPrepare;
    // 未确定的投资损失 UNCONFIRMINVLOSS
    public long unconfirmInvestmentLoss;
    // 未分配利润 RETAINEDEARNING
    public long undistributedProfit;
    // 拟分配现金股利 PLANCASHDIVI
    public long plancashdivi;
    // 外币报表折算差额 DIFFCONVERSIONFC
    public long diffconversionfc;
    // 归属于母公司股东权益合计 SUMPARENTEQUITY
    public long sumParentEquity;
    // 少数股东权益 MINORITYEQUITY
    public long minorityEquity;
    // 股东权益合计 SUMSHEQUITY
    public long sumshequity;
    // 负债和股东权益合计 SUMLIABSHEQUITY
    public long sumliabshequity;


    public BalanceSheet() {

    }

    public BalanceSheet(JSONObject json) {
        this.securityCode = json.getString("SECURITYCODE");
        this.reportDate = StringUtils.convertReportDate(json.getString("REPORTDATE"));
        this.monetaryFund = NumberUtils.convertCent(json.getString("MONETARYFUND"));
        this.settlementProvision = NumberUtils.convertCent(json.getString("SETTLEMENTPROVISION"));
        this.lendFund = NumberUtils.convertCent(json.getString("LENDFUND"));
        this.fairValueFinancialAsset = NumberUtils.convertCent(json.getString("FVALUEFASSET"));
        this.tradeFinancialAsset = NumberUtils.convertCent(json.getString("TRADEFASSET"));
        this.defineFairValueFinancialAsset = NumberUtils.convertCent(json.getString("DEFINEFVALUEFASSET"));
        this.billReceivable = NumberUtils.convertCent(json.getString("BILLREC"));
        this.accountsReceivable = NumberUtils.convertCent(json.getString("ACCOUNTREC"));
        this.prepayments = NumberUtils.convertCent(json.getString("ADVANCEPAY"));
        this.premiumsReceivable = NumberUtils.convertCent(json.getString("PREMIUMREC"));
        this.accountsReceivableReinsurance = NumberUtils.convertCent(json.getString("RIREC"));
        this.receivableReinsuranceContractReserve = NumberUtils.convertCent(json.getString("RICONTACTRESERVEREC"));
        this.interestReceivable = NumberUtils.convertCent(json.getString("INTERESTREC"));
        this.dividendReceivable = NumberUtils.convertCent(json.getString("DIVIDENDREC"));
        this.otherReceivable = NumberUtils.convertCent(json.getString("OTHERREC"));
        this.receivableExportTaxRebate = NumberUtils.convertCent(json.getString("EXPORTREBATEREC"));
        this.subsidyReceivable = NumberUtils.convertCent(json.getString("SUBSIDYREC"));
        this.internalReceivable = NumberUtils.convertCent(json.getString("INTERNALREC"));
        this.buyBackResaleFinancialAsset = NumberUtils.convertCent(json.getString("BUYSELLBACKFASSET"));
        this.inventory = NumberUtils.convertCent(json.getString("INVENTORY"));
        this.assetsHeldForSale = NumberUtils.convertCent(json.getString("CLHELDSALEASS"));
        this.nonLiquidAssetOneYear = NumberUtils.convertCent(json.getString("NONLASSETONEYEAR"));
        this.otherLiquidAsset = NumberUtils.convertCent(json.getString("OTHERLASSET"));
        this.sumLiquidAsset = NumberUtils.convertCent(json.getString("SUMLASSET"));
        this.loanAdvances = NumberUtils.convertCent(json.getString("LOANADVANCES"));
        this.saleableFinancialAsset = NumberUtils.convertCent(json.getString("SALEABLEFASSET"));
        this.heldMaturityInvestment = NumberUtils.convertCent(json.getString("HELDMATURITYINV"));
        this.longTermReceivable = NumberUtils.convertCent(json.getString("LTREC"));
        this.longTermEquityInvestment = NumberUtils.convertCent(json.getString("LTEQUITYINV"));
        this.estateInvestment = NumberUtils.convertCent(json.getString("ESTATEINVEST"));
        this.fixedAsset = NumberUtils.convertCent(json.getString("FIXEDASSET"));
        this.constructionInProgress = NumberUtils.convertCent(json.getString("CONSTRUCTIONPROGRESS"));
        this.constructionMaterial = NumberUtils.convertCent(json.getString("CONSTRUCTIONMATERIAL"));
        this.liquidateFixedAsset = NumberUtils.convertCent(json.getString("LIQUIDATEFIXEDASSET"));
        this.productBiologyAsset = NumberUtils.convertCent(json.getString("PRODUCTBIOLOGYASSET"));
        this.oilGasAsset = NumberUtils.convertCent(json.getString("OILGASASSET"));
        this.intangibleAsset = NumberUtils.convertCent(json.getString("INTANGIBLEASSET"));
        this.developexp = NumberUtils.convertCent(json.getString("DEVELOPEXP"));
        this.goodwill = NumberUtils.convertCent(json.getString("GOODWILL"));
        this.longTermDeferAsset = NumberUtils.convertCent(json.getString("LTDEFERASSET"));
        this.deferredIncomeTaxAsset = NumberUtils.convertCent(json.getString("DEFERINCOMETAXASSET"));
        this.otherNonLiquidAsset = NumberUtils.convertCent(json.getString("OTHERNONLASSET"));
        this.sumNonLiquidAsset = NumberUtils.convertCent(json.getString("SUMNONLASSET"));
        this.sumAsset = NumberUtils.convertCent(json.getString("SUMASSET"));
        this.shortTermLoan = NumberUtils.convertCent(json.getString("STBORROW"));
        this.loanFromCenterBank = NumberUtils.convertCent(json.getString("BORROWFROMCBANK"));
        this.deposit = NumberUtils.convertCent(json.getString("DEPOSIT"));
        this.loanFromOtherBank = NumberUtils.convertCent(json.getString("BORROWFUND"));
        this.fairValueFinancialLiabilities = NumberUtils.convertCent(json.getString("FVALUEFLIAB"));
        this.tradeFinancialLiabilities = NumberUtils.convertCent(json.getString("TRADEFLIAB"));
        this.defineFairValueFinancialLiabilities = NumberUtils.convertCent(json.getString("DEFINEFVALUEFLIAB"));
        this.billPayable = NumberUtils.convertCent(json.getString("BILLPAY"));
        this.accountsPayable = NumberUtils.convertCent(json.getString("ACCOUNTPAY"));
        this.advancesReceived = NumberUtils.convertCent(json.getString("ADVANCERECEIVE"));
        this.financialAssetsSoldForRepurchase = NumberUtils.convertCent(json.getString("SELLBUYBACKFASSET"));
        this.feeCommissionPayable = NumberUtils.convertCent(json.getString("COMMPAY"));
        this.salaryPayable = NumberUtils.convertCent(json.getString("SALARYPAY"));
        this.taxPayable = NumberUtils.convertCent(json.getString("TAXPAY"));
        this.interestIned = NumberUtils.convertCent(json.getString("INTERESTPAY"));
        this.dividendsPayable = NumberUtils.convertCent(json.getString("DIVIDENDPAY"));
        this.accountsPayableReinsurance = NumberUtils.convertCent(json.getString("RIPAY"));
        this.internalPayable = NumberUtils.convertCent(json.getString("INTERNALPAY"));
        this.otherPayable = NumberUtils.convertCent(json.getString("OTHERPAY"));
        this.anticipateCashLiabilities = NumberUtils.convertCent(json.getString("ANTICIPATELLIAB"));
        this.reserveFundForInsuranceContracts = NumberUtils.convertCent(json.getString("CONTACTRESERVE"));
        this.actingTradingSecurities = NumberUtils.convertCent(json.getString("AGENTTRADESECURITY"));
        this.actingUnderwritingSecurities = NumberUtils.convertCent(json.getString("AGENTUWSECURITY"));
        this.deferredIncomeOneYear = NumberUtils.convertCent(json.getString("DEFERINCOMEONEYEAR"));
        this.shortTermBondsPayable = NumberUtils.convertCent(json.getString("STBONDREC"));
        this.liabilitiesForSale = NumberUtils.convertCent(json.getString("CLHELDSALELIAB"));
        this.nonCashLiabilitiesOneYear = NumberUtils.convertCent(json.getString("NONLLIABONEYEAR"));
        this.otherCashLiabilities = NumberUtils.convertCent(json.getString("OTHERLLIAB"));
        this.sumCashLiabilities = NumberUtils.convertCent(json.getString("SUMLLIAB"));
        this.longTermLoan = NumberUtils.convertCent(json.getString("LTBORROW"));
        this.bondPayable = NumberUtils.convertCent(json.getString("BONDPAY"));
        this.preferStockBond = NumberUtils.convertCent(json.getString("PREFERSTOCBOND"));
        this.sustainStockBond = NumberUtils.convertCent(json.getString("SUSTAINBOND"));
        this.longTermAccountPayable = NumberUtils.convertCent(json.getString("LTACCOUNTPAY"));
        this.longTermSalaryPayable = NumberUtils.convertCent(json.getString("LTSALARYPAY"));
        this.accountPayableSpecialFunds = NumberUtils.convertCent(json.getString("SPECIALPAY"));
        this.estimatedLiabilities = NumberUtils.convertCent(json.getString("ANTICIPATELIAB"));
        this.deferredIncome = NumberUtils.convertCent(json.getString("DEFERINCOME"));
        this.deferredTaxLiability = NumberUtils.convertCent(json.getString("DEFERINCOMETAXLIAB"));
        this.otherNonCurrentLiabilities = NumberUtils.convertCent(json.getString("OTHERNONLLIAB"));
        this.sumNonCurrentLiabilities = NumberUtils.convertCent(json.getString("SUMNONLLIAB"));
        this.sumLiabilities = NumberUtils.convertCent(json.getString("SUMLIAB"));
        this.paidInCapital = NumberUtils.convertCent(json.getString("SHARECAPITAL"));
        this.otherEquity = NumberUtils.convertCent(json.getString("OTHEREQUITY"));
        this.preferredtock = NumberUtils.convertCent(json.getString("PREFERREDSTOCK"));
        this.sustainableDebt = NumberUtils.convertCent(json.getString("SUSTAINABLEDEBT"));
        this.otherEquityOther = NumberUtils.convertCent(json.getString("OTHEREQUITYOTHER"));
        this.capitalReserve = NumberUtils.convertCent(json.getString("CAPITALRESERVE"));
        this.inventoryShare = NumberUtils.convertCent(json.getString("INVENTORYSHARE"));
        this.specialReserve = NumberUtils.convertCent(json.getString("SPECIALRESERVE"));
        this.surplusReserve = NumberUtils.convertCent(json.getString("SURPLUSRESERVE"));
        this.generalRiskPrepare = NumberUtils.convertCent(json.getString("GENERALRISKPREPARE"));
        this.unconfirmInvestmentLoss = NumberUtils.convertCent(json.getString("UNCONFIRMINVLOSS"));
        this.undistributedProfit = NumberUtils.convertCent(json.getString("RETAINEDEARNING"));
        this.plancashdivi = NumberUtils.convertCent(json.getString("PLANCASHDIVI"));
        this.diffconversionfc = NumberUtils.convertCent(json.getString("DIFFCONVERSIONFC"));
        this.sumParentEquity = NumberUtils.convertCent(json.getString("SUMPARENTEQUITY"));
        this.minorityEquity = NumberUtils.convertCent(json.getString("MINORITYEQUITY"));
        this.sumshequity = NumberUtils.convertCent(json.getString("SUMSHEQUITY"));
        this.sumliabshequity = NumberUtils.convertCent(json.getString("SUMLIABSHEQUITY"));
    }
}
