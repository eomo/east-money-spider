package cn.moondev.spider.model;

public enum ReportDateType {

    /**
     * 按年度查询
     */
    YEAR("Y"),

    /**
     * 按季度查询
     */
    QUARTER("Q"),

    /**
     * 按报告周期查询
     */
    REPORT("R");

    private String value;

    ReportDateType(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

}
