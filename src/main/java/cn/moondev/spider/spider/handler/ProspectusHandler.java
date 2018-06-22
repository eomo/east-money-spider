package cn.moondev.spider.spider.handler;

import cn.moondev.framework.provider.okhttp3.ResponseHandler;
import cn.moondev.spider.model.Prospectus;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;

import java.util.List;

public class ProspectusHandler implements ResponseHandler<Prospectus> {

    @Override
    public List<Prospectus> convert(String content) {
        List<Prospectus> prospectuses = Lists.newArrayList();
        JSONObject object = JSONObject.parseObject(content.substring(6, content.length() - 1));
        JSONArray array = object.getJSONArray("data");
        array.stream().forEach(item -> {
            JSONObject notice = (JSONObject) item;
            if (notice.getString("NOTICETITLE").contains("招股说明书")) {
                prospectuses.add(new Prospectus(notice));
            }
        });
        return prospectuses;
    }

    @Override
    public void handle(String content) {
    }
}
