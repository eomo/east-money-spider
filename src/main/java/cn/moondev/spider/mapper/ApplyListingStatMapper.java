package cn.moondev.spider.mapper;

import cn.moondev.spider.model.ApplyListingStat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ApplyListingStatMapper {

    void upsert(@Param("item") ApplyListingStat model);

    void updateStockCode(@Param("item") ApplyListingStat model);

    List<ApplyListingStat> getStockCode();

    List<ApplyListingStat> getAllListingDate();
}
