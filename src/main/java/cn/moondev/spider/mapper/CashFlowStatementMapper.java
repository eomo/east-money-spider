package cn.moondev.spider.mapper;

import cn.moondev.spider.model.CashFlowStatement;
import org.apache.ibatis.annotations.Param;

public interface CashFlowStatementMapper {

    /**
     * 插入更新
     *
     * @param cashFlowStatement
     */
    void upsert(@Param("item") CashFlowStatement cashFlowStatement);
}
