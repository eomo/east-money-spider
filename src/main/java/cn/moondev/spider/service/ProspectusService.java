package cn.moondev.spider.service;

import cn.moondev.framework.model.Format;
import cn.moondev.framework.provider.okhttp3.OkHttpOperations;
import cn.moondev.framework.provider.okhttp3.OkHttpRequest;
import cn.moondev.spider.mapper.ProspectusMapper;
import cn.moondev.spider.model.Prospectus;
import cn.moondev.spider.spider.handler.ProspectusHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 抓取招股书
 */
@Service
public class ProspectusService {

    private static final Logger LOG = LoggerFactory.getLogger(ProspectusService.class);
    @Autowired
    private OkHttpOperations okHttpOperations;
    @Autowired
    private ProspectusMapper prospectusMapper;

    public void crawl2db(String stockCode) {
        LOG.info("开始抓取{}的招股书...", stockCode);
        List<Prospectus> prospectuses = spider(stockCode);
        if (CollectionUtils.isEmpty(prospectuses)) {
            LOG.info("未抓取到{}的招股书数据，请稍后检查是否存错误或者数据", stockCode);
        }
        for (Prospectus prospectus : prospectuses) {
            prospectusMapper.upsertProspectusByInfoCode(prospectus);
        }
        LOG.info("{}的招股书抓去完成...", stockCode);
    }

    private List<Prospectus> spider(String stockCode) {
        OkHttpRequest request = new OkHttpRequest();
        request.domain = "http://data.eastmoney.com/notices/getdata.ashx";
        request.requestParams.put("StockCode", stockCode);
        request.requestParams.put("CodeType", "1");
        request.requestParams.put("PageIndex", "1");
        request.requestParams.put("FirstNodeType", "2");
        request.requestParams.put("SecNodeType", "2");
        request.requestParams.put("PageSize", "50");
        request.requestFormat = Format.PLAIN;
        return okHttpOperations.syncRequest(request, new ProspectusHandler());
    }
}
