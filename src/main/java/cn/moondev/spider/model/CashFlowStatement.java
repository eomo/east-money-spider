package cn.moondev.spider.model;

import cn.moondev.spider.utils.NumberUtils;
import cn.moondev.spider.utils.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Strings;

/**
 * 现金流量表
 */
public class CashFlowStatement {

    // 日期类型
    public String dateType;

    // 股票代码
    public String stockCode;

    // 日期
    public String reportDate;

    // 股票类型
    public String stockType;

    //******************************************
    //************第1部分：经营活动***************
    //******************************************
    // 销售商品、提供劳务收到的现金
    public long cashInSaleGoodLabourService;

    // 客户存款和同业存放款项净增加额
    public long netIncreaseInDeposit;

    // 向中央银行借款净增加额
    public long netIncreaseInLoanFromBank;

    // 向其他金融机构拆入资金净增加额
    public long netIncreaseInLoanFromBankInstitution;

    // 收到原保险合同保费取得的现金
    public long cashInOriginalInsuranceContract;

    // 收到再保险业务现金净额
    public long netCashInReinsure;

    // 保户储金及投资款净增加额
    public long netIncreaseDepositInvestment;

    // 处置交易性金融资产净增加额
    public long netIncreaseInFinancialAsset;

    // 收取利息、手续费及佣金的现金
    public long cashInInterestCommission;

    // 拆入资金净增加额
    public long netIncreaseBorrowFund;

    // 发放贷款及垫款的净减少额
    public long netReduceLoanAdvances;

    // 回购业务资金净增加额
    public long netIncreaseBuybackFoud;

    // 收到的税费返还
    public long taxReturn;

    // 收到其他与经营活动有关的现金
    public long cashInOtherBusiness;

    // 经营活动现金流入小计
    public long sumCashRevenue;

    // 购买商品、接受劳务支付的现金
    public long buyGoodLabourServicePayable;

    // 客户贷款及垫款净增加额
    public long netIncreaseInLoanAdvances;

    // 存放中央银行和同业款项净增加额
    public long netIncreaseInDepositInBank;

    // 支付原保险合同赔付款项的现金
    public long insuranceContractPayable;

    // 支付利息、手续费及佣金的现金
    public long interestCommissionPayable;

    // 支付保单红利的现金
    public long dividendPayable;

    // 支付给职工以及为职工支付的现金
    public long employeePayable;

    // 支付的各项税费
    public long taxPayable;

    // 支付其他与经营活动有关的现金
    public long otherBusinessPayable;

    // 经营活动现金流出小计
    public long sumCashPayable;

    // 经营活动产生的现金流量净额(现金流入小计 - 现金流出小计)
    public long netCashInBusiness;

    // 经营活动现金流入的其他项目(新三板)
    public long operatingCashInOther;

    // 经营活动现金流入的平衡项目(新三板)
    public long operatingCashInBalance;

    // 经营活动现金流出的其他项目(新三板)
    public long operatingCashOutOther;

    // 经营活动现金流出的平衡项目(新三板)
    public long operatingCashOutBalance;

    // 经营活动产生的现金流量净额其他项目(新三板)
    public long operatingNetCashOther;

    // 经营活动产生的现金流量净额平衡项目(新三板)
    public long operatingNetCashBalance;


    //******************************************
    //************第2部分：投资活动***************
    //******************************************
    // 收回投资收到的现金
    public long cashByInvestment;

    // 取得投资收益收到的现金
    public long cashByInvestmentReceived;

    // 处置固定资产、无形资产和其他长期资产收回的现金净额
    public long cashByDisposeAsset;

    // 处置子公司及其他营业单位收到的现金净额
    public long cashByDisposeSubsidiary;

    // 减少质押和定期存款所收到的现金
    public long cashByReducePledgeAndDeposit;

    // 收到其他与投资活动有关的现金
    public long cashByOtherInvestment;

    // 投资活动现金流入小计
    public long sumInvestmentRevenue;

    // 购建固定资产、无形资产和其他长期资产支付的现金
    public long buyAssetPayable;

    // 投资支付的现金
    public long investmentPayable;

    // 质押贷款净增加额
    public long netIncreaseInPledgeLoan;

