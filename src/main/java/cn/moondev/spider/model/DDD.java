package cn.moondev.spider.model;

import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ImportParams;

import java.io.File;
import java.util.List;

public class DDD {

    public static void main(String[] args) {
        List<ChuangYeBan> list =  ExcelImportUtil.importExcel(new File("C:\\Users\\CHEN\\Desktop\\创业板.xls"),ChuangYeBan.class,new ImportParams());
        for (ChuangYeBan item : list) {
            System.out.println(item.toString());
        }

    }
}
