package cn.moondev.spider.spider.handler;

import cn.moondev.framework.provider.okhttp3.ResponseHandler;
import cn.moondev.spider.model.CashFlowStatement;
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
        if ("\"null\"".equalsIgnoreCase(content)) {
            return Lists.newArrayList();
        }
        JSONObject jsonObject = JSONObject.parseObject(content);
        JSONArray array = jsonObject.getJSONArray("result");
        return array.stream().map(o -> new CashFlowStatement((JSONObject) o)).collect(Collectors.toList());
    }

    @Override
    public void handle(String content) {
    }
}
