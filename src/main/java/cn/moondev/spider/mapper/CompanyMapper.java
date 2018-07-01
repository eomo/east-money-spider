package cn.moondev.spider.mapper;

import cn.moondev.spider.model.Company;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CompanyMapper {

    void upsert(@Param("item") Company company);
}
