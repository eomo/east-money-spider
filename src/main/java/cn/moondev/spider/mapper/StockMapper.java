package cn.moondev.spider.mapper;

import cn.moondev.spider.model.Stock;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockMapper {

    void upsert(@Param("item") Stock Stock);

    List<Stock> getAllStock();
}