    // 取得子公司及其他营业单位支付的现金净额
    public long getSubsidiaryPayable;

    // 增加质押和定期存款所支付的现金
    public long cashByAddPledgeAndDeposit;

    // 支付其他与投资活动有关的现金
    public long otherInvestmentPayable;

    // 投资活动现金流出小计
    public long sumInvestmentPayable;

    // 投资活动产生的现金流量净额
    public long netCashInInvestment;

    // 投资活动现金流入的其他项目(新三板)
    public long investCashInOther;

    // 投资活动现金流入的平衡项目(新三板)
    public long investCashInBalance;

    // 投资活动现金流出的其他项目(新三板)
    public long investCashOutOther;

    // 投资活动现金流出的平衡项目(新三板)
    public long investCashOutBalance;

    // 投资活动产生的现金流量净额其他项目(新三板)
    public long investNetCashOther;

    // 投资活动产生的现金流量净额平衡项目(新三板)
    public long investNetCashBalance;

    //******************************************
    //************第3部分：融资活动***************
    //******************************************
    // 吸收投资收到的现金
    public long cashByAcceptInvestment;

    // 子公司吸收少数股东投资收到的现金
    public long cashByAcceptSubsidiary;

    // 取得借款收到的现金
    public long cashByLoan;

    // 发行债券收到的现金
    public long cashByIssuanceOfBonds;

    // 收到其他与筹资活动有关的现金
    public long cashByOtherFinancing;

    // 筹资活动现金流入小计
    public long sumFinancingRevenue;

    // 偿还债务支付的现金
    public long repaymentDebtPayable;

    // 分配股利、利润或偿付利息支付的现金
    public long dividendProfitInterestPayable;

    // 子公司支付给少数股东的股利、利润
    public long subsidiaryPayable;

    // 购买子公司少数股权而支付的现金
    public long buySubsidiaryPayable;

    // 支付其他与筹资活动有关的现金
    public long otherFinancingPayable;

    // 子公司减资支付给少数股东的现金
    public long subsidiaryReduceCapital;

    // 筹资活动现金流出小计
    public long sumFinancingPayable;

    // 筹资活动产生的现金流量净额
    public long netCashInFinancing;

    // 筹资活动现金流入的其他项目(新三板)
    public long financingCashInOther;

    // 筹资活动现金流入的平衡项目(新三板)
    public long financingCashInBalance;

    // 筹资活动现金流出的其他项目(新三板)
    public long financingCashOutOther;

    // 筹资活动现金流出的平衡项目(新三板)
    public long financingCashOutBalance;

    // 筹资活动产生的现金流量净额其他项目(新三板)
    public long financingNetCashOther;

    // 筹资活动产生的现金流量净额平衡项目(新三板)
    public long financingNetCashBalance;

    //******************************************
    //************第4部分：汇率变动***************
    //******************************************
    // 汇率变动对现金及现金等价物的影响
    public long effectExchangeRate;

    //********************************************************
    //************第5部分：现金及现金等价物净增加额***************
    //********************************************************
    // 现金及现金等价物净增加额
    public long netIncreaseInCashEqui;

    // 加:期初现金及现金等价物余额
    public long cashInPeriodBeginning;

    // 期末现金及现金等价物余额(现金及现金等价物净增加额 + 期初现金及现金等价物余额)
    public long cashInPeriodEnding;

    // 现金及现金等价物净增加额其他项目(新三板)
    public long netIncreaseInCashEquiOther;

    // 现金及现金等价物净增加额平衡项目(新三板)
    public long netIncreaseInCashEquiBalance;

    // 期末现金及现金等价物余额其他项目(新三板)
    public long cashInPeriodEndingOther;

    // 期末现金及现金等价物余额平衡项目(新三板)
    public long cashInPeriodEndingBalance;

    //******************************************************
    //************第6部分：补充材料(新三板特有) ***************
    //******************************************************
    // 净利润(新三板)
    public long netProfit;

    // 资产减值准备(新三板)
    public long assetReduceValue;

    // 固定资产和投资性房地产折旧(新三板)
    public long fixedEstateAssetDepreciation;

    // 其中:固定资产折旧、油气资产折耗、生产性生物资产折旧(新三板)
    public long fixedGassProductionAssetDepr;

