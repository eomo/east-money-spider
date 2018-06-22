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
        accounts_payable_reinsurance BIGINT NOT NULL DEFAULT 0 COMMENT '应付分保账款 ripay',
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
        long_term_loan BIGINT NOT NULL DEFAULT 0 COMMENT '长期借款',
        bond_payable BIGINT NOT NULL DEFAULT 0 COMMENT '应付债券',
        prefer_stock_bond BIGINT NOT NULL DEFAULT 0 COMMENT '应付债券 - 优先股',
        sustain_stock_bond BIGINT NOT NULL DEFAULT 0 COMMENT '应付债券 - 永续股',
        long_term_account_payable BIGINT NOT NULL DEFAULT 0 COMMENT '长期应付款',
        long_term_salary_payable BIGINT NOT NULL DEFAULT 0 COMMENT '长期应付职工薪酬',
        account_payable_special_funds BIGINT NOT NULL DEFAULT 0 COMMENT '专项应付款',
        estimated_liabilities BIGINT NOT NULL DEFAULT 0 COMMENT '预计负债',
        deferred_income BIGINT NOT NULL DEFAULT 0 COMMENT '递延收益',
        deferred_tax_liability BIGINT NOT NULL DEFAULT 0 COMMENT '递延所得税负债',
        other_non_current_liabilities BIGINT NOT NULL DEFAULT 0 COMMENT '其他非流动负债',
        sum_non_current_liabilities BIGINT NOT NULL DEFAULT 0 COMMENT '非流动负债合计',
        sum_liabilities BIGINT NOT NULL DEFAULT 0 COMMENT '负债合计',
        paid_in_capital BIGINT NOT NULL DEFAULT 0 COMMENT '实收资本（或股本',
        other_equity BIGINT NOT NULL DEFAULT 0 COMMENT '其他权益工具',
        preferredtock BIGINT NOT NULL DEFAULT 0 COMMENT '其他权益工具 - 优先股',
        sustainable_debt BIGINT NOT NULL DEFAULT 0 COMMENT '其他权益工具 - 永续债',
        other_equity_other BIGINT NOT NULL DEFAULT 0 COMMENT '其他权益工具 - 其他权益工具',
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
        UNIQUE KEY unique_index_code_date(`security_code`,`report_date`,`date_type`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

CREATE TABLE t_cash_flow_statement(
        id BIGINT PRIMARY KEY AUTO_INCREMENT,
        security_code VARCHAR(16) NOT NULL DEFAULT '' COMMENT '股票代码',
        report_date VARCHAR(32) NOT NULL DEFAULT '' COMMENT '日期',
        stock_type VARCHAR(8) NOT NULL DEFAULT '' COMMENT '股票类型',
        date_type CHAR(1) NOT NULL DEFAULT '' COMMENT '日期类型:R(报告周期),Y(年),M(月)',
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
        effect_exchange_rate BIGINT NOT NULL DEFAULT 0 COMMENT '汇率变动对现金及现金等价物的影响',
        net_increase_in_cash_equi BIGINT NOT NULL DEFAULT 0 COMMENT '现金及现金等价物净增加额',
        cash_in_period_beginning BIGINT NOT NULL DEFAULT 0 COMMENT '加:期初现金及现金等价物余额',
        cash_in_period_ending BIGINT NOT NULL DEFAULT 0 COMMENT '期末现金及现金等价物余额(现金及现金等价物净增加额 + 期初现金及现金等价物余额)',
        UNIQUE KEY unique_index_code_date(`security_code`,`report_date`,`date_type`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

CREATE TABLE t_income_statement(
        id BIGINT PRIMARY KEY AUTO_INCREMENT,
        security_code VARCHAR(16) NOT NULL DEFAULT '' COMMENT '股票代码',
        report_date VARCHAR(32) NOT NULL DEFAULT '' COMMENT '日期',
        stock_type VARCHAR(8) NOT NULL DEFAULT '' COMMENT '股票类型',
        date_type CHAR(1) NOT NULL DEFAULT '' COMMENT '日期类型:R(报告周期),Y(年),M(月)',
        gross_revenue BIGINT NOT NULL DEFAULT 0 COMMENT '营业总收入',
        operating_receipt BIGINT NOT NULL DEFAULT 0 COMMENT '营业收入',
        interest_revenue BIGINT NOT NULL DEFAULT 0 COMMENT '利息收入',
        premium_earned BIGINT NOT NULL DEFAULT 0 COMMENT '已赚保费',
        commreve BIGINT NOT NULL DEFAULT 0 COMMENT '手续费及佣金收入',
        other_revenue BIGINT NOT NULL DEFAULT 0 COMMENT '其他业务收入',
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
        fair_value_income BIGINT NOT NULL DEFAULT 0 COMMENT '加:公允价值变动收益',
        investment_income BIGINT NOT NULL DEFAULT 0 COMMENT '投资收益',
        investment_join_income BIGINT NOT NULL DEFAULT 0 COMMENT '其中:对联营企业和合营企业的投资收益',
        exchange_income BIGINT NOT NULL DEFAULT 0 COMMENT '汇兑收益',
        operating_profit BIGINT NOT NULL DEFAULT 0 COMMENT '营业利润',
        non_business_revenue BIGINT NOT NULL DEFAULT 0 COMMENT '加:营业外收入',
        non_current_asset_revenue BIGINT NOT NULL DEFAULT 0 COMMENT '营业外收入中，非流动资产处置利得',
        non_business_exp BIGINT NOT NULL DEFAULT 0 COMMENT '减:营业外支出',
        non_current_asset_loss BIGINT NOT NULL DEFAULT 0 COMMENT '营业外支出中，非流动资产处置净损失',
        sum_profit BIGINT NOT NULL DEFAULT 0 COMMENT '利润总额',
        income_tax BIGINT NOT NULL DEFAULT 0 COMMENT '减:所得税费用',
        combined_net_profit BIGINT NOT NULL DEFAULT 0 COMMENT '被合并方在合并前实现利润',
        net_profit BIGINT NOT NULL DEFAULT 0 COMMENT '净利润（利润总额-所得税费用-被合并方在合并前实现利润）',
        parent_net_profit BIGINT NOT NULL DEFAULT 0 COMMENT '其中:归属于母公司股东的净利润',
        minority_income BIGINT NOT NULL DEFAULT 0 COMMENT '少数股东损益',
        net_profit_after_loss BIGINT NOT NULL DEFAULT 0 COMMENT '扣除非经常性损益后的净利润',
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