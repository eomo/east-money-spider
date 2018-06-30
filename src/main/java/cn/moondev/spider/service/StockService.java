package cn.moondev.spider.service;

import cn.moondev.framework.provider.excel.utils.ImportExcelUtils;
import cn.moondev.spider.mapper.StockMapper;
import cn.moondev.spider.model.Stock;
import cn.moondev.spider.spider.FinancialSpider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

/**
 * 股票模型
 */
@Service
public class StockService {

    private static final Logger LOG = LoggerFactory.getLogger(StockService.class);

    /**
     * 自动注入所有的FinancialSpider实现类
     */
    @Autowired
    private StockMapper stockMapper;

    /**
     * 从东方财富网抓取财务分析数据
     */
    public void importDateFromExcel() throws Exception {
        List<Stock> stocks = ImportExcelUtils.doImport("/Users/Moon/Downloads/一阶段数据样本/模型设计.xls", Stock.class);
        for (Stock stock : stocks) {
            if (stock.supervision.length() > 1) {
                stock.supervision = "-";
            }
            stock.stockType = "NEEQ";
            Field[] fields = Stock.class.getDeclaredFields();
            for (Field field : fields) {
                if (field.getType().equals(String.class)) {
                    Object object = field.get(stock);
                    if (Objects.isNull(object)) {
                        field.set(stock,"");
                    }
                } else if (field.getType().equals(Float.class)) {
                    Object object = field.get(stock);
                    if (Objects.isNull(object)) {
                        field.set(stock,Float.valueOf("0"));
                    }
                }
            }
            stockMapper.upsert(stock);
        }
    }
}
