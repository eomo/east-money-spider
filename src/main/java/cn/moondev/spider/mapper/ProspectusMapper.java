package cn.moondev.spider.mapper;

import cn.moondev.spider.model.Prospectus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProspectusMapper {

    /**
     * 获取指定股票代码的招股书信息
     *
     * @param stockCode 股票代码
     * @return
     */
    @Select("select * from prospectus where security_code=${stockCode}")
    List<Prospectus> getProspectusByStockCode(@Param("stockCode") String stockCode);

    /**
     * 获取指定主键的招股书信息
     *
     * @param infoCode 主键
     * @return
     */
    @Select("select * from prospectus where info_code=${infoCode} limit 1")
    Prospectus getProspectusByInfoCode(@Param("infoCode") String infoCode);

    /**
     * 插入更新招股书
     *
     * @param prospectus
     */
    void upsertProspectusByInfoCode(@Param("item") Prospectus prospectus);

}
