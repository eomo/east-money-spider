package cn.moondev.spider.model;


import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelTarget;

@ExcelTarget("chuangYeBan")
public class ChuangYeBan {
    @Excel(name = "证券代码")
    public String stockCode;
    @Excel(name = "公司名称")
    public String stockName;
    @Excel(name = "有限公司设立日期")
    public String limitedCompanyCreateDate;
    @Excel(name = "股份公司设立日期")
    public String stockCompanyCreateDate;
    @Excel(name = "申请上市日")
    public String applyListingDate;
    @Excel(name = "IPO过会日")
    public String ipoDate;
    @Excel(name = "上市日期")
    public String listingDate;
    @Excel(name = "上市当日市值")
    public String oneMoney;
    @Excel(name = "上市5日市值")
    public String fiveMoney;
    @Excel(name = "上市20日市值")
    public String twenMoney;
    @Excel(name = "上市前两年总资产")
    public String twoYearTotalMoney;
    @Excel(name = "上市前两年净资产")
    public String twoYearNetMoney;
    @Excel(name = "上市前两年营业收入")
    public String twoYearBizMoney;
    @Excel(name = "上市前两年净利润")
    public String twoYearNetProfit;
    @Excel(name = "上市前一年总资产")
    public String oneYearTotalMoney;
    @Excel(name = "上市前一年净资产")
    public String oneYearNetMoney;
    @Excel(name = "上市前一年营业收入")
    public String oneYearBizMoney;
    @Excel(name = "上市前一年净利润")
    public String oneYearNetProfit;
    @Excel(name = "上市时大股东持股比例")
    public String bigRadio;
    @Excel(name = "募集资金(万)")
    public String mjzj;
    @Excel(name = "所属行业")
    public String hy;
    @Excel(name = "PE/VC投资机构")
    public String pevcJG;
    @Excel(name = "PE/VC基金")
    public String pevcJJ;
    @Excel(name = "退出方式")
    public String tcWay;
    @Excel(name = "账面退出金额")
    public String tcTotal;
    @Excel(name = "投资时间")
    public String investLong;
    @Excel(name = "持有时长")
    public String howlong;
    @Excel(name = "总投资金额(万)")
    public String investTotal;
    @Excel(name = "是否对赌")
    public String isdd;
    @Excel(name = "IPO对赌")
    public String ipodd;
    @Excel(name = "业绩对赌")
    public String yjdd;
    @Excel(name = "双重对赌")
    public String scdd;
    @Excel(name = "账面投资回报倍数")
    public String hbbs;

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getLimitedCompanyCreateDate() {
        return limitedCompanyCreateDate;
    }

    public void setLimitedCompanyCreateDate(String limitedCompanyCreateDate) {
        this.limitedCompanyCreateDate = limitedCompanyCreateDate;
    }

    public String getStockCompanyCreateDate() {
        return stockCompanyCreateDate;
    }

    public void setStockCompanyCreateDate(String stockCompanyCreateDate) {
        this.stockCompanyCreateDate = stockCompanyCreateDate;
    }

    public String getApplyListingDate() {
        return applyListingDate;
    }

    public void setApplyListingDate(String applyListingDate) {
        this.applyListingDate = applyListingDate;
    }

    public String getIpoDate() {
        return ipoDate;
    }

    public void setIpoDate(String ipoDate) {
        this.ipoDate = ipoDate;
    }

    public String getListingDate() {
        return listingDate;
    }

    public void setListingDate(String listingDate) {
        this.listingDate = listingDate;
    }

    public String getOneMoney() {
        return oneMoney;
    }

    public void setOneMoney(String oneMoney) {
        this.oneMoney = oneMoney;
    }

    public String getFiveMoney() {
        return fiveMoney;
    }

    public void setFiveMoney(String fiveMoney) {
        this.fiveMoney = fiveMoney;
    }

    public String getTwenMoney() {
        return twenMoney;
    }

    public void setTwenMoney(String twenMoney) {
        this.twenMoney = twenMoney;
    }

    public String getTwoYearTotalMoney() {
        return twoYearTotalMoney;
    }

    public void setTwoYearTotalMoney(String twoYearTotalMoney) {
        this.twoYearTotalMoney = twoYearTotalMoney;
    }

    public String getTwoYearNetMoney() {
        return twoYearNetMoney;
    }

