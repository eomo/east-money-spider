package cn.moondev.spider.mapper;

import cn.moondev.spider.model.Company;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CompanyMapper {

    void upsert(@Param("item") Company company);

    List<Company> getCompanyByName(@Param("name") String name);
}
