package cn.moondev.spider.mapper;

import cn.moondev.spider.model.BalanceSheet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalanceSheetMapper {

    /**
     * 插入更新
     *
     * @param balanceSheet
     */
    void upsert(@Param("item") BalanceSheet balanceSheet);
}
