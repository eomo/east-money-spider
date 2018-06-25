package cn.moondev.spider.mapper;

import cn.moondev.spider.model.CashFlowStatement;
import org.apache.ibatis.annotations.Param;

public interface CashFlowStatementMapper {

    void upsert(@Param("item") CashFlowStatement cashFlowStatement);
}
