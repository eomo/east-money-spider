package cn.moondev.spider.service;

import cn.moondev.spider.mapper.StockMapper;
import cn.moondev.spider.model.Stock;
import cn.moondev.spider.spider.impl.ProspectusSpider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 抓取招股书
 */
@Service
public class ProspectusService {

    private static final Logger LOG = LoggerFactory.getLogger(ProspectusService.class);
    @Autowired
    private ProspectusSpider prospectusSpider;
    @Autowired
    private StockMapper stockMapper;

    /**
     * 从东方财富网抓取招股书
     *
     * @param stock
     */
    public void crawlProspectusFromEastMoney() {
        List<Stock> stocks = stockMapper.getStockNotInOtherBuiness("t_prospectus");
        for (Stock stock : stocks) {
            try {
                prospectusSpider.spider(stock.stockCode);
            } catch (Exception e) {
                LOG.error("stock={}", stock, e);
            }
        }
    }

}
