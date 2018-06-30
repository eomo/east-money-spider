package cn.moondev.spider.service;

import cn.moondev.framework.provider.excel.utils.ImportExcelUtils;
import cn.moondev.spider.model.Stock;
import cn.moondev.spider.spider.FinancialSpider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * 从东方财富网抓取财务分析数据
     */
    public void crawlFinancialDataFromEastMoney() {
        List<Stock> stocks = ImportExcelUtils.doImport("/Users/Moon/Downloads/一阶段数据样本/模型设计.xls", Stock.class);
        for (Stock stock : stocks) {
            spiders.parallelStream().forEach(spider -> spider.spider(stock.stockCode.substring(0, 6)));
        }
    }
}
