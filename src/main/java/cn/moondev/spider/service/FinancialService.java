package cn.moondev.spider.service;

import cn.moondev.spider.spider.BalanceSheetSpider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 财务分析
 */
@Service
public class FinancialService {

    private static final Logger LOG = LoggerFactory.getLogger(FinancialService.class);
    @Autowired
    private BalanceSheetSpider balanceSheetSpider;

    /**
     * 财务分析
     */
    public void spider(String stock) {
        // 资产负债表
        balanceSheetSpider.crawl(stock);
        // 利润表

        // 现金流量表
    }
}
