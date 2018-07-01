package cn.moondev.spider.spider.handler;

import cn.moondev.framework.provider.okhttp3.ResponseHandler;
import cn.moondev.spider.model.Company;
import cn.moondev.spider.model.StockType;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Objects;

public class CompanyHandler implements ResponseHandler<Company> {

    private static final Logger LOG = LoggerFactory.getLogger(CompanyHandler.class);

    private String stockType;

    public CompanyHandler() {
    }

    public CompanyHandler(String stockType) {
        this.stockType = stockType;
    }

    @Override
    public List<Company> convert(String content) {
        if (StockType.GEM.toString().equals(stockType)) {
            return convert4GEM(content);
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
    private List<Company> convert4GEM(String content) {
        if (Strings.isNullOrEmpty(content) || "null".equalsIgnoreCase(content)) {
            return Lists.newArrayList();
        }
        JSONObject jsonObject = JSONObject.parseObject(content);
        JSONObject result = jsonObject.getJSONObject("Result");
        JSONObject companyJsonData = new JSONObject();
        if (Objects.nonNull(result)) {
            JSONObject jbzl = result.getJSONObject("jbzl");
            JSONObject fxxg = result.getJSONObject("fxxg");
            if (Objects.nonNull(jbzl)) {
                companyJsonData.putAll(jbzl);
            }
            if (Objects.nonNull(fxxg)) {
                companyJsonData.putAll(fxxg);
            }
        }
        return Lists.newArrayList(new Company(companyJsonData));
    }
}
