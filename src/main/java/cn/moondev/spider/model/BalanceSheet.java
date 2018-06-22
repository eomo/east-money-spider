package cn.moondev.spider.model;

import cn.moondev.spider.utils.NumberUtils;
import cn.moondev.spider.utils.StringUtils;
import com.alibaba.fastjson.JSONObject;

/**
 * 资产负债表
 */
public class BalanceSheet {

    // 股票代码
    public String securityCode;

    // 日期
    public String reportDate;

    // 日期类型
    public String dateType;

    // 股票类型
    public String stockType;

    //**************************************************
    //******************** 流动资产 *********************
    //**************************************************
    // 货币资金
    public long monetaryFund;
    // 结算备付金
    public long settlementProvision;
    // 拆出资金
    public long lendFund;
    // 以公允价值计量且其变动计入当期损益的金融资产
    public long fairValueFinancialAsset;
    // 交易性金融资产
    public long tradeFinancialAsset;
    // 指定为以公允价值计量且其变动计入当期损益的金融资产
    public long defineFairValueFinancialAsset;
    // 应收票据
    public long billReceivable;
    // 应收账款
    public long accountsReceivable;
    // 预付款项
    public long prepayments;
    // 应收保费
    public long premiumsReceivable;
    // 应收分保账款(指公司开展分保业务而发生的各种应收款项)
    public long accountsReceivableReinsurance;
    // 应收分保合同准备金
    public long receivableReinsuranceContractReserve;
    // 应收利息
    public long interestReceivable;
    // 应收股利
    public long dividendReceivable;
    // 其他应收款
    public long otherReceivable;
    // 应收出口退税
    public long receivableExportTaxRebate;
    // 应收补贴款
    public long subsidyReceivable;
    // 内部应收款
    public long internalReceivable;
    // 买入返售金融资产
    public long buyBackResaleFinancialAsset;
    // 存货
    public long inventory;
    // 划分为持有待售的资产
    public long assetsHeldForSale;
    // 一年内到期的非流动资产
    public long nonLiquidAssetOneYear;
    // 其他流动资产
    public long otherLiquidAsset;
    // 流动资产合计
    public long sumLiquidAsset;
    // 代理业务资产(新三板)
    public long agentAsset;
    // 流动资产其他项目(新三板)
    public long liquidAssetOther;
    // 流动资产平衡项目(新三板)
    public long liquidAssetBalance;


    //**************************************************
    //******************* 非流动资产 ********************
    //**************************************************
    // 发放委托贷款及垫款
    public long loanAdvances;
    // 可供出售金融资产
    public long saleableFinancialAsset;
    // 持有至到期的投资
    public long heldMaturityInvestment;
    // 长期应收款
    public long longTermReceivable;
    // 长期股权投资
    public long longTermEquityInvestment;
    // 投资性房地产
    public long estateInvestment;
    // 固定资产
    public long fixedAsset;
    // 在建工程
    public long constructionInProgress;
    // 工程物资
    public long constructionMaterial;
    // 固定资产清理
    public long liquidateFixedAsset;
    // 生产性生物资产
    public long productBiologyAsset;
    // 油气资产
    public long oilGasAsset;
    // 无形资产
    public long intangibleAsset;
    // 开发支出
    public long developexp;
    // 商誉
    public long goodwill;
    // 长期待摊费用
    public long longTermDeferAsset;
    // 递延所得税资产
    public long deferredIncomeTaxAsset;
    // 其他非流动资产
    public long otherNonLiquidAsset;
    // 非流动资产合计
    public long sumNonLiquidAsset;
    // 资产总计
    public long sumAsset;
    // 非流动资产其他项目(新三板)
    public long nonLiquidAssetOther;
    // 非流动资产平衡项目(新三板)
    public long nonLiquidAssetBalance;
    // 资产其他项目(新三板)
    public long assetOther;
    // 资产平衡项目(新三板)
    public long assetBalance;

