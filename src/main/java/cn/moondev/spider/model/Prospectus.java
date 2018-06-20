package cn.moondev.spider.model;

import cn.moondev.framework.utils.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 招股书
 */
public class Prospectus {

    public String infoCode;
    public String noticeDate;
    public String attachSize;
    public String endDate;
    public String noticeTitle;
    public String eutime;
    public String securityVarietyCode;
    public String securityTypeCode;
    public String securityCode;
    public String securityFullName;
    public String securityShortName;
    public String securityType;
    public String tradeMarketCode;
    public String tradeMarket;
    public String listingStat;
    public String companyCode;
    public String url;
    public String directUrl;

    public Prospectus() {

    }

    public Prospectus(JSONObject notice) {
        this.noticeDate = notice.getString("NOTICEDATE");
        this.attachSize = StringUtils.null2Empty(notice.getString("ATTACHSIZE"));
        this.endDate = notice.getString("ENDDATE");
        this.noticeTitle = notice.getString("NOTICETITLE");
        this.infoCode = notice.getString("INFOCODE");
        this.url = notice.getString("Url");
        this.directUrl = String.format("http://pdf.dfcfw.com/pdf/H2_%s_1.pdf", infoCode);
        this.eutime = notice.getString("EUTIME");
        JSONArray array = notice.getJSONArray("CDSY_SECUCODES");
        if (array.size() > 0) {
            JSONObject object = (JSONObject) array.get(0);
            this.securityVarietyCode = object.getString("SECURITYVARIETYCODE");
            this.securityTypeCode = object.getString("SECURITYTYPECODE");
            this.securityCode = object.getString("SECURITYCODE");
            this.securityFullName = object.getString("SECURITYFULLNAME");
            this.securityShortName = object.getString("SECURITYSHORTNAME");
            this.securityType = object.getString("SECURITYTYPE");
            this.tradeMarketCode = object.getString("TRADEMARKETCODE");
            this.tradeMarket = object.getString("TRADEMARKET");
            this.listingStat = object.getString("LISTINGSTATE");
            this.companyCode = object.getString("COMPANYCODE");
        }
    }
}
