package cn.moondev.spider.service;

import cn.moondev.spider.spider.impl.ProspectusSpider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 抓取招股书
 */
@Service
public class ProspectusService {

    private static final Logger LOG = LoggerFactory.getLogger(ProspectusService.class);
    @Autowired
    private ProspectusSpider prospectusSpider;

    /**
     * 从东方财富网抓取招股书
     *
     * @param stock
     */
    public void crawlProspectusFromEastMoney(String stock) {
        prospectusSpider.spider(stock);
    }

}
