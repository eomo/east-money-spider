package cn.moondev.spider.service;

import cn.moondev.spider.mapper.CompanyMapper;
import cn.moondev.spider.mapper.StockMapper;
import cn.moondev.spider.model.Stock;
import cn.moondev.spider.spider.CompanySpider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 公司简介
 */
@Service
public class CompanyService {

    private static final Logger LOG = LoggerFactory.getLogger(CompanyService.class);

    @Autowired
    private CompanySpider companySpider;
    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    private StockMapper stockMapper;

    /**
     * 从东方财富网抓取财务分析数据
     */
    public void crawlCompanyDataFromEastMoney() {
        List<Stock> stocks = stockMapper.getAllStock();
        for (Stock stock : stocks) {
            companySpider.spider(stock.stockCode.substring(0, 6));
        }
    }
}
