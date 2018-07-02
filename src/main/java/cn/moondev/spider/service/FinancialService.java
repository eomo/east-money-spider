package cn.moondev.spider.service;

import cn.moondev.spider.mapper.StockMapper;
import cn.moondev.spider.model.Stock;
import cn.moondev.spider.spider.FinancialSpider;
import com.google.common.collect.Sets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 财务分析
 */
@Service
public class FinancialService {

    private static final Logger LOG = LoggerFactory.getLogger(FinancialService.class);

    /**
     * 自动注入所有的FinancialSpider实现类
     */
    @Autowired
    private List<FinancialSpider> spiders;
    @Autowired
    private StockMapper stockMapper;

    /**
     * 从东方财富网抓取财务分析数据
     */
    public void crawlFinancialDataFromEastMoney() {
        List<Stock> stocks1 = stockMapper.getStockNotInOtherBuiness("t_balance_sheet");
        List<Stock> stocks2 = stockMapper.getStockNotInOtherBuiness("t_cash_flow_statement");
        List<Stock> stocks3 = stockMapper.getStockNotInOtherBuiness("t_income_statement");
        Set<String> stockCodes = Sets.newHashSet();
        stockCodes.addAll(stocks1.stream().map(s -> s.stockCode).collect(Collectors.toList()));
        stockCodes.addAll(stocks2.stream().map(s -> s.stockCode).collect(Collectors.toList()));
        stockCodes.addAll(stocks3.stream().map(s -> s.stockCode).collect(Collectors.toList()));
        for (String stockCode : stockCodes) {
            spiders.parallelStream().forEach(spider -> spider.spider(stockCode));
        }
    }
}
