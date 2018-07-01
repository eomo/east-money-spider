package cn.moondev.spider.service;

import cn.moondev.framework.provider.excel.utils.ImportExcelUtils;
import cn.moondev.spider.mapper.ApplyListingStatMapper;
import cn.moondev.spider.mapper.CompanyMapper;
import cn.moondev.spider.mapper.StockMapper;
import cn.moondev.spider.model.ApplyListingStat;
import cn.moondev.spider.model.Stock;
import cn.moondev.spider.spider.CompanySpider;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 公司简介
 */
@Service
public class CompanyService {

    private static final Logger LOG = LoggerFactory.getLogger(CompanyService.class);

    @Autowired
    private CompanySpider companySpider;
    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    private StockMapper stockMapper;
    @Autowired
    private ApplyListingStatMapper applyListingStatMapper;

    /**
     * 从东方财富网抓取财务分析数据
     */
    public void crawlCompanyDataFromEastMoney() {
        List<Stock> stocks = stockMapper.getStockNotInCompany();
        for (Stock stock : stocks) {
            companySpider.spider(stock.stockCode.substring(0, 6));
        }
    }

    /**
     * 从Excel导入新三板申请挂牌日数据
     */
    public void importListingDateFromExcel(String excelFilePath) {
        List<ApplyListingStat> models = ImportExcelUtils.doImport(excelFilePath,ApplyListingStat.class);
        List<ApplyListingStat> dbs = applyListingStatMapper.getAllListingDate();
        models.removeAll(dbs);
        if (!CollectionUtils.isEmpty(models)) {
            for (ApplyListingStat model : models) {
                if (!Strings.isNullOrEmpty(model.companyName)) {
                    applyListingStatMapper.upsert(model);
                }
            }
        }
    }
}