    //**************************************************
    //********************* 流动负债 ********************
    //**************************************************
    // 短期借款
    public long shortTermLoan;
    // 向中央银行借款
    public long loanFromCenterBank;
    // 吸收存款及同业存放
    public long deposit;
    // 拆入资金
    public long loanFromOtherBank;
    // 以公允价值计量且其变动计入当期损益的金融负债
    public long fairValueFinancialLiabilities;
    // 其中：交易性金融负债
    public long tradeFinancialLiabilities;
    // 指定以公允价值计量且其变动计入当期损益的金融负债
    public long defineFairValueFinancialLiabilities;
    // 应付票据
    public long billPayable;
    // 应付账款
    public long accountsPayable;
    // 预收款项
    public long advancesReceived;
    // 卖出回购金融资产款
    public long financialAssetsSoldForRepurchase;
    // 应付手续费及佣金
    public long feeCommissionPayable;
    // 应付职工薪酬
    public long salaryPayable;
    // 应交税费
    public long taxPayable;
    // 应付利息
    public long interestIned;
    // 应付股利
    public long dividendsPayable;
    // 应付分保账款
    public long accountsPayableReinsurance;
    // 内部应付款
    public long internalPayable;
    // 其他应付款
    public long otherPayable;
    // 预计流动负债
    public long anticipateCashLiabilities;
    // 保险合同准备金
    public long reserveFundForInsuranceContracts;
    // 代理买卖证券款
    public long actingTradingSecurities;
    // 代理承销证券款
    public long actingUnderwritingSecurities;
    // 一年内的递延收益
    public long deferredIncomeOneYear;
    // 应付短期债券
    public long shortTermBondsPayable;
    // 划分为持有待售的负债
    public long liabilitiesForSale;
    // 一年内到期的非流动负债
    public long nonCashLiabilitiesOneYear;
    // 其他流动负债
    public long otherCashLiabilities;
    // 流动负债合计
    public long sumCashLiabilities;
    // 代理业务负债(新三板)
    public long agentLiabilities;
    // 流动负债其他项目(新三板)
    public long cashLiabilitiesOther;
    // 流动负债平衡项目(新三板)
    public long cashLiabilitiesBalance;

    //**************************************************
    //******************** 非流动负债 *******************
    //**************************************************
    // 长期借款
    public long longTermLoan;
    // 应付债券
    public long bondPayable;
    // 应付债券-优先股
    public long preferStockBond;
    // 应付债券-永续股
    public long sustainStockBond;
    // 长期应付款
    public long longTermAccountPayable;
    // 长期应付职工薪酬
    public long longTermSalaryPayable;
    // 专项应付款
    public long accountPayableSpecialFunds;
    // 预计负债
    public long estimatedLiabilities;
    // 递延收益
    public long deferredIncome;
    // 递延所得税负债
    public long deferredTaxLiability;
    // 其他非流动负债
    public long otherNonCurrentLiabilities;
    // 非流动负债合计
    public long sumNonCurrentLiabilities;
    // 负债合计
    public long sumLiabilities;
    // 负债其他项目(新三板)
    public long liabilitiesOther;
    // 负债平衡项目(新三板)
    public long liabilitiesBalance;

    //************************************************************
    //******************** 所有者权益(或股东权益) *******************
    //************************************************************
    // 实收资本（或股本)
    public long paidInCapital;
    // 其他权益工具
    public long otherEquity;
    // 其他权益工具-优先股
    public long preferredtock;
    // 其他权益工具-永续债
    public long sustainableDebt;
    // 其他权益工具-其他权益工具
    public long otherEquityOther;
    // 资本公积
    public long capitalReserve;
    // 库存股
    public long inventoryShare;
    // 专项储备
    public long specialReserve;
    // 盈余公积
    public long surplusReserve;
    // 一般风险准备
    public long generalRiskPrepare;
    // 未确定的投资损失
    public long unconfirmInvestmentLoss;
    // 未分配利润
    public long undistributedProfit;
    // 拟分配现金股利
    public long plancashdivi;
    // 外币报表折算差额
    public long diffconversionfc;
    // 归属于母公司股东权益合计
    public long sumParentEquity;
    // 少数股东权益
    public long minorityEquity;
    // 股东权益合计
    public long sumshequity;
    // 负债和股东权益合计
    public long sumliabshequity;
    // 归属于母公司股东权益其他项目(新三板)
    public long parentEquityOther;
    // 归属于母公司股东权益平衡项目(新三板)
    public long parentEquityBalance;
    // 股东权益其他项目(新三板)
    public long shEquityOther;
    // 股东权益平衡项目(新三板)
    public long shEquityBalance;
    // 负债和股东权益其他项目(新三板)
    public long lishEquityOther;
    // 负债和股东权益平衡项目(新三板)
    public long lishEquityBalance;

    public BalanceSheet() {

    }

