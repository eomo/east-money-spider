package cn.moondev.spider.service;

import cn.moondev.framework.provider.excel.utils.ImportExcelUtils;
import cn.moondev.spider.mapper.ApplyListingStatMapper;
import cn.moondev.spider.mapper.CompanyMapper;
import cn.moondev.spider.mapper.NeeqPevcInvestMapper;
import cn.moondev.spider.mapper.StockMapper;
import cn.moondev.spider.model.ApplyListingStat;
import cn.moondev.spider.model.Company;
import cn.moondev.spider.model.NeeqPevcInvest;
import cn.moondev.spider.model.Stock;
import cn.moondev.spider.spider.CompanySpider;
import com.google.common.base.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;

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
    @Autowired
    private NeeqPevcInvestMapper neeqPevcInvestMapper;

    /**
     * 从东方财富网抓取财务分析数据
     */
    public void crawlCompanyDataFromEastMoney() {
        List<Stock> stocks = stockMapper.getStockNotInOtherBuiness("t_company");
        for (Stock stock : stocks) {
            companySpider.spider(stock.stockCode);
        }
    }

    /**
     * 从Excel导入新三板申请挂牌日数据
     */
    public void importListingDateFromExcel(String path) {
        List<ApplyListingStat> models = ImportExcelUtils.doImport(path, ApplyListingStat.class);
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

    public void supplyStockCode4ListingDate() {
        List<ApplyListingStat> stats = applyListingStatMapper.getStockCode();
        for (ApplyListingStat stat : stats) {
            applyListingStatMapper.updateStockCode(stat);
        }
    }

    public void test() {
        List<ApplyListingStat> stats = applyListingStatMapper.getAllListingDate();
        for (ApplyListingStat stat : stats) {
            if (!Strings.isNullOrEmpty(stat.stockCode)) {
                continue;
            }
            String name = stat.companyName.substring(0,2);
            List<Company> companies = companyMapper.getCompanyByName(name);
            if (companies.size() > 0) {
                for (Company company : companies) {
                    String companyName = company.companyName;
                    if (companyName.startsWith("黑龙江") || companyName.startsWith("内蒙古")) {
                        companyName = companyName.substring(3);
                    }
                    if (company.companyName.equalsIgnoreCase(stat.companyName)) {
                        stat.stockCode = company.stockCode;
                        applyListingStatMapper.updateStockCode(stat);
                        break;
                    }
                    if (company.companyName.substring(2).equalsIgnoreCase(stat.companyName)) {
                        stat.stockCode = company.stockCode;
                        applyListingStatMapper.updateStockCode(stat);
                        break;
                    }
                    companyName = company.companyName.substring(2);
                    if (companyName.startsWith("省") || companyName.startsWith("市")) {
                        companyName = companyName.substring(1);
                    }
                    if (companyName.equalsIgnoreCase(stat.companyName)) {
                        stat.stockCode = company.stockCode;
                        applyListingStatMapper.updateStockCode(stat);
                        break;
                    }
                    if (stat.companyName.length() >=6 && companyName.substring(0,6).equalsIgnoreCase(stat.companyName.substring(0,6))) {
                        stat.stockCode = company.stockCode;
                        applyListingStatMapper.updateStockCode(stat);
                        break;
                    }
                    if (stat.companyName.length() >=5 && companyName.substring(0,5).equalsIgnoreCase(stat.companyName.substring(0,5))) {
                        stat.stockCode = company.stockCode;
                        applyListingStatMapper.updateStockCode(stat);
                        break;
                    }
                    if (companyName.substring(0,4).equalsIgnoreCase(stat.companyName.substring(0,4))) {
                        stat.stockCode = company.stockCode;
                        applyListingStatMapper.updateStockCode(stat);
                        break;
                    }
                    if (companyName.substring(0,3).equalsIgnoreCase(stat.companyName.substring(0,3))) {
                        stat.stockCode = company.stockCode;
                        applyListingStatMapper.updateStockCode(stat);
                        break;
                    }
                    if (companyName.substring(0,2).equalsIgnoreCase(stat.companyName.substring(0,2))) {
                        stat.stockCode = company.stockCode;
                        applyListingStatMapper.updateStockCode(stat);
                        break;
                    }
                }
            }
        }
    }

    /**
     * 从Excel导入PEVC投资信息
     */
    public void importPEVCInvestDataFromExcel(String path) {
        List<NeeqPevcInvest> models = ImportExcelUtils.doImport(path, NeeqPevcInvest.class);
        for (NeeqPevcInvest model : models) {
            model.stockCode = model.stockCode.substring(0,6);
            if (Objects.isNull(model.totalInvestAmount)) {
                model.totalInvestAmount = Float.valueOf("0");
            }
            if (Objects.isNull(model.latestMarketValue)) {
                model.latestMarketValue = Float.valueOf("0");
            }
            if (Objects.isNull(model.generalCapital)) {
                model.generalCapital = Float.valueOf("0");
            }
            if (Objects.isNull(model.latestOperatingReceipt)) {
                model.latestOperatingReceipt = Float.valueOf("0");
            }
            neeqPevcInvestMapper.upsert(model);
        }
    }
}
