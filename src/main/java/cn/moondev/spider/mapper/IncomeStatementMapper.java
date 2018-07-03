package cn.moondev.spider.mapper;

import cn.moondev.spider.model.IncomeStatement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IncomeStatementMapper {

    void upsert(@Param("item") IncomeStatement incomeStatement);

    IncomeStatement getIncomeByReportDateType(@Param("dateType") String dateType,
                                              @Param("stockCode") String stockCode,
                                              @Param("reportDate") String reportDate);
}
