package cn.moondev.spider.mapper;

import cn.moondev.spider.model.CompanyBaseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CompanyBaseInfoMapper {

    void upsert(@Param("item") CompanyBaseInfo company);
}
