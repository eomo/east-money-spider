package cn.moondev.spider.model;

import cn.moondev.framework.provider.excel.annotation.ExcelColumn;

import java.util.Objects;

public class ApplyListingStat {

    public Long id;

    @ExcelColumn(name = "公司名称")
    public String companyName;

    @ExcelColumn(name = "省区")
    public String province;

    @ExcelColumn(name = "行业")
    public String industry;

    @ExcelColumn(name = "申请挂牌日")
    public String applyListingDate;

    public String stockCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplyListingStat that = (ApplyListingStat) o;
        return Objects.equals(companyName, that.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName);
    }
}
