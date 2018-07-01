CREATE TABLE `t_prospectus`(
    info_code varchar(32) NOT NULL DEFAULT '',
    notice_date varchar(32) NOT NULL DEFAULT '',
    attach_size varchar(32) NOT NULL DEFAULT '',
    end_date varchar(32) NOT NULL DEFAULT '',
    notice_title varchar(255) NOT NULL DEFAULT '',
    eutime varchar(32) NOT NULL DEFAULT '',
    security_variety_code varchar(32) NOT NULL DEFAULT '',
    security_type_code varchar(32) NOT NULL DEFAULT '',
    security_code varchar(16) NOT NULL DEFAULT '',
    security_full_name varchar(32) NOT NULL DEFAULT '',
    security_short_name varchar(32) NOT NULL DEFAULT '',
    security_type varchar(32) NOT NULL DEFAULT '',
    trade_market_code varchar(32) NOT NULL DEFAULT '',
    trade_market varchar(32) NOT NULL DEFAULT '',
    listing_stat varchar(32) NOT NULL DEFAULT '',
    company_code varchar(32) NOT NULL DEFAULT '',
    url varchar(255) NOT NULL DEFAULT '',
    direct_url varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`info_code`),
  KEY index_security_code (`security_code`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

CREATE TABLE t_balance_sheet(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
		security_code VARCHAR(16) NOT NULL DEFAULT '' COMMENT '股票代码',
    report_date VARCHAR(32) NOT NULL DEFAULT '' COMMENT '日期',
    date_type CHAR(1) NOT NULL DEFAULT '' COMMENT '日期类型:R(报告周期),Y(年),M(月)',
    stock_type VARCHAR(8) NOT NULL DEFAULT '' COMMENT '股票类型',
    monetary_fund BIGINT NOT NULL DEFAULT 0 COMMENT '货币资金',
    settlement_provision BIGINT NOT NULL DEFAULT 0 COMMENT '结算备付金',
    lend_fund BIGINT NOT NULL DEFAULT 0 COMMENT '拆出资金',
    fair_value_financial_asset BIGINT NOT NULL DEFAULT 0 COMMENT '以公允价值计量且其变动计入当期损益的金融资产',
    trade_financial_asset BIGINT NOT NULL DEFAULT 0 COMMENT '交易性金融资产',
    define_fair_value_financial_asset BIGINT NOT NULL DEFAULT 0 COMMENT '指定为以公允价值计量且其变动计入当期损益的金融资产',
    bill_receivable BIGINT NOT NULL DEFAULT 0 COMMENT '应收票据',
    accounts_receivable BIGINT NOT NULL DEFAULT 0 COMMENT '应收账款',
    prepayments BIGINT NOT NULL DEFAULT 0 COMMENT '预付款项',
    premiums_receivable BIGINT NOT NULL DEFAULT 0 COMMENT '应收保费',
    accounts_receivable_reinsurance BIGINT NOT NULL DEFAULT 0 COMMENT '应收分保账款(指公司开展分保业务而发生的各种应收款项)',
    receivable_reinsurance_contract_reserve BIGINT NOT NULL DEFAULT 0 COMMENT '应收分保合同准备金',
    interest_receivable BIGINT NOT NULL DEFAULT 0 COMMENT '应收利息',
    dividend_receivable BIGINT NOT NULL DEFAULT 0 COMMENT '应收股利',
    other_receivable BIGINT NOT NULL DEFAULT 0 COMMENT '其他应收款',
    receivable_export_tax_rebate BIGINT NOT NULL DEFAULT 0 COMMENT '应收出口退税',
    subsidy_receivable BIGINT NOT NULL DEFAULT 0 COMMENT '应收补贴款',
    internal_receivable BIGINT NOT NULL DEFAULT 0 COMMENT '内部应收款',
    buy_back_resale_financial_asset BIGINT NOT NULL DEFAULT 0 COMMENT '买入返售金融资产',
    inventory BIGINT NOT NULL DEFAULT 0 COMMENT '存货',
    assets_held_for_sale BIGINT NOT NULL DEFAULT 0 COMMENT '划分为持有待售的资产',
    non_liquid_asset_one_year BIGINT NOT NULL DEFAULT 0 COMMENT '一年内到期的非流动资产',
    other_liquid_asset BIGINT NOT NULL DEFAULT 0 COMMENT '其他流动资产',
    sum_liquid_asset BIGINT NOT NULL DEFAULT 0 COMMENT '流动资产合计',
    agent_asset BIGINT NOT NULL DEFAULT 0 COMMENT '代理业务资产(新三板)',
    liquid_asset_other BIGINT NOT NULL DEFAULT 0 COMMENT '流动资产其他项目(新三板)',
    liquid_asset_balance BIGINT NOT NULL DEFAULT 0 COMMENT '流动资产平衡项目(新三板)',
    loan_advances BIGINT NOT NULL DEFAULT 0 COMMENT '发放委托贷款及垫款',
    saleable_financial_asset BIGINT NOT NULL DEFAULT 0 COMMENT '可供出售金融资产',
    held_maturity_investment BIGINT NOT NULL DEFAULT 0 COMMENT '持有至到期的投资',
    long_term_receivable BIGINT NOT NULL DEFAULT 0 COMMENT '长期应收款',
    long_term_equity_investment BIGINT NOT NULL DEFAULT 0 COMMENT '长期股权投资',
    estate_investment BIGINT NOT NULL DEFAULT 0 COMMENT '投资性房地产',
    fixed_asset BIGINT NOT NULL DEFAULT 0 COMMENT '固定资产',
    construction_in_progress BIGINT NOT NULL DEFAULT 0 COMMENT '在建工程',
    construction_material BIGINT NOT NULL DEFAULT 0 COMMENT '工程物资',
    liquidate_fixed_asset BIGINT NOT NULL DEFAULT 0 COMMENT '固定资产清理',
    product_biology_asset BIGINT NOT NULL DEFAULT 0 COMMENT '生产性生物资产',
    oil_gas_asset BIGINT NOT NULL DEFAULT 0 COMMENT '油气资产',
    intangible_asset BIGINT NOT NULL DEFAULT 0 COMMENT '无形资产',
    developexp BIGINT NOT NULL DEFAULT 0 COMMENT '开发支出',
    goodwill BIGINT NOT NULL DEFAULT 0 COMMENT '商誉',
    long_term_defer_asset BIGINT NOT NULL DEFAULT 0 COMMENT '长期待摊费用',
    deferred_income_tax_asset BIGINT NOT NULL DEFAULT 0 COMMENT '递延所得税资产',
    other_non_liquid_asset BIGINT NOT NULL DEFAULT 0 COMMENT '其他非流动资产',
    sum_non_liquid_asset BIGINT NOT NULL DEFAULT 0 COMMENT '非流动资产合计',
    sum_asset BIGINT NOT NULL DEFAULT 0 COMMENT '资产总计',
    non_liquid_asset_other BIGINT NOT NULL DEFAULT 0 COMMENT '非流动资产其他项目(新三板)',
    non_liquid_asset_balance BIGINT NOT NULL DEFAULT 0 COMMENT '非流动资产平衡项目(新三板)',
    asset_other BIGINT NOT NULL DEFAULT 0 COMMENT '资产其他项目(新三板)',
    asset_balance BIGINT NOT NULL DEFAULT 0 COMMENT '资产平衡项目(新三板)',
    short_term_loan BIGINT NOT NULL DEFAULT 0 COMMENT '短期借款',
    loan_from_center_bank BIGINT NOT NULL DEFAULT 0 COMMENT '向中央银行借款',
    deposit BIGINT NOT NULL DEFAULT 0 COMMENT '吸收存款及同业存放',
    loan_from_other_bank BIGINT NOT NULL DEFAULT 0 COMMENT '拆入资金',
    fair_value_financial_liabilities BIGINT NOT NULL DEFAULT 0 COMMENT '以公允价值计量且其变动计入当期损益的金融负债',
    trade_financial_liabilities BIGINT NOT NULL DEFAULT 0 COMMENT '其中：交易性金融负债',
    define_fair_value_financial_liabilities BIGINT NOT NULL DEFAULT 0 COMMENT '指定以公允价值计量且其变动计入当期损益的金融负债',
    bill_payable BIGINT NOT NULL DEFAULT 0 COMMENT '应付票据',
    accounts_payable BIGINT NOT NULL DEFAULT 0 COMMENT '应付账款',
    advances_received BIGINT NOT NULL DEFAULT 0 COMMENT '预收款项',
    financial_assets_sold_for_repurchase BIGINT NOT NULL DEFAULT 0 COMMENT '卖出回购金融资产款',
    fee_commission_payable BIGINT NOT NULL DEFAULT 0 COMMENT '应付手续费及佣金',
    salary_payable BIGINT NOT NULL DEFAULT 0 COMMENT '应付职工薪酬',
    tax_payable BIGINT NOT NULL DEFAULT 0 COMMENT '应交税费',
    interest_ined BIGINT NOT NULL DEFAULT 0 COMMENT '应付利息',
    dividends_payable BIGINT NOT NULL DEFAULT 0 COMMENT '应付股利',
    accounts_payable_reinsurance BIGINT NOT NULL DEFAULT 0 COMMENT '应付分保账款',
    internal_payable BIGINT NOT NULL DEFAULT 0 COMMENT '内部应付款',
    other_payable BIGINT NOT NULL DEFAULT 0 COMMENT '其他应付款',
    anticipate_cash_liabilities BIGINT NOT NULL DEFAULT 0 COMMENT '预计流动负债',
    reserve_fund_for_insurance_contracts BIGINT NOT NULL DEFAULT 0 COMMENT '保险合同准备金',
    acting_trading_securities BIGINT NOT NULL DEFAULT 0 COMMENT '代理买卖证券款',
    acting_underwriting_securities BIGINT NOT NULL DEFAULT 0 COMMENT '代理承销证券款',
    deferred_income_one_year BIGINT NOT NULL DEFAULT 0 COMMENT '一年内的递延收益',
    short_term_bonds_payable BIGINT NOT NULL DEFAULT 0 COMMENT '应付短期债券',
    liabilities_for_sale BIGINT NOT NULL DEFAULT 0 COMMENT '划分为持有待售的负债',
    non_cash_liabilities_one_year BIGINT NOT NULL DEFAULT 0 COMMENT '一年内到期的非流动负债',
    other_cash_liabilities BIGINT NOT NULL DEFAULT 0 COMMENT '其他流动负债',
    sum_cash_liabilities BIGINT NOT NULL DEFAULT 0 COMMENT '流动负债合计',
    agent_liabilities BIGINT NOT NULL DEFAULT 0 COMMENT '代理业务负债(新三板)',
    cash_liabilities_other BIGINT NOT NULL DEFAULT 0 COMMENT '流动负债其他项目(新三板)',
    cash_liabilities_balance BIGINT NOT NULL DEFAULT 0 COMMENT '流动负债平衡项目(新三板)',
    long_term_loan BIGINT NOT NULL DEFAULT 0 COMMENT '长期借款',
    bond_payable BIGINT NOT NULL DEFAULT 0 COMMENT '应付债券',
    prefer_stock_bond BIGINT NOT NULL DEFAULT 0 COMMENT '应付债券-优先股',
    sustain_stock_bond BIGINT NOT NULL DEFAULT 0 COMMENT '应付债券-永续股',
    long_term_account_payable BIGINT NOT NULL DEFAULT 0 COMMENT '长期应付款',
    long_term_salary_payable BIGINT NOT NULL DEFAULT 0 COMMENT '长期应付职工薪酬',
    account_payable_special_funds BIGINT NOT NULL DEFAULT 0 COMMENT '专项应付款',
    estimated_liabilities BIGINT NOT NULL DEFAULT 0 COMMENT '预计负债',
    deferred_income BIGINT NOT NULL DEFAULT 0 COMMENT '递延收益',
    deferred_tax_liability BIGINT NOT NULL DEFAULT 0 COMMENT '递延所得税负债',
    other_non_current_liabilities BIGINT NOT NULL DEFAULT 0 COMMENT '其他非流动负债',
    sum_non_current_liabilities BIGINT NOT NULL DEFAULT 0 COMMENT '非流动负债合计',
    sum_liabilities BIGINT NOT NULL DEFAULT 0 COMMENT '负债合计',
    liabilities_other BIGINT NOT NULL DEFAULT 0 COMMENT '负债其他项目(新三板)',
    liabilities_balance BIGINT NOT NULL DEFAULT 0 COMMENT '负债平衡项目(新三板)',
    paid_in_capital BIGINT NOT NULL DEFAULT 0 COMMENT '实收资本（或股本)',
    other_equity BIGINT NOT NULL DEFAULT 0 COMMENT '其他权益工具',
    preferredtock BIGINT NOT NULL DEFAULT 0 COMMENT '其他权益工具-优先股',
    sustainable_debt BIGINT NOT NULL DEFAULT 0 COMMENT '其他权益工具-永续债',
    other_equity_other BIGINT NOT NULL DEFAULT 0 COMMENT '其他权益工具-其他权益工具',
    capital_reserve BIGINT NOT NULL DEFAULT 0 COMMENT '资本公积',
    inventory_share BIGINT NOT NULL DEFAULT 0 COMMENT '库存股',
    special_reserve BIGINT NOT NULL DEFAULT 0 COMMENT '专项储备',
    surplus_reserve BIGINT NOT NULL DEFAULT 0 COMMENT '盈余公积',
    general_risk_prepare BIGINT NOT NULL DEFAULT 0 COMMENT '一般风险准备',
    unconfirm_investment_loss BIGINT NOT NULL DEFAULT 0 COMMENT '未确定的投资损失',
    undistributed_profit BIGINT NOT NULL DEFAULT 0 COMMENT '未分配利润',
    plancashdivi BIGINT NOT NULL DEFAULT 0 COMMENT '拟分配现金股利',
    diffconversionfc BIGINT NOT NULL DEFAULT 0 COMMENT '外币报表折算差额',
    sum_parent_equity BIGINT NOT NULL DEFAULT 0 COMMENT '归属于母公司股东权益合计',
    minority_equity BIGINT NOT NULL DEFAULT 0 COMMENT '少数股东权益',
    sumshequity BIGINT NOT NULL DEFAULT 0 COMMENT '股东权益合计',
    sumliabshequity BIGINT NOT NULL DEFAULT 0 COMMENT '负债和股东权益合计',
    parent_equity_other BIGINT NOT NULL DEFAULT 0 COMMENT '归属于母公司股东权益其他项目(新三板)',
    parent_equity_balance BIGINT NOT NULL DEFAULT 0 COMMENT '归属于母公司股东权益平衡项目(新三板)',
    sh_equity_other BIGINT NOT NULL DEFAULT 0 COMMENT '股东权益其他项目(新三板)',
    sh_equity_balance BIGINT NOT NULL DEFAULT 0 COMMENT '股东权益平衡项目(新三板)',
    lish_equity_other BIGINT NOT NULL DEFAULT 0 COMMENT '负债和股东权益其他项目(新三板)',
    lish_equity_balance BIGINT NOT NULL DEFAULT 0 COMMENT '负债和股东权益平衡项目(新三板)',
    UNIQUE KEY unique_index_code_date(`security_code`,`report_date`,`date_type`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

CREATE TABLE t_cash_flow_statement(
        id BIGINT PRIMARY KEY AUTO_INCREMENT,
        security_code VARCHAR(16) NOT NULL DEFAULT '' COMMENT '股票代码',
        report_date VARCHAR(32) NOT NULL DEFAULT '' COMMENT '日期',
        date_type CHAR(1) NOT NULL DEFAULT '' COMMENT '日期类型:R(报告周期),Y(年),M(月)',
        stock_type VARCHAR(8) NOT NULL DEFAULT '' COMMENT '股票类型',
        cash_in_sale_good_labour_service BIGINT NOT NULL DEFAULT 0 COMMENT '销售商品、提供劳务收到的现金',
        net_increase_in_deposit BIGINT NOT NULL DEFAULT 0 COMMENT '客户存款和同业存放款项净增加额',
        net_increase_in_loan_from_bank BIGINT NOT NULL DEFAULT 0 COMMENT '向中央银行借款净增加额',
        net_increase_in_loan_from_bank_institution BIGINT NOT NULL DEFAULT 0 COMMENT '向其他金融机构拆入资金净增加额',
        cash_in_original_insurance_contract BIGINT NOT NULL DEFAULT 0 COMMENT '收到原保险合同保费取得的现金',
        net_cash_in_reinsure BIGINT NOT NULL DEFAULT 0 COMMENT '收到再保险业务现金净额',
        net_increase_deposit_investment BIGINT NOT NULL DEFAULT 0 COMMENT '保户储金及投资款净增加额',
        net_increase_in_financial_asset BIGINT NOT NULL DEFAULT 0 COMMENT '处置交易性金融资产净增加额',
        cash_in_interest_commission BIGINT NOT NULL DEFAULT 0 COMMENT '收取利息、手续费及佣金的现金',
        net_increase_borrow_fund BIGINT NOT NULL DEFAULT 0 COMMENT '拆入资金净增加额',
        net_reduce_loan_advances BIGINT NOT NULL DEFAULT 0 COMMENT '发放贷款及垫款的净减少额',
        net_increase_buyback_foud BIGINT NOT NULL DEFAULT 0 COMMENT '回购业务资金净增加额',
        tax_return BIGINT NOT NULL DEFAULT 0 COMMENT '收到的税费返还',
        cash_in_other_business BIGINT NOT NULL DEFAULT 0 COMMENT '收到其他与经营活动有关的现金',
        sum_cash_revenue BIGINT NOT NULL DEFAULT 0 COMMENT '经营活动现金流入小计',
        buy_good_labour_service_payable BIGINT NOT NULL DEFAULT 0 COMMENT '购买商品、接受劳务支付的现金',
        net_increase_in_loan_advances BIGINT NOT NULL DEFAULT 0 COMMENT '客户贷款及垫款净增加额',
        net_increase_in_deposit_in_bank BIGINT NOT NULL DEFAULT 0 COMMENT '存放中央银行和同业款项净增加额',
        insurance_contract_payable BIGINT NOT NULL DEFAULT 0 COMMENT '支付原保险合同赔付款项的现金',
        interest_commission_payable BIGINT NOT NULL DEFAULT 0 COMMENT '支付利息、手续费及佣金的现金',
        dividend_payable BIGINT NOT NULL DEFAULT 0 COMMENT '支付保单红利的现金',
        employee_payable BIGINT NOT NULL DEFAULT 0 COMMENT '支付给职工以及为职工支付的现金',
        tax_payable BIGINT NOT NULL DEFAULT 0 COMMENT '支付的各项税费',
        other_business_payable BIGINT NOT NULL DEFAULT 0 COMMENT '支付其他与经营活动有关的现金',
        sum_cash_payable BIGINT NOT NULL DEFAULT 0 COMMENT '经营活动现金流出小计',
        net_cash_in_business BIGINT NOT NULL DEFAULT 0 COMMENT '经营活动产生的现金流量净额(现金流入小计 - 现金流出小计)',
        operating_cash_in_other BIGINT NOT NULL DEFAULT 0 COMMENT '经营活动现金流入的其他项目(新三板)',
        operating_cash_in_balance BIGINT NOT NULL DEFAULT 0 COMMENT '经营活动现金流入的平衡项目(新三板)',
        operating_cash_out_other BIGINT NOT NULL DEFAULT 0 COMMENT '经营活动现金流出的其他项目(新三板)',
        operating_cash_out_balance BIGINT NOT NULL DEFAULT 0 COMMENT '经营活动现金流出的平衡项目(新三板)',
        operating_net_cash_other BIGINT NOT NULL DEFAULT 0 COMMENT '经营活动产生的现金流量净额其他项目(新三板)',
        operating_net_cash_balance BIGINT NOT NULL DEFAULT 0 COMMENT '经营活动产生的现金流量净额平衡项目(新三板)',
        cash_by_investment BIGINT NOT NULL DEFAULT 0 COMMENT '收回投资收到的现金',
        cash_by_investment_received BIGINT NOT NULL DEFAULT 0 COMMENT '取得投资收益收到的现金',
        cash_by_dispose_asset BIGINT NOT NULL DEFAULT 0 COMMENT '处置固定资产、无形资产和其他长期资产收回的现金净额',
        cash_by_dispose_subsidiary BIGINT NOT NULL DEFAULT 0 COMMENT '处置子公司及其他营业单位收到的现金净额',
        cash_by_reduce_pledge_and_deposit BIGINT NOT NULL DEFAULT 0 COMMENT '减少质押和定期存款所收到的现金',
        cash_by_other_investment BIGINT NOT NULL DEFAULT 0 COMMENT '收到其他与投资活动有关的现金',
        sum_investment_revenue BIGINT NOT NULL DEFAULT 0 COMMENT '投资活动现金流入小计',
        buy_asset_payable BIGINT NOT NULL DEFAULT 0 COMMENT '购建固定资产、无形资产和其他长期资产支付的现金',
        investment_payable BIGINT NOT NULL DEFAULT 0 COMMENT '投资支付的现金',
        net_increase_in_pledge_loan BIGINT NOT NULL DEFAULT 0 COMMENT '质押贷款净增加额',
        get_subsidiary_payable BIGINT NOT NULL DEFAULT 0 COMMENT '取得子公司及其他营业单位支付的现金净额',
        cash_by_add_pledge_and_deposit BIGINT NOT NULL DEFAULT 0 COMMENT '增加质押和定期存款所支付的现金',
        other_investment_payable BIGINT NOT NULL DEFAULT 0 COMMENT '支付其他与投资活动有关的现金',
        sum_investment_payable BIGINT NOT NULL DEFAULT 0 COMMENT '投资活动现金流出小计',
        net_cash_in_investment BIGINT NOT NULL DEFAULT 0 COMMENT '投资活动产生的现金流量净额',
        invest_cash_in_other BIGINT NOT NULL DEFAULT 0 COMMENT '投资活动现金流入的其他项目(新三板)',
        invest_cash_in_balance BIGINT NOT NULL DEFAULT 0 COMMENT '投资活动现金流入的平衡项目(新三板)',
        invest_cash_out_other BIGINT NOT NULL DEFAULT 0 COMMENT '投资活动现金流出的其他项目(新三板)',
        invest_cash_out_balance BIGINT NOT NULL DEFAULT 0 COMMENT '投资活动现金流出的平衡项目(新三板)',
        invest_net_cash_other BIGINT NOT NULL DEFAULT 0 COMMENT '投资活动产生的现金流量净额其他项目(新三板)',
        invest_net_cash_balance BIGINT NOT NULL DEFAULT 0 COMMENT '投资活动产生的现金流量净额平衡项目(新三板)',
        cash_by_accept_investment BIGINT NOT NULL DEFAULT 0 COMMENT '吸收投资收到的现金',
        cash_by_accept_subsidiary BIGINT NOT NULL DEFAULT 0 COMMENT '子公司吸收少数股东投资收到的现金',
        cash_by_loan BIGINT NOT NULL DEFAULT 0 COMMENT '取得借款收到的现金',
        cash_by_issuance_of_bonds BIGINT NOT NULL DEFAULT 0 COMMENT '发行债券收到的现金',
        cash_by_other_financing BIGINT NOT NULL DEFAULT 0 COMMENT '收到其他与筹资活动有关的现金',
        sum_financing_revenue BIGINT NOT NULL DEFAULT 0 COMMENT '筹资活动现金流入小计',
        repayment_debt_payable BIGINT NOT NULL DEFAULT 0 COMMENT '偿还债务支付的现金',
        dividend_profit_interest_payable BIGINT NOT NULL DEFAULT 0 COMMENT '分配股利、利润或偿付利息支付的现金',
        subsidiary_payable BIGINT NOT NULL DEFAULT 0 COMMENT '子公司支付给少数股东的股利、利润',
        buy_subsidiary_payable BIGINT NOT NULL DEFAULT 0 COMMENT '购买子公司少数股权而支付的现金',
        other_financing_payable BIGINT NOT NULL DEFAULT 0 COMMENT '支付其他与筹资活动有关的现金',
        subsidiary_reduce_capital BIGINT NOT NULL DEFAULT 0 COMMENT '子公司减资支付给少数股东的现金',
        sum_financing_payable BIGINT NOT NULL DEFAULT 0 COMMENT '筹资活动现金流出小计',
        net_cash_in_financing BIGINT NOT NULL DEFAULT 0 COMMENT '筹资活动产生的现金流量净额',
        financing_cash_in_other BIGINT NOT NULL DEFAULT 0 COMMENT '筹资活动现金流入的其他项目(新三板)',
        financing_cash_in_balance BIGINT NOT NULL DEFAULT 0 COMMENT '筹资活动现金流入的平衡项目(新三板)',
        financing_cash_out_other BIGINT NOT NULL DEFAULT 0 COMMENT '筹资活动现金流出的其他项目(新三板)',
        financing_cash_out_balance BIGINT NOT NULL DEFAULT 0 COMMENT '筹资活动现金流出的平衡项目(新三板)',
        financing_net_cash_other BIGINT NOT NULL DEFAULT 0 COMMENT '筹资活动产生的现金流量净额其他项目(新三板)',
        financing_net_cash_balance BIGINT NOT NULL DEFAULT 0 COMMENT '筹资活动产生的现金流量净额平衡项目(新三板)',
        effect_exchange_rate BIGINT NOT NULL DEFAULT 0 COMMENT '汇率变动对现金及现金等价物的影响',
        net_increase_in_cash_equi BIGINT NOT NULL DEFAULT 0 COMMENT '现金及现金等价物净增加额',
        cash_in_period_beginning BIGINT NOT NULL DEFAULT 0 COMMENT '加:期初现金及现金等价物余额',
        cash_in_period_ending BIGINT NOT NULL DEFAULT 0 COMMENT '期末现金及现金等价物余额(现金及现金等价物净增加额 + 期初现金及现金等价物余额)',
        net_increase_in_cash_equi_other BIGINT NOT NULL DEFAULT 0 COMMENT '现金及现金等价物净增加额其他项目(新三板)',
        net_increase_in_cash_equi_balance BIGINT NOT NULL DEFAULT 0 COMMENT '现金及现金等价物净增加额平衡项目(新三板)',
        cash_in_period_ending_other BIGINT NOT NULL DEFAULT 0 COMMENT '期末现金及现金等价物余额其他项目(新三板)',
        cash_in_period_ending_balance BIGINT NOT NULL DEFAULT 0 COMMENT '期末现金及现金等价物余额平衡项目(新三板)',
        net_profit BIGINT NOT NULL DEFAULT 0 COMMENT '净利润(新三板)',
        asset_reduce_value BIGINT NOT NULL DEFAULT 0 COMMENT '资产减值准备(新三板)',
        fixed_estate_asset_depreciation BIGINT NOT NULL DEFAULT 0 COMMENT '固定资产和投资性房地产折旧(新三板)',
        fixed_gass_production_asset_depr BIGINT NOT NULL DEFAULT 0 COMMENT '其中:固定资产折旧、油气资产折耗、生产性生物资产折旧(新三板)',
        estate_invest_depr BIGINT NOT NULL DEFAULT 0 COMMENT '投资性房地产折旧(新三板)',
        amortization_of_intangible_asset BIGINT NOT NULL DEFAULT 0 COMMENT '无形资产摊销(新三板)',
        amortization_of_long_term_expense BIGINT NOT NULL DEFAULT 0 COMMENT '长期待摊费用摊销(新三板)',
        amortization_of_deferred_income BIGINT NOT NULL DEFAULT 0 COMMENT '递延收益摊销(新三板)',
        reduced_cost_of_apportioned BIGINT NOT NULL DEFAULT 0 COMMENT '待摊费用的减少(新三板)',
        drawing_expense_add BIGINT NOT NULL DEFAULT 0 COMMENT '预提费用的增加(新三板)',
        loss_on_disponse_assert BIGINT NOT NULL DEFAULT 0 COMMENT '处置固定资产、无形资产和其他长期资产的损失(新三板)',
        loss_on_fixed_asset BIGINT NOT NULL DEFAULT 0 COMMENT '固定资产报废损失(新三板)',
        loss_on_fair_value BIGINT NOT NULL DEFAULT 0 COMMENT '公允价值变动损失(新三板)',
        financial_expense BIGINT NOT NULL DEFAULT 0 COMMENT '财务费用(新三板)',
        loss_on_invest BIGINT NOT NULL DEFAULT 0 COMMENT '投资损失(新三板)',
        deferred_income_tax BIGINT NOT NULL DEFAULT 0 COMMENT '递延所得税(新三板)',
        deferred_income_tax_reduction BIGINT NOT NULL DEFAULT 0 COMMENT '其中:递延所得税资产减少(新三板)',
        deferred_income_tax_liab_add BIGINT NOT NULL DEFAULT 0 COMMENT '递延所得税负债增加(新三板)',
        anticipate_liab_add BIGINT NOT NULL DEFAULT 0 COMMENT '预计负债的增加(新三板)',
        inventory_reduce BIGINT NOT NULL DEFAULT 0 COMMENT '存货的减少(新三板)',
        operating_reduce BIGINT NOT NULL DEFAULT 0 COMMENT '经营性应收项目的减少(新三板)',
        operating_pay_add BIGINT NOT NULL DEFAULT 0 COMMENT '经营性应付项目的增加(新三板)',
        net_cash_of_operating_other_sup BIGINT NOT NULL DEFAULT 0 COMMENT '补充资料经营活动产生的现金流量净额其他项目(新三板)',
        net_cash_of_operating_balance_sup BIGINT NOT NULL DEFAULT 0 COMMENT '补充资料经营活动产生的现金流量净额平衡项目(新三板)',
        net_cash_of_operating BIGINT NOT NULL DEFAULT 0 COMMENT '经营活动产生的现金流量净额(新三板)',
        debt_to_capital BIGINT NOT NULL DEFAULT 0 COMMENT '债务转为资本(新三板)',
        cboneyear BIGINT NOT NULL DEFAULT 0 COMMENT '一年内到期的可转换公司债券(新三板)',
        fixed_asset_under_financing_lease BIGINT NOT NULL DEFAULT 0 COMMENT '融资租入固定资产(新三板)',
        no_refer_cash_other BIGINT NOT NULL DEFAULT 0 COMMENT '不涉及现金收支的投资和筹资活动金额其他项目(新三板)',
        period_ending_cash BIGINT NOT NULL DEFAULT 0 COMMENT '现金的期末余额(新三板)',
        period_beginning_cash BIGINT NOT NULL DEFAULT 0 COMMENT '减:现金的期初余额(新三板)',
        period_ending_money_equivalent BIGINT NOT NULL DEFAULT 0 COMMENT '加:现金等价物的期末余额(新三板)',
        period_beginning_money_equivalent BIGINT NOT NULL DEFAULT 0 COMMENT '减:现金等价物的期初余额(新三板)',
        money_equivalent_other BIGINT NOT NULL DEFAULT 0 COMMENT '现金及现金等价物净增加额其他项目(新三板)',
        money_equivalent_balance BIGINT NOT NULL DEFAULT 0 COMMENT '现金及现金等价物净增加额平衡项目(新三板)',
        money_equivalent_net_add BIGINT NOT NULL DEFAULT 0 COMMENT '现金及现金等价物的净增加额(新三板)',
        UNIQUE KEY unique_index_code_date(`security_code`,`report_date`,`date_type`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

CREATE TABLE t_income_statement(
        id BIGINT PRIMARY KEY AUTO_INCREMENT,
        security_code VARCHAR(16) NOT NULL DEFAULT '' COMMENT '股票代码',
        report_date VARCHAR(32) NOT NULL DEFAULT '' COMMENT '日期',
        date_type CHAR(1) NOT NULL DEFAULT '' COMMENT '日期类型:R(报告周期),Y(年),M(月)',
        stock_type VARCHAR(8) NOT NULL DEFAULT '' COMMENT '股票类型',
        gross_revenue BIGINT NOT NULL DEFAULT 0 COMMENT '营业总收入',
        operating_receipt BIGINT NOT NULL DEFAULT 0 COMMENT '营业收入',
        interest_revenue BIGINT NOT NULL DEFAULT 0 COMMENT '利息收入',
        premium_earned BIGINT NOT NULL DEFAULT 0 COMMENT '已赚保费',
        commreve BIGINT NOT NULL DEFAULT 0 COMMENT '手续费及佣金收入',
        other_revenue BIGINT NOT NULL DEFAULT 0 COMMENT '其他业务收入',
        gross_revenue_other BIGINT NOT NULL DEFAULT 0 COMMENT '营业总收入其他项目(新三板)',
        total_operating_cost BIGINT NOT NULL DEFAULT 0 COMMENT '营业总成本',
        operating_cost BIGINT NOT NULL DEFAULT 0 COMMENT '营业成本',
        interest_exp BIGINT NOT NULL DEFAULT 0 COMMENT '利息支出',
        commission_exp BIGINT NOT NULL DEFAULT 0 COMMENT '手续费及佣金支出',
        rd_exp BIGINT NOT NULL DEFAULT 0 COMMENT '研发费用',
        surrender_premium BIGINT NOT NULL DEFAULT 0 COMMENT '退保金',
        net_indemnity_exp BIGINT NOT NULL DEFAULT 0 COMMENT '赔付支出净额',
        net_contract_reserve BIGINT NOT NULL DEFAULT 0 COMMENT '提取保险合同准备金净额',
        expenditures_dividend_policy BIGINT NOT NULL DEFAULT 0 COMMENT '保单红利支出',
        amortized_reinsurance_exp BIGINT NOT NULL DEFAULT 0 COMMENT '分保费用',
        other_exp BIGINT NOT NULL DEFAULT 0 COMMENT '其他业务成本',
        sales_tax BIGINT NOT NULL DEFAULT 0 COMMENT '营业税金及附加',
        sales_exp BIGINT NOT NULL DEFAULT 0 COMMENT '销售费用',
        manage_exp BIGINT NOT NULL DEFAULT 0 COMMENT '管理费用',
        financial_exp BIGINT NOT NULL DEFAULT 0 COMMENT '财务费用',
        asset_value_loss BIGINT NOT NULL DEFAULT 0 COMMENT '资产减值损失',
        operating_cost_other BIGINT NOT NULL DEFAULT 0 COMMENT '营业总成本其他项目(新三板)',
        fair_value_income BIGINT NOT NULL DEFAULT 0 COMMENT '加:公允价值变动收益',
        investment_income BIGINT NOT NULL DEFAULT 0 COMMENT '投资收益',
        investment_join_income BIGINT NOT NULL DEFAULT 0 COMMENT '其中:对联营企业和合营企业的投资收益',
        exchange_income BIGINT NOT NULL DEFAULT 0 COMMENT '汇兑收益',
        operating_profit BIGINT NOT NULL DEFAULT 0 COMMENT '营业利润',
        non_business_revenue BIGINT NOT NULL DEFAULT 0 COMMENT '加:营业外收入',
        non_current_asset_revenue BIGINT NOT NULL DEFAULT 0 COMMENT '营业外收入中，非流动资产处置利得',
        non_business_exp BIGINT NOT NULL DEFAULT 0 COMMENT '减:营业外支出',
        non_current_asset_loss BIGINT NOT NULL DEFAULT 0 COMMENT '营业外支出中，非流动资产处置净损失',
        operating_profit_other BIGINT NOT NULL DEFAULT 0 COMMENT '营业利润其他项目(新三板)',
        operating_profit_balance BIGINT NOT NULL DEFAULT 0 COMMENT '营业利润平衡项目(新三板)',
        sum_profit BIGINT NOT NULL DEFAULT 0 COMMENT '利润总额',
        income_tax BIGINT NOT NULL DEFAULT 0 COMMENT '减:所得税费用',
        sum_profit_other BIGINT NOT NULL DEFAULT 0 COMMENT '加:影响利润总额的其他项目(新三板)',
        sum_profit_balance BIGINT NOT NULL DEFAULT 0 COMMENT '利润总额平衡项目(新三板)',
        combined_net_profit BIGINT NOT NULL DEFAULT 0 COMMENT '被合并方在合并前实现利润',
        net_profit BIGINT NOT NULL DEFAULT 0 COMMENT '净利润（利润总额-所得税费用-被合并方在合并前实现利润）',
        parent_net_profit BIGINT NOT NULL DEFAULT 0 COMMENT '其中:归属于母公司股东的净利润',
        minority_income BIGINT NOT NULL DEFAULT 0 COMMENT '少数股东损益',
        net_profit_after_loss BIGINT NOT NULL DEFAULT 0 COMMENT '扣除非经常性损益后的净利润',
        plus_net_profit_other BIGINT NOT NULL DEFAULT 0 COMMENT '加:影响净利润的其他项目(新三板)',
        unconfirm_invest_loss BIGINT NOT NULL DEFAULT 0 COMMENT '未确认投资损失(新三板)',
        minus_net_profit_other BIGINT NOT NULL DEFAULT 0 COMMENT '净利润其他项目(新三板)',
        net_profit_balance BIGINT NOT NULL DEFAULT 0 COMMENT '净利润差额(合计平衡项目)',
        basic_eps BIGINT NOT NULL DEFAULT 0 COMMENT '基本每股收益',
        diluted_eps BIGINT NOT NULL DEFAULT 0 COMMENT '稀释每股收益',
        oci BIGINT NOT NULL DEFAULT 0 COMMENT '其他综合收益',
        parent_company_oci BIGINT NOT NULL DEFAULT 0 COMMENT '归属于母公司股东的其他综合收益',
        minority_shareholder_oci BIGINT NOT NULL DEFAULT 0 COMMENT '归属于少数股东的其他综合收益',
        sumci BIGINT NOT NULL DEFAULT 0 COMMENT '综合收益总额',
        parent_compay_ci BIGINT NOT NULL DEFAULT 0 COMMENT '归属于母公司所有者的综合收益总额',
        minority_shareholder_ci BIGINT NOT NULL DEFAULT 0 COMMENT '归属于少数股东的综合收益总额',
        UNIQUE KEY unique_index_code_date(`security_code`,`report_date`,`date_type`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

CREATE TABLE t_stock(
        id BIGINT PRIMARY KEY AUTO_INCREMENT,
        stock_code VARCHAR(16) NOT NULL DEFAULT '' COMMENT '代码',
        stock_type VARCHAR(8) NOT NULL DEFAULT '' COMMENT '类型',
        stock_name VARCHAR(64) NOT NULL DEFAULT '' COMMENT '名称',
        level VARCHAR(8) NOT NULL DEFAULT '' COMMENT '市场分层',
        transfer VARCHAR(8) NOT NULL DEFAULT '' COMMENT '转让方式',
        supervision CHAR(1) NOT NULL DEFAULT '' COMMENT '券商是否持续督导',
        capital FLOAT NOT NULL DEFAULT 0 COMMENT '总股本(万股)',
        limited_company_create_date VARCHAR(12) NOT NULL DEFAULT '' COMMENT '有限公司设立日期',
        stock_company_create_date VARCHAR(12) NOT NULL DEFAULT '' COMMENT '股份公司设立日期',
        apply_listing_date VARCHAR(12) NOT NULL DEFAULT '' COMMENT '申报挂牌日',
        listing_date VARCHAR(12) NOT NULL DEFAULT '' COMMENT '挂牌日期',
        total_asset_two_year_before_listing FLOAT NOT NULL DEFAULT 0 COMMENT '挂牌前两年总资产(万元)',
        net_asset_two_year_before_listing FLOAT NOT NULL DEFAULT 0 COMMENT '挂牌前两年净资产(万元)',
        operating_receipt_two_year_before_listing FLOAT NOT NULL DEFAULT 0 COMMENT '挂牌前两年营业收入(万元)',
        net_profit_two_year_before_listing FLOAT NOT NULL DEFAULT 0 COMMENT '挂牌前两年净利润(万元)',
        total_asset_one_year_before_listing FLOAT NOT NULL DEFAULT 0 COMMENT '挂牌前一年总资产(万元)',
        net_asset_one_year_before_listing FLOAT NOT NULL DEFAULT 0 COMMENT '挂牌前一年净资产(万元)',
        operating_receipt_one_year_before_listing FLOAT NOT NULL DEFAULT 0 COMMENT '挂牌前一年营业收入(万元)',
        net_profit_one_year_before_listing FLOAT NOT NULL DEFAULT 0 COMMENT '挂牌前一年净利润(万元)',
        total_asset_for_listing_year FLOAT NOT NULL DEFAULT 0 COMMENT '挂牌当年总资产(万元)',
        pevc_invest_before_listing CHAR(1) NOT NULL DEFAULT '' COMMENT '挂牌前是否有投资机构进入',
        put_options CHAR(1) NOT NULL DEFAULT '' COMMENT '是否有对赌条款',
        put_options_type CHAR(1) NOT NULL DEFAULT '' COMMENT '对赌类型：1 约定IPO，2 约定业绩，3 同时约定IPO和业绩',
        additional_amount_before_listing FLOAT NOT NULL DEFAULT 0 COMMENT '从申报挂牌到挂牌日定向增发金额',
        is_additional_amount_listing_today CHAR(1) NOT NULL DEFAULT '' COMMENT '挂牌当日是否有定向增发',
        additional_amount FLOAT NOT NULL DEFAULT 0 COMMENT '定向增发金额(万元)',
        max_sharehold_ratio FLOAT NOT NULL DEFAULT 0 COMMENT '挂牌时大股东持股比例',
        market_value_listing_today FLOAT NOT NULL DEFAULT 0 COMMENT '挂牌当日市值',
        market_value_five_day_before_listing FLOAT NOT NULL DEFAULT 0 COMMENT '挂牌5日市值',
        market_value_twenty_day_before_listing FLOAT NOT NULL DEFAULT 0 COMMENT '挂牌20日市值',
        park VARCHAR(64) NOT NULL DEFAULT '' COMMENT '所属园区',
        industry VARCHAR(64) NOT NULL DEFAULT '' COMMENT '证监会行业(2012)',
        UNIQUE KEY unique_index_code(`stock_code`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

CREATE TABLE t_company(
        id BIGINT PRIMARY KEY AUTO_INCREMENT,
        company_name VARCHAR(64) NOT NULL DEFAULT '' COMMENT '公司名称',
        transfer VARCHAR(64) NOT NULL DEFAULT '' COMMENT '转让方式(新三板)',
        level VARCHAR(8) NOT NULL DEFAULT '' COMMENT '市场分层(新三板)',
        supervision VARCHAR(64) NOT NULL DEFAULT '' COMMENT '持续督导券商(新三板)',
        listing_supervision VARCHAR(64) NOT NULL DEFAULT '' COMMENT '推荐挂牌券商(新三板)',
        english_name VARCHAR(256) NOT NULL DEFAULT '' COMMENT '英文名称',
        stock_code VARCHAR(16) NOT NULL DEFAULT '' COMMENT '股票代码',
        stock_type VARCHAR(8) NOT NULL DEFAULT '' COMMENT '股票类型',
        stock_short_name VARCHAR(64) NOT NULL DEFAULT '' COMMENT '股票简称',
        bond_type VARCHAR(64) NOT NULL DEFAULT '' COMMENT '证券类别',
        industry VARCHAR(64) NOT NULL DEFAULT '' COMMENT '所属证监会行业',
        exchange VARCHAR(64) NOT NULL DEFAULT '' COMMENT '上市交易所',
        legal_person VARCHAR(64) NOT NULL DEFAULT '' COMMENT '法人代表',
        chairman VARCHAR(128) NOT NULL DEFAULT '' COMMENT '董事长',
        secretary VARCHAR(64) NOT NULL DEFAULT '' COMMENT '董秘',
        contact VARCHAR(64) NOT NULL DEFAULT '' COMMENT '联系电话',
        email VARCHAR(64) NOT NULL DEFAULT '' COMMENT '电子信箱',
        fax VARCHAR(64) NOT NULL DEFAULT '' COMMENT '传真',
        website VARCHAR(64) NOT NULL DEFAULT '' COMMENT '公司网址',
        office_address VARCHAR(256) NOT NULL DEFAULT '' COMMENT '办公地址',
        register_address VARCHAR(256) NOT NULL DEFAULT '' COMMENT '注册地址',
        capital VARCHAR(64) NOT NULL DEFAULT '' COMMENT '注册资本',
        business_regist VARCHAR(64) NOT NULL DEFAULT '' COMMENT '工商登记',
        employee_num BIGINT NOT NULL DEFAULT 0 COMMENT '雇员人数',
        manager_num BIGINT NOT NULL DEFAULT 0 COMMENT '管理人员人数',
        law_office VARCHAR(64) NOT NULL DEFAULT '' COMMENT '律师事务所',
        accounting_firm VARCHAR(64) NOT NULL DEFAULT '' COMMENT '会计师事务所',
        brief VARCHAR(4096) NOT NULL DEFAULT '' COMMENT '公司简介',
        business_scope VARCHAR(4096) NOT NULL DEFAULT '' COMMENT '经营范围',
        establish_date VARCHAR(64) NOT NULL DEFAULT '' COMMENT '成立日期',
        listing_date VARCHAR(64) NOT NULL DEFAULT '' COMMENT '上市/挂牌日期',
        ipope_ratio VARCHAR(64) NOT NULL DEFAULT '' COMMENT '发行市盈率(倍)',
        issue_date VARCHAR(64) NOT NULL DEFAULT '' COMMENT '网上发行日期',
        first_trade_date VARCHAR(64) NOT NULL DEFAULT '' COMMENT '首次交易日(新三板)',
        issue_way VARCHAR(64) NOT NULL DEFAULT '' COMMENT '发行方式',
        per_share_value VARCHAR(64) NOT NULL DEFAULT '' COMMENT '每股面值(元)',
        circulation VARCHAR(64) NOT NULL DEFAULT '' COMMENT '发行量(股)/总股本',
        flow_equity VARCHAR(64) NOT NULL DEFAULT '' COMMENT '流通股本',
        per_share_price VARCHAR(64) NOT NULL DEFAULT '' COMMENT '每股发行价(元)',
        issue_cost VARCHAR(64) NOT NULL DEFAULT '' COMMENT '发行费用(元)',
        market_value VARCHAR(64) NOT NULL DEFAULT '' COMMENT '发行总市值(元)',
        placement VARCHAR(64) NOT NULL DEFAULT '' COMMENT '募集资金净额(元)',
        open_price_first_day VARCHAR(64) NOT NULL DEFAULT '' COMMENT '首日开盘价(元)',
        close_price_first_day VARCHAR(64) NOT NULL DEFAULT '' COMMENT '首日收盘价(元)',
        turnover_rate_first_day VARCHAR(64) NOT NULL DEFAULT '' COMMENT '首日换手率',
        max_price_first_day VARCHAR(64) NOT NULL DEFAULT '' COMMENT '首日最高价(元)',
        offline_lot_winning_rate VARCHAR(64) NOT NULL DEFAULT '' COMMENT '网下配售中签率',
        pricing_lot_winning_rate VARCHAR(64) NOT NULL DEFAULT '' COMMENT '定价中签率',
        UNIQUE KEY unique_index_code(`stock_code`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

CREATE TABLE t_apply_listing_stat(
        id BIGINT PRIMARY KEY AUTO_INCREMENT,
        company_name VARCHAR(64) NOT NULL DEFAULT '' COMMENT '公司名称',
        province VARCHAR(8) NOT NULL DEFAULT '' COMMENT '省区',
        industry VARCHAR(32) NOT NULL DEFAULT '' COMMENT '行业',
        apply_listing_date VARCHAR(16) NOT NULL DEFAULT '' COMMENT '申请挂牌日',
        UNIQUE KEY unique_index_name(`company_name`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4;