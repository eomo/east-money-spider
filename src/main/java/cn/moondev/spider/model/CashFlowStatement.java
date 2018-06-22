package cn.moondev.spider.model;

import cn.moondev.spider.utils.NumberUtils;
import cn.moondev.spider.utils.StringUtils;
import com.alibaba.fastjson.JSONObject;

/**
 * 现金流量表
 */
public class CashFlowStatement {

    // 日期类型
    public String dateType;

    // 股票代码
    public String securityCode;

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


    // 汇率变动对现金及现金等价物的影响
    public long effectExchangeRate;

    // 现金及现金等价物净增加额
    public long netIncreaseInCashEqui;

    // 加:期初现金及现金等价物余额
    public long cashInPeriodBeginning;

    // 期末现金及现金等价物余额(现金及现金等价物净增加额 + 期初现金及现金等价物余额)
    public long cashInPeriodEnding;

    public CashFlowStatement() {

    }

    public CashFlowStatement(JSONObject json) {
        this.securityCode = json.getString("SECURITYCODE");
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
    }
}
