package cn.moondev.spider.service;

import cn.moondev.spider.mapper.BalanceSheetMapper;
import cn.moondev.spider.mapper.IncomeStatementMapper;
import cn.moondev.spider.mapper.StockMapper;
import cn.moondev.spider.model.BalanceSheet;
import cn.moondev.spider.model.ChuangYeBan;
import cn.moondev.spider.model.IncomeStatement;
import cn.moondev.spider.model.Stock;
import com.google.common.collect.Lists;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;

/**
 * 股票模型
 */
@Service
public class StockService {

    private static final Logger LOG = LoggerFactory.getLogger(StockService.class);

    @Autowired
    private BalanceSheetMapper bsmapper;
    @Autowired
    private IncomeStatementMapper ismapper;

    public void test() {
        List<ChuangYeBan> list = ExcelImportUtil.importExcel(new File("C:\\Users\\CHEN\\Desktop\\创业板.xls"), ChuangYeBan.class, new ImportParams());
        ChuangYeBan lastItem = null;
        for (ChuangYeBan item : list) {
            if (lastItem != null) {
                if (item.stockCode.equals(lastItem.stockCode)) {
                    item.oneYearTotalMoney = lastItem.oneYearTotalMoney;
                    item.oneYearNetMoney = lastItem.oneYearNetMoney;
                    item.oneYearBizMoney = lastItem.oneYearBizMoney;
                    item.oneYearNetProfit = lastItem.oneYearNetProfit;
                    item.twoYearTotalMoney = lastItem.twoYearTotalMoney;
                    item.twoYearNetMoney = lastItem.twoYearNetMoney;
                    item.twoYearBizMoney = lastItem.twoYearBizMoney;
                    item.twoYearNetProfit = lastItem.twoYearNetProfit;
                    item.stockName = lastItem.stockName;
                    item.listingDate = lastItem.listingDate;
                    continue;
                }
            }
            String code = item.stockCode.substring(0, 6);
            int year = Integer.parseInt(item.listingDate.substring(0, 4));
            String one = (year - 1) + "-12-31";
            BalanceSheet balanceSheet = bsmapper.getBalanceByReportDateType("Y", code, one);
            IncomeStatement incomeStatement = ismapper.getIncomeByReportDateType("Y", code, one);
            item.oneYearTotalMoney = String.valueOf(balanceSheet.sumAsset);
            item.oneYearNetMoney = String.valueOf(balanceSheet.sumshequity);
            item.oneYearBizMoney = String.valueOf(incomeStatement.grossRevenue);
            item.oneYearNetProfit = String.valueOf(incomeStatement.netProfit);
            String two = (year - 2) + "-12-31";
            balanceSheet = bsmapper.getBalanceByReportDateType("Y", code, two);
            incomeStatement = ismapper.getIncomeByReportDateType("Y", code, two);
            item.twoYearTotalMoney = String.valueOf(balanceSheet.sumAsset);
            item.twoYearNetMoney = String.valueOf(balanceSheet.sumshequity);
            item.twoYearBizMoney = String.valueOf(incomeStatement.grossRevenue);
            item.twoYearNetProfit = String.valueOf(incomeStatement.netProfit);
            lastItem = item;
        }

        for (ChuangYeBan item : list) {
            System.out.println(item.toString());
        }
    }
}