    public BalanceSheet(JSONObject json) {
        // 资产部分
        this.securityCode = json.getString("SECURITYCODE");
        this.stockType = json.getString("STOCKTYPE");
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
        this.agentAsset = NumberUtils.convertCent(json.getString("DLYWZC"));
        this.liquidAssetOther = NumberUtils.convertCent(json.getString("LASSETOTHER"));
        this.liquidAssetBalance = NumberUtils.convertCent(json.getString("LASSETBALANCE"));
        this.nonLiquidAssetOther = NumberUtils.convertCent(json.getString("NONLASSETOTHER"));
        this.nonLiquidAssetBalance = NumberUtils.convertCent(json.getString("NONLASSETBALANCE"));
        this.assetOther = NumberUtils.convertCent(json.getString("ASSETOTHER"));
        this.assetBalance = NumberUtils.convertCent(json.getString("ASSETBALANCE"));

        // 负债部分
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
        if (StockType.GEM.toString().equals(stockType)) {
            this.preferStockBond = NumberUtils.convertCent(json.getString("PREFERSTOCBOND"));
            this.sustainStockBond = NumberUtils.convertCent(json.getString("SUSTAINBOND"));
        } else if (StockType.NEEQ.toString().equals(stockType)) {
            this.preferStockBond = NumberUtils.convertCent(json.getString("YXGYF"));
            this.sustainStockBond = NumberUtils.convertCent(json.getString("YXZYF"));
        }
        this.longTermAccountPayable = NumberUtils.convertCent(json.getString("LTACCOUNTPAY"));
        this.longTermSalaryPayable = NumberUtils.convertCent(json.getString("LTSALARYPAY"));
        this.accountPayableSpecialFunds = NumberUtils.convertCent(json.getString("SPECIALPAY"));
        this.estimatedLiabilities = NumberUtils.convertCent(json.getString("ANTICIPATELIAB"));
        this.deferredIncome = NumberUtils.convertCent(json.getString("DEFERINCOME"));
        this.deferredTaxLiability = NumberUtils.convertCent(json.getString("DEFERINCOMETAXLIAB"));
        this.otherNonCurrentLiabilities = NumberUtils.convertCent(json.getString("OTHERNONLLIAB"));
        this.sumNonCurrentLiabilities = NumberUtils.convertCent(json.getString("SUMNONLLIAB"));
        this.sumLiabilities = NumberUtils.convertCent(json.getString("SUMLIAB"));
        this.agentLiabilities = NumberUtils.convertCent(json.getString("DLYWFZ"));
        this.cashLiabilitiesOther = NumberUtils.convertCent(json.getString("LLIABOTHER"));
        this.cashLiabilitiesBalance = NumberUtils.convertCent(json.getString("LLIABBALANCE"));
        this.liabilitiesOther = NumberUtils.convertCent(json.getString("LIABOTHER"));
        this.liabilitiesBalance = NumberUtils.convertCent(json.getString("LIABBALANCE"));

        // 股东权益部分
        this.paidInCapital = NumberUtils.convertCent(json.getString("SHARECAPITAL"));
        if (StockType.GEM.toString().equals(stockType)) {
            this.otherEquity = NumberUtils.convertCent(json.getString("OTHEREQUITY"));
            this.preferredtock = NumberUtils.convertCent(json.getString("PREFERREDSTOCK"));
            this.sustainableDebt = NumberUtils.convertCent(json.getString("SUSTAINABLEDEBT"));
            this.otherEquityOther = NumberUtils.convertCent(json.getString("OTHEREQUITYOTHER"));
        } else if (StockType.NEEQ.toString().equals(stockType)) {
            this.otherEquity = NumberUtils.convertCent(json.getString("QTQYGJ"));
            this.preferredtock = NumberUtils.convertCent(json.getString("YXGQY"));
            this.sustainableDebt = NumberUtils.convertCent(json.getString("YXZQY"));
            this.otherEquityOther = NumberUtils.convertCent(json.getString("QT"));
        }
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
        this.parentEquityOther = NumberUtils.convertCent(json.getString("PARENTEQUITYOTHER"));
        this.parentEquityBalance = NumberUtils.convertCent(json.getString("PARENTEQUITYBALANCE"));
        this.shEquityOther = NumberUtils.convertCent(json.getString("SHEQUITYOTHER"));
        this.shEquityBalance = NumberUtils.convertCent(json.getString("SHEQUITYBALANCE"));
        this.lishEquityOther = NumberUtils.convertCent(json.getString("LIABSHEQUITYOTHER"));
        this.lishEquityBalance = NumberUtils.convertCent(json.getString("LIABSHEQUITYBALANCE"));
    }
}
