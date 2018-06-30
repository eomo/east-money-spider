package cn.moondev.spider.spider.handler;

import cn.moondev.framework.provider.okhttp3.ResponseHandler;
import cn.moondev.spider.model.CashFlowStatement;
import cn.moondev.spider.model.StockType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

public class CashFlowStatementHandler implements ResponseHandler<CashFlowStatement> {

    private static final Logger LOG = LoggerFactory.getLogger(BalanceSheetHandler.class);

    private String stockType;

    public CashFlowStatementHandler() {
    }

    public CashFlowStatementHandler(String stockType) {
        this.stockType = stockType;
    }


    @Override
    public List<CashFlowStatement> convert(String content) {
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
    private List<CashFlowStatement> convert4GEM(String content) {
        content = content.substring(1, content.length() - 1).replace("\\", "");
        if ("null".equalsIgnoreCase(content)) {
            return Lists.newArrayList();
        }
        JSONArray array = JSONObject.parseArray(content);
        return array.stream().map(o -> new CashFlowStatement((JSONObject) o)).collect(Collectors.toList());

    }

    /**
     * 新三板数据解析
     *
     * @param content
     * @return
     */
    private List<CashFlowStatement> convertNEEQ(String content) {
        if ("\"null\"".equalsIgnoreCase(content)) {
            return Lists.newArrayList();
        }
        JSONObject jsonObject = JSONObject.parseObject(content);
        JSONArray array = jsonObject.getJSONArray("result");
        return array.stream().map(o -> new CashFlowStatement((JSONObject) o)).collect(Collectors.toList());
    }
}
