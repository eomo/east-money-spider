package cn.moondev.spider.spider.handler;

import cn.moondev.framework.provider.okhttp3.ResponseHandler;
import cn.moondev.spider.model.IncomeStatement;
import cn.moondev.spider.model.StockType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class IncomeStatementHandler implements ResponseHandler<IncomeStatement> {

    private static final Logger LOG = LoggerFactory.getLogger(IncomeStatementHandler.class);

    private String stockType;

    public IncomeStatementHandler() {
    }

    public IncomeStatementHandler(String stockType) {
        this.stockType = stockType;
    }

    @Override
    public List<IncomeStatement> convert(String content) {
        if (StockType.GEM.toString().equals(stockType)) {
            return convert4GEM(content);
        } else if (StockType.NEEQ.toString().equals(stockType)) {
            return convertNEEQ(content);
        }
        return Lists.newArrayList();
    }

    @Override
    public void handle(String content) {
    }

    /**
     * 创业板数据解析
     *
     * @param content
     * @return
     */
    private List<IncomeStatement> convert4GEM(String content) {
        content = content.substring(1, content.length() - 1).replace("\\", "");
        if ("null".equalsIgnoreCase(content)) {
            return Lists.newArrayList();
        }
        JSONArray array = JSONObject.parseArray(content);
        List<IncomeStatement> models = Lists.newArrayList();
        JSONObject json = null;
        for (Object object : array) {
            json = (JSONObject) object;
            json.put("STOCKTYPE", stockType);
            models.add(new IncomeStatement(json));
        }
        return models;
    }

    /**
     * 新三板数据解析
     *
     * @param content
     * @return
     */
    private List<IncomeStatement> convertNEEQ(String content) {
        JSONObject data = JSONObject.parseObject(content);
        if (!data.getBoolean("IsSuccess")) {
            LOG.info("未查询导数据：{}", content);
            return Lists.newArrayList();
        }
        String stock = "";
        String url = data.getString("url");
        if (!Strings.isNullOrEmpty(url)) {
            url = url.substring(url.indexOf("SECURITYCODE"));
            stock = url.substring(13, url.indexOf("&"));
        }
        JSONArray array = data.getJSONArray("result");
        List<IncomeStatement> models = Lists.newArrayList();
        JSONObject json = null;
        for (Object object : array) {
            json = (JSONObject) object;
            json.put("STOCKTYPE", stockType);
            if (!Strings.isNullOrEmpty(stock)) {
                json.put("SECURITYCODE", stock);
            }
            models.add(new IncomeStatement(json));
        }
        return models;
    }
}