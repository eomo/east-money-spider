package cn.moondev.spider.mapper;

import cn.moondev.spider.model.Stock;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockMapper {

    void upsert(@Param("item") Stock Stock);

    /**
     * 抓取公司信息时，需要先除去已经抓取的数据
     */
    List<Stock> getStockNotInCompany();

    List<Stock> getAllStock();
}
