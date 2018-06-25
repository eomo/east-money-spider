package cn.moondev.spider.spider.handler;

import cn.moondev.framework.provider.okhttp3.ResponseHandler;
import cn.moondev.spider.model.CashFlowStatement;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

public class CashFlowStatementHandler implements ResponseHandler<CashFlowStatement> {

    @Override
    public List<CashFlowStatement> convert(String content) {
        content = content.substring(1, content.length() - 1).replace("\\", "");
        if ("null".equalsIgnoreCase(content)) {
            return Lists.newArrayList();
        }
        JSONArray array = JSONObject.parseArray(content);
        return array.stream().map(o -> new CashFlowStatement((JSONObject) o)).collect(Collectors.toList());
    }

    @Override
    public void handle(String content) {
    }
}