    public void setTwoYearNetMoney(String twoYearNetMoney) {
        this.twoYearNetMoney = twoYearNetMoney;
    }

    public String getTwoYearBizMoney() {
        return twoYearBizMoney;
    }

    public void setTwoYearBizMoney(String twoYearBizMoney) {
        this.twoYearBizMoney = twoYearBizMoney;
    }

    public String getTwoYearNetProfit() {
        return twoYearNetProfit;
    }

    public void setTwoYearNetProfit(String twoYearNetProfit) {
        this.twoYearNetProfit = twoYearNetProfit;
    }

    public String getOneYearTotalMoney() {
        return oneYearTotalMoney;
    }

    public void setOneYearTotalMoney(String oneYearTotalMoney) {
        this.oneYearTotalMoney = oneYearTotalMoney;
    }

    public String getOneYearNetMoney() {
        return oneYearNetMoney;
    }

    public void setOneYearNetMoney(String oneYearNetMoney) {
        this.oneYearNetMoney = oneYearNetMoney;
    }

    public String getOneYearBizMoney() {
        return oneYearBizMoney;
    }

    public void setOneYearBizMoney(String oneYearBizMoney) {
        this.oneYearBizMoney = oneYearBizMoney;
    }

    public String getOneYearNetProfit() {
        return oneYearNetProfit;
    }

    public void setOneYearNetProfit(String oneYearNetProfit) {
        this.oneYearNetProfit = oneYearNetProfit;
    }

    public String getBigRadio() {
        return bigRadio;
    }

    public void setBigRadio(String bigRadio) {
        this.bigRadio = bigRadio;
    }

    public String getMjzj() {
        return mjzj;
    }

    public void setMjzj(String mjzj) {
        this.mjzj = mjzj;
    }

    public String getHy() {
        return hy;
    }

    public void setHy(String hy) {
        this.hy = hy;
    }

    public String getPevcJG() {
        return pevcJG;
    }

    public void setPevcJG(String pevcJG) {
        this.pevcJG = pevcJG;
    }

    public String getPevcJJ() {
        return pevcJJ;
    }

    public void setPevcJJ(String pevcJJ) {
        this.pevcJJ = pevcJJ;
    }

    public String getTcWay() {
        return tcWay;
    }

    public void setTcWay(String tcWay) {
        this.tcWay = tcWay;
    }

    public String getTcTotal() {
        return tcTotal;
    }

    public void setTcTotal(String tcTotal) {
        this.tcTotal = tcTotal;
    }

    public String getInvestLong() {
        return investLong;
    }

    public void setInvestLong(String investLong) {
        this.investLong = investLong;
    }

    public String getHowlong() {
        return howlong;
    }

    public void setHowlong(String howlong) {
        this.howlong = howlong;
    }

    public String getInvestTotal() {
        return investTotal;
    }

    public void setInvestTotal(String investTotal) {
        this.investTotal = investTotal;
    }

    public String getIsdd() {
        return isdd;
    }

    public void setIsdd(String isdd) {
        this.isdd = isdd;
    }

    public String getIpodd() {
        return ipodd;
    }

    public void setIpodd(String ipodd) {
        this.ipodd = ipodd;
    }

    public String getYjdd() {
        return yjdd;
    }

    public void setYjdd(String yjdd) {
        this.yjdd = yjdd;
    }

    public String getScdd() {
        return scdd;
    }

    public void setScdd(String scdd) {
        this.scdd = scdd;
    }

    public String getHbbs() {
        return hbbs;
    }

    public void setHbbs(String hbbs) {
        this.hbbs = hbbs;
    }

    @Override
    public String toString() {
        return "ChuangYeBan{" +
                "stockCode='" + stockCode + '\'' +
                ", stockName='" + stockName + '\'' +
                ", twoYearTotalMoney=" + twoYearTotalMoney +
                ", twoYearNetMoney=" + twoYearNetMoney +
                ", twoYearBizMoney=" + twoYearBizMoney +
                ", twoYearNetProfit=" + twoYearNetProfit +
                ", oneYearTotalMoney=" + oneYearTotalMoney +
                ", oneYearNetMoney=" + oneYearNetMoney +
                ", oneYearBizMoney=" + oneYearBizMoney +
                ", oneYearNetProfit=" + oneYearNetProfit +
                '}';
    }
}
