package cn.moondev.spider.model;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 现金流量表
 */
public class CashFlowStatement {

    // 日期类型
    public String dateType;

    // 股票代码
    @JSONField(name="SECURITYCODE")
    public String securityCode;

    // 日期
    @JSONField(name = "REPORTDATE")
    public String reportDate;

    //******************************************
    //************第1部分：经营活动***************
    //******************************************
    // 销售商品、提供劳务收到的现金
    @JSONField(name = "SALEGOODSSERVICEREC")
    public long cashInSaleGoodLabourService;

    // 客户存款和同业存放款项净增加额
    @JSONField(name = "NIDEPOSIT")
    public long netIncreaseInDeposit;

    // 向中央银行借款净增加额
    @JSONField(name = "NIBORROWFROMCBANK")
    public long netIncreaseInLoanFromBank;

    // 向其他金融机构拆入资金净增加额
    @JSONField(name = "NIBORROWFROMFI")
    public long netIncreaseInLoanFromBankInstitution;

    // 收到原保险合同保费取得的现金
    @JSONField(name = "PREMIUMREC")
    public long cashInOriginalInsuranceContract;

    // 收到再保险业务现金净额
    @JSONField(name = "NETRIREC")
    public long netCashInReinsure;

    // 保户储金及投资款净增加额
    @JSONField(name = "NIINSUREDDEPOSITINV")
    public long netIncreaseDepositInvestment;

    // 处置交易性金融资产净增加额
    @JSONField(name = "NIDISPTRADEFASSET")
    public long netIncreaseInFinancialAsset;

    // 收取利息、手续费及佣金的现金
    @JSONField(name = "INTANDCOMMREC")
    public long cashInInterestCommission;

    // 拆入资金净增加额
    @JSONField(name = "NIBORROWFUND")
    public long netIncreaseBorrowFund;

    // 发放贷款及垫款的净减少额
    @JSONField(name = "NDLOANADVANCES")
    public long netReduceLoanAdvances;

    // 回购业务资金净增加额
    @JSONField(name = "NIBUYBACKFUND")
    public long netIncreaseBuybackFoud;

    // 收到的税费返还
    @JSONField(name = "TAXRETURNREC")
    public long taxReturn;

    // 收到其他与经营活动有关的现金
    @JSONField(name = "OTHEROPERATEREC")
    public long cashInOtherBusiness;

    // 经营活动现金流入小计
    @JSONField(name = "SUMOPERATEFLOWIN")
    public long sumCashRevenue;

    // 购买商品、接受劳务支付的现金
    @JSONField(name = "BUYGOODSSERVICEPAY")
    public long buyGoodLabourServicePayable;

    // 客户贷款及垫款净增加额
    @JSONField(name = "NILOANADVANCES")
    public long netIncreaseInLoanAdvances;

    // 存放中央银行和同业款项净增加额
    @JSONField(name = "NIDEPOSITINCBANKFI")
    public long netIncreaseInDepositInBank;

    // 支付原保险合同赔付款项的现金
    @JSONField(name = "INDEMNITYPAY")
    public long insuranceContractPayable;

    // 支付利息、手续费及佣金的现金
    @JSONField(name = "INTANDCOMMPAY")
    public long interestCommissionPayable;

    // 支付保单红利的现金
    @JSONField(name = "DIVIPAY")
    public long dividendPayable;

    // 支付给职工以及为职工支付的现金
    @JSONField(name = "EMPLOYEEPAY")
    public long employeePayable;

    // 支付的各项税费
    @JSONField(name = "TAXPAY")
    public long taxPayable;

    // 支付其他与经营活动有关的现金
    @JSONField(name = "OTHEROPERATEPAY")
    public long otherBusinessPayable;

    // 经营活动现金流出小计
    @JSONField(name = "SUMOPERATEFLOWOUT")
    public long sumCashPayable;

    // 经营活动产生的现金流量净额(现金流入小计 - 现金流出小计)
    @JSONField(name = "NETOPERATECASHFLOW")
    public long netCashInBusiness;


    //******************************************
    //************第2部分：投资活动***************
    //******************************************
    // 收回投资收到的现金
    @JSONField(name = "DISPOSALINVREC")
    public long cashByInvestment;

    // 取得投资收益收到的现金
    @JSONField(name = "INVINCOMEREC")
    public long cashByInvestmentReceived;

    // 处置固定资产、无形资产和其他长期资产收回的现金净额
    @JSONField(name = "DISPFILASSETREC")
    public long cashByDisposeAsset;

