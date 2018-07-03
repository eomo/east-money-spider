package cn.moondev.spider.mapper;

import cn.moondev.spider.model.BalanceSheet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalanceSheetMapper {

    void upsert(@Param("item") BalanceSheet balanceSheet);

    BalanceSheet getBalanceByReportDateType(@Param("dateType") String dateType,
                                            @Param("stockCode") String stockCode,
                                            @Param("reportDate") String reportDate);
}