    // 投资性房地产折旧(新三板)
    public long estateInvestDepr;

    // 无形资产摊销(新三板)
    public long amortizationOfIntangibleAsset;

    // 长期待摊费用摊销(新三板)
    public long amortizationOfLongTermExpense;

    // 递延收益摊销(新三板)
    public long amortizationOfDeferredIncome;

    // 待摊费用的减少(新三板)
    public long reducedCostOfApportioned;

    // 预提费用的增加(新三板)
    public long drawingExpenseAdd;

    // 处置固定资产、无形资产和其他长期资产的损失(新三板)
    public long lossOnDisponseAssert;

    // 固定资产报废损失(新三板)
    public long lossOnFixedAsset;

    // 公允价值变动损失(新三板)
    public long lossOnFairValue;

    // 财务费用(新三板)
    public long financialExpense;

    // 投资损失(新三板)
    public long lossOnInvest;

    // 递延所得税(新三板)
    public long deferredIncomeTax;

    // 其中:递延所得税资产减少(新三板)
    public long deferredIncomeTaxReduction;

    // 递延所得税负债增加(新三板)
    public long deferredIncomeTaxLiabAdd;

    // 预计负债的增加(新三板)
    public long anticipateLiabAdd;

    // 存货的减少(新三板)
    public long inventoryReduce;

    // 经营性应收项目的减少(新三板)
    public long operatingReduce;

    // 经营性应付项目的增加(新三板)
    public long operatingPayAdd;

    // 补充资料经营活动产生的现金流量净额其他项目(新三板)
    public long netCashOfOperatingOtherSup;

    // 补充资料经营活动产生的现金流量净额平衡项目(新三板)
    public long netCashOfOperatingBalanceSup;

    // 经营活动产生的现金流量净额(新三板)
    public long netCashOfOperating;

    // 债务转为资本(新三板)
    public long debtToCapital;

    // 一年内到期的可转换公司债券(新三板)
    public long cboneyear;

    // 融资租入固定资产(新三板)
    public long fixedAssetUnderFinancingLease;

    // 不涉及现金收支的投资和筹资活动金额其他项目(新三板)
    public long noReferCashOther;

    // 现金的期末余额(新三板)
    public long periodEndingCash;

    // 减:现金的期初余额(新三板)
    public long periodBeginningCash;

    // 加:现金等价物的期末余额(新三板)
    public long periodEndingMoneyEquivalent;

    // 减:现金等价物的期初余额(新三板)
    public long periodBeginningMoneyEquivalent;

    // 现金及现金等价物净增加额其他项目(新三板)
    public long moneyEquivalentOther;

    // 现金及现金等价物净增加额平衡项目(新三板)
    public long moneyEquivalentBalance;

    // 现金及现金等价物的净增加额(新三板)
    public long moneyEquivalentNetAdd;

    public CashFlowStatement() {

    }