    // 处置子公司及其他营业单位收到的现金净额
    @JSONField(name = "DISPSUBSIDIARYREC")
    public long cashByDisposeSubsidiary;

    // 减少质押和定期存款所收到的现金
    @JSONField(name = "REDUCEPLEDGETDEPOSIT")
    public long cashByReducePledgeAndDeposit;

    // 收到其他与投资活动有关的现金
    @JSONField(name = "OTHERINVREC")
    public long cashByOtherInvestment;

    // 投资活动现金流入小计
    @JSONField(name = "SUMINVFLOWIN")
    public long sumInvestmentRevenue;

    // 购建固定资产、无形资产和其他长期资产支付的现金
    @JSONField(name = "BUYFILASSETPAY")
    public long buyAssetPayable;

    // 投资支付的现金
    @JSONField(name = "INVPAY")
    public long investmentPayable;

    // 质押贷款净增加额
    @JSONField(name = "NIPLEDGELOAN")
    public long netIncreaseInPledgeLoan;

    // 取得子公司及其他营业单位支付的现金净额
    @JSONField(name = "GETSUBSIDIARYPAY")
    public long getSubsidiaryPayable;

    // 增加质押和定期存款所支付的现金
    @JSONField(name = "ADDPLEDGETDEPOSIT")
    public long cashByAddPledgeAndDeposit;

    // 支付其他与投资活动有关的现金
    @JSONField(name = "OTHERINVPAY")
    public long otherInvestmentPayable;

    // 投资活动现金流出小计
    @JSONField(name = "SUMINVFLOWOUT")
    public long sumInvestmentPayable;

    // 投资活动产生的现金流量净额
    @JSONField(name = "NETINVCASHFLOW")
    public long netCashInInvestment;


    //******************************************
    //************第3部分：融资活动***************
    //******************************************
    // 吸收投资收到的现金
    @JSONField(name = "ACCEPTINVREC")
    public long cashByAcceptInvestment;

    // 子公司吸收少数股东投资收到的现金
    @JSONField(name = "SUBSIDIARYACCEPT")
    public long cashByAcceptSubsidiary;

    // 取得借款收到的现金
    @JSONField(name = "LOANREC")
    public long cashByLoan;

    // 发行债券收到的现金
    @JSONField(name = "ISSUEBONDREC")
    public long cashByIssuanceOfBonds;

    // 收到其他与筹资活动有关的现金
    @JSONField(name = "OTHERFINAREC")
    public long cashByOtherFinancing;

    // 筹资活动现金流入小计
    @JSONField(name = "SUMFINAFLOWIN")
    public long sumFinancingRevenue;

    // 偿还债务支付的现金
    @JSONField(name = "REPAYDEBTPAY")
    public long repaymentDebtPayable;

    // 分配股利、利润或偿付利息支付的现金
    @JSONField(name = "DIVIPROFITORINTPAY")
    public long dividendProfitInterestPayable;

    // 子公司支付给少数股东的股利、利润
    @JSONField(name = "SUBSIDIARYPAY")
    public long subsidiaryPayable;

    // 购买子公司少数股权而支付的现金
    @JSONField(name = "BUYSUBSIDIARYPAY")
    public long buySubsidiaryPayable;

    // 支付其他与筹资活动有关的现金
    @JSONField(name = "OTHERFINAPAY")
    public long otherFinancingPayable;

    // 子公司减资支付给少数股东的现金
    @JSONField(name = "SUBSIDIARYREDUCTCAPITAL")
    public long subsidiaryReduceCapital;

    // 筹资活动现金流出小计
    @JSONField(name = "SUMFINAFLOWOUT")
    public long sumFinancingPayable;

    // 筹资活动产生的现金流量净额
    @JSONField(name = "NETFINACASHFLOW")
    public long netCashInFinancing;


    // 汇率变动对现金及现金等价物的影响
    @JSONField(name = "EFFECTEXCHANGERATE")
    public long effectExchangeRate;

    // 现金及现金等价物净增加额
    @JSONField(name = "NICASHEQUI")
    public long netIncreaseInCashEqui;

    // 加:期初现金及现金等价物余额
    @JSONField(name = "CASHEQUIBEGINNING")
    public long cashInPeriodBeginning;

    // 期末现金及现金等价物余额(现金及现金等价物净增加额 + 期初现金及现金等价物余额)
    @JSONField(name = "CASHEQUIENDING")
    public long cashInPeriodEnding;
}
