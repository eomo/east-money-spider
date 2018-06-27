package cn.moondev.spider.spider.impl;

import cn.moondev.framework.model.Format;
import cn.moondev.framework.provider.okhttp3.OkHttpOperations;
import cn.moondev.framework.provider.okhttp3.OkHttpRequest;
import cn.moondev.spider.mapper.ProspectusMapper;
import cn.moondev.spider.model.Prospectus;
import cn.moondev.spider.spider.Spider;
import cn.moondev.spider.spider.handler.ProspectusHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Component
public class ProspectusSpider implements Spider {

    private static final Logger LOG = LoggerFactory.getLogger(ProspectusSpider.class);
    @Autowired
    private OkHttpOperations okHttpOperations;
    @Autowired
    private ProspectusMapper prospectusMapper;

    @Override
    public void spider(String stock) {
        OkHttpRequest request = new OkHttpRequest();
        request.domain = "http://data.eastmoney.com/notices/getdata.ashx";
        request.requestParams.put("StockCode", stock);
        request.requestParams.put("CodeType", "1");
        request.requestParams.put("PageIndex", "1");
        request.requestParams.put("FirstNodeType", "2");
        request.requestParams.put("SecNodeType", "2");
        request.requestParams.put("PageSize", "50");
        request.requestFormat = Format.PLAIN;
        List<Prospectus> prospectuses = okHttpOperations.syncRequest(request, new ProspectusHandler());
        if (CollectionUtils.isEmpty(prospectuses)) {
            LOG.info("未抓取到{}的招股书数据，请稍后检查是否存错误或者数据", stock);
        }
        for (Prospectus prospectus : prospectuses) {
            prospectusMapper.upsertProspectusByInfoCode(prospectus);
        }
        LOG.info("抓取招股书完成,stock={}", stock);
    }
}