    public CashFlowStatement(JSONObject json) {
        this.stockCode = json.getString("SECURITYCODE");
        if (!Strings.isNullOrEmpty(this.stockCode)) {
            this.stockCode = this.stockCode.substring(0, 6);
        }
        this.reportDate = StringUtils.convertReportDate(json.getString("REPORTDATE"));
        this.cashInSaleGoodLabourService = NumberUtils.convertCent(json.getString("SALEGOODSSERVICEREC"));
        this.netIncreaseInDeposit = NumberUtils.convertCent(json.getString("NIDEPOSIT"));
        this.netIncreaseInLoanFromBank = NumberUtils.convertCent(json.getString("NIBORROWFROMCBANK"));
        this.netIncreaseInLoanFromBankInstitution = NumberUtils.convertCent(json.getString("NIBORROWFROMFI"));
        this.cashInOriginalInsuranceContract = NumberUtils.convertCent(json.getString("PREMIUMREC"));
        this.netCashInReinsure = NumberUtils.convertCent(json.getString("NETRIREC"));
        this.netIncreaseDepositInvestment = NumberUtils.convertCent(json.getString("NIINSUREDDEPOSITINV"));
        this.netIncreaseInFinancialAsset = NumberUtils.convertCent(json.getString("NIDISPTRADEFASSET"));
        this.cashInInterestCommission = NumberUtils.convertCent(json.getString("INTANDCOMMREC"));
        this.netIncreaseBorrowFund = NumberUtils.convertCent(json.getString("NIBORROWFUND"));
        this.netReduceLoanAdvances = NumberUtils.convertCent(json.getString("NDLOANADVANCES"));
        this.netIncreaseBuybackFoud = NumberUtils.convertCent(json.getString("NIBUYBACKFUND"));
        this.taxReturn = NumberUtils.convertCent(json.getString("TAXRETURNREC"));
        this.cashInOtherBusiness = NumberUtils.convertCent(json.getString("OTHEROPERATEREC"));
        this.sumCashRevenue = NumberUtils.convertCent(json.getString("SUMOPERATEFLOWIN"));
        this.buyGoodLabourServicePayable = NumberUtils.convertCent(json.getString("BUYGOODSSERVICEPAY"));
        this.netIncreaseInLoanAdvances = NumberUtils.convertCent(json.getString("NILOANADVANCES"));
        this.netIncreaseInDepositInBank = NumberUtils.convertCent(json.getString("NIDEPOSITINCBANKFI"));
        this.insuranceContractPayable = NumberUtils.convertCent(json.getString("INDEMNITYPAY"));
        this.interestCommissionPayable = NumberUtils.convertCent(json.getString("INTANDCOMMPAY"));
        this.dividendPayable = NumberUtils.convertCent(json.getString("DIVIPAY"));
        this.employeePayable = NumberUtils.convertCent(json.getString("EMPLOYEEPAY"));
        this.taxPayable = NumberUtils.convertCent(json.getString("TAXPAY"));
        this.otherBusinessPayable = NumberUtils.convertCent(json.getString("OTHEROPERATEPAY"));
        this.sumCashPayable = NumberUtils.convertCent(json.getString("SUMOPERATEFLOWOUT"));
        this.netCashInBusiness = NumberUtils.convertCent(json.getString("NETOPERATECASHFLOW"));
        this.cashByInvestment = NumberUtils.convertCent(json.getString("DISPOSALINVREC"));
        this.cashByInvestmentReceived = NumberUtils.convertCent(json.getString("INVINCOMEREC"));
        this.cashByDisposeAsset = NumberUtils.convertCent(json.getString("DISPFILASSETREC"));
        this.cashByDisposeSubsidiary = NumberUtils.convertCent(json.getString("DISPSUBSIDIARYREC"));
        this.cashByReducePledgeAndDeposit = NumberUtils.convertCent(json.getString("REDUCEPLEDGETDEPOSIT"));
        this.cashByOtherInvestment = NumberUtils.convertCent(json.getString("OTHERINVREC"));
        this.sumInvestmentRevenue = NumberUtils.convertCent(json.getString("SUMINVFLOWIN"));
        this.buyAssetPayable = NumberUtils.convertCent(json.getString("BUYFILASSETPAY"));
        this.investmentPayable = NumberUtils.convertCent(json.getString("INVPAY"));
        this.netIncreaseInPledgeLoan = NumberUtils.convertCent(json.getString("NIPLEDGELOAN"));
        this.getSubsidiaryPayable = NumberUtils.convertCent(json.getString("GETSUBSIDIARYPAY"));
        this.cashByAddPledgeAndDeposit = NumberUtils.convertCent(json.getString("ADDPLEDGETDEPOSIT"));
        this.otherInvestmentPayable = NumberUtils.convertCent(json.getString("OTHERINVPAY"));
        this.sumInvestmentPayable = NumberUtils.convertCent(json.getString("SUMINVFLOWOUT"));
        this.netCashInInvestment = NumberUtils.convertCent(json.getString("NETINVCASHFLOW"));
        this.cashByAcceptInvestment = NumberUtils.convertCent(json.getString("ACCEPTINVREC"));
        this.cashByAcceptSubsidiary = NumberUtils.convertCent(json.getString("SUBSIDIARYACCEPT"));
        this.cashByLoan = NumberUtils.convertCent(json.getString("LOANREC"));
        this.cashByIssuanceOfBonds = NumberUtils.convertCent(json.getString("ISSUEBONDREC"));
        this.cashByOtherFinancing = NumberUtils.convertCent(json.getString("OTHERFINAREC"));
        this.sumFinancingRevenue = NumberUtils.convertCent(json.getString("SUMFINAFLOWIN"));
        this.repaymentDebtPayable = NumberUtils.convertCent(json.getString("REPAYDEBTPAY"));
        this.dividendProfitInterestPayable = NumberUtils.convertCent(json.getString("DIVIPROFITORINTPAY"));
        this.subsidiaryPayable = NumberUtils.convertCent(json.getString("SUBSIDIARYPAY"));
        this.buySubsidiaryPayable = NumberUtils.convertCent(json.getString("BUYSUBSIDIARYPAY"));
        this.otherFinancingPayable = NumberUtils.convertCent(json.getString("OTHERFINAPAY"));
        this.subsidiaryReduceCapital = NumberUtils.convertCent(json.getString("SUBSIDIARYREDUCTCAPITAL"));
        this.sumFinancingPayable = NumberUtils.convertCent(json.getString("SUMFINAFLOWOUT"));
        this.netCashInFinancing = NumberUtils.convertCent(json.getString("NETFINACASHFLOW"));
        this.effectExchangeRate = NumberUtils.convertCent(json.getString("EFFECTEXCHANGERATE"));
        this.netIncreaseInCashEqui = NumberUtils.convertCent(json.getString("NICASHEQUI"));
        this.cashInPeriodBeginning = NumberUtils.convertCent(json.getString("CASHEQUIBEGINNING"));
        this.cashInPeriodEnding = NumberUtils.convertCent(json.getString("CASHEQUIENDING"));
        this.operatingCashInOther = NumberUtils.convertCent(json.getString("OPERATEFLOWINOTHER"));
        this.operatingCashInBalance = NumberUtils.convertCent(json.getString("OPERATEFLOWINBALANCE"));
        this.operatingCashOutOther = NumberUtils.convertCent(json.getString("OPERATEFLOWOUTOTHER"));
        this.operatingCashOutBalance = NumberUtils.convertCent(json.getString("OPERATEFLOWOUTBALANCE"));
        this.operatingNetCashOther = NumberUtils.convertCent(json.getString("OPERATEFLOWOTHER"));
        this.operatingNetCashBalance = NumberUtils.convertCent(json.getString("OPERATEFLOWBALANCE"));
        this.investCashInOther = NumberUtils.convertCent(json.getString("INVFLOWINOTHER"));
        this.investCashInBalance = NumberUtils.convertCent(json.getString("INVFLOWINBALANCE"));
        this.investCashOutOther = NumberUtils.convertCent(json.getString("INVFLOWOUTOTHER"));
        this.investCashOutBalance = NumberUtils.convertCent(json.getString("INVFLOWOUTBALANCE"));
        this.investNetCashOther = NumberUtils.convertCent(json.getString("INVFLOWOTHER"));
        this.investNetCashBalance = NumberUtils.convertCent(json.getString("INVFLOWBALANCE"));
        this.financingCashInOther = NumberUtils.convertCent(json.getString("FINAFLOWINOTHER"));
        this.financingCashInBalance = NumberUtils.convertCent(json.getString("FINAFLOWINBALANCE"));
        this.financingCashOutOther = NumberUtils.convertCent(json.getString("FINAFLOWOUTOTHER"));
        this.financingCashOutBalance = NumberUtils.convertCent(json.getString("FINAFLOWOUTBALANCE"));
        this.financingNetCashOther = NumberUtils.convertCent(json.getString("FINAFLOWOTHER"));
        this.financingNetCashBalance = NumberUtils.convertCent(json.getString("FINAFLOWBALANCE"));
        this.netIncreaseInCashEquiOther = NumberUtils.convertCent(json.getString("NICASHEQUIOTHER"));
        this.netIncreaseInCashEquiBalance = NumberUtils.convertCent(json.getString("NICASHEQUIBALANCE"));
        this.cashInPeriodEndingOther = NumberUtils.convertCent(json.getString("CASHEQUIENDINGOTHER"));
        this.cashInPeriodEndingBalance = NumberUtils.convertCent(json.getString("CASHEQUIENDINGBALANCE"));
        this.netProfit = NumberUtils.convertCent(json.getString("NETPROFIT"));
        this.assetReduceValue = NumberUtils.convertCent(json.getString("ASSETDEVALUE"));
        this.fixedEstateAssetDepreciation = NumberUtils.convertCent(json.getString("FIXANDESTATEDEPR"));
        this.fixedGassProductionAssetDepr = NumberUtils.convertCent(json.getString("FIXEDASSETETCDEPR"));
        this.estateInvestDepr = NumberUtils.convertCent(json.getString("ESTATEINVESTDEPR"));
        this.amortizationOfIntangibleAsset = NumberUtils.convertCent(json.getString("INTANGIBLEASSETAMOR"));
        this.amortizationOfLongTermExpense = NumberUtils.convertCent(json.getString("LTDEFEREXPAMOR"));
        this.amortizationOfDeferredIncome = NumberUtils.convertCent(json.getString("DEFERINCOMEAMOR"));
        this.reducedCostOfApportioned = NumberUtils.convertCent(json.getString("DEFEREXPREDUCE"));
        this.drawingExpenseAdd = NumberUtils.convertCent(json.getString("DRAWINGEXPADD"));
        this.lossOnDisponseAssert = NumberUtils.convertCent(json.getString("DISPFILASSETLOSS"));
        this.lossOnFixedAsset = NumberUtils.convertCent(json.getString("FIXEDASSETLOSS"));
        this.lossOnFairValue = NumberUtils.convertCent(json.getString("FVALUELOSS"));
        this.financialExpense = NumberUtils.convertCent(json.getString("FINANCEEXP"));
        this.lossOnInvest = NumberUtils.convertCent(json.getString("INVLOSS"));
        this.deferredIncomeTax = NumberUtils.convertCent(json.getString("DEFERTAX"));
        this.deferredIncomeTaxReduction = NumberUtils.convertCent(json.getString("DEFERTAXASSETREDUCE"));
        this.deferredIncomeTaxLiabAdd = NumberUtils.convertCent(json.getString("DEFERTAXLIABADD"));
        this.anticipateLiabAdd = NumberUtils.convertCent(json.getString("ANTICIPATELIABADD"));
        this.inventoryReduce = NumberUtils.convertCent(json.getString("INVENTORYREDUCE"));
        this.operatingReduce = NumberUtils.convertCent(json.getString("OPERATERECREDUCE"));
        this.operatingPayAdd = NumberUtils.convertCent(json.getString("OPERATEPAYADD"));
        this.netCashOfOperatingOtherSup = NumberUtils.convertCent(json.getString("DEC_JYHDCSDXJLLJEQT"));
        this.netCashOfOperatingBalanceSup = NumberUtils.convertCent(json.getString("DEC_JYHDCSDXJLLJEPH"));
        this.netCashOfOperating = NumberUtils.convertCent(json.getString("DEC_JYHDCSDXJLLJE"));
        this.debtToCapital = NumberUtils.convertCent(json.getString("DEBTTOCAPITAL"));
        this.cboneyear = NumberUtils.convertCent(json.getString("CBONEYEAR"));
        this.fixedAssetUnderFinancingLease = NumberUtils.convertCent(json.getString("FINALEASEFIXEDASSET"));
        this.noReferCashOther = NumberUtils.convertCent(json.getString("NOREFERCASHOTHER"));
        this.periodEndingCash = NumberUtils.convertCent(json.getString("DEC_XJDQMYE"));
        this.periodBeginningCash = NumberUtils.convertCent(json.getString("DEC_XJDQCYE"));
        this.periodEndingMoneyEquivalent = NumberUtils.convertCent(json.getString("DEC_XJDJWQMYE"));
        this.periodBeginningMoneyEquivalent = NumberUtils.convertCent(json.getString("DEC_XJDJWQCYE"));
        this.moneyEquivalentOther = NumberUtils.convertCent(json.getString("DEC_XJJZJECETS"));
        this.moneyEquivalentBalance = NumberUtils.convertCent(json.getString("DEC_XJJZJECEHJ"));
        this.moneyEquivalentNetAdd = NumberUtils.convertCent(json.getString("DEC_XJJXJDJWJZJ"));
    }
}
