package cn.moondev.spider.mapper;

import cn.moondev.spider.model.NeeqPevcInvest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NeeqPevcInvestMapper {

    void upsert(@Param("item") NeeqPevcInvest model);
}
