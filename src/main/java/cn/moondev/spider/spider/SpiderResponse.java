package cn.moondev.spider.spider;

import cn.moondev.framework.model.Format;
import com.alibaba.fastjson.JSONObject;

public class SpiderResponse {

    /**
     * 返回数据的格式
     */
    public Format format;

    public JSONObject response;
}
