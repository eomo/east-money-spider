package cn.moondev.spider.mapper;

import cn.moondev.spider.model.Stock;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockMapper {

    void upsert(@Param("item") Stock Stock);

    /**
     * 抓取数据时，需要先除去已经抓取的数据
     */
    List<Stock> getStockNotInOtherBuiness(@Param("tableName") String tableName);

    List<Stock> getAllStock();
}
