package cn.moondev.spider.service;

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
     *
     * @param stock
     */
    public void crawlFinancialDataFromEastMoney(String stock) {
        spiders.parallelStream().forEach(spider -> spider.spider(stock));
    }
}
