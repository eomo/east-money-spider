package cn.moondev.spider.mapper;

import cn.moondev.spider.model.IncomeStatement;
import org.apache.ibatis.annotations.Param;

public interface IncomeStatementMapper {

    void upsert(@Param("item") IncomeStatement incomeStatement);
}
