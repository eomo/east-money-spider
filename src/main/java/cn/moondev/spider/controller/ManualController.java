package cn.moondev.spider.controller;

import cn.moondev.spider.service.CompanyService;
import cn.moondev.spider.service.FinancialService;
import cn.moondev.spider.service.ProspectusService;
import cn.moondev.spider.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/v1/manual")
public class ManualController {

    @Autowired
    private ProspectusService prospectusService;
    @Autowired
    private FinancialService financialService;
    @Autowired
    private StockService stockService;
    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "/finanical", method = RequestMethod.GET)
    public String financial() {
        financialService.crawlFinancialDataFromEastMoney();
        return "success";
    }

    @RequestMapping(value = "/prospectus", method = RequestMethod.GET)
    public String prospectus() {
        prospectusService.crawlProspectusFromEastMoney();
        return "success";
    }

    @RequestMapping(value = "/company", method = RequestMethod.GET)
    public String company() throws IOException {
        String docPath = String.format("%s%s%s%s%s", ResourceUtils.getURL("").getPath(),
                "east-money-spider", File.separator, "doc", File.separator);
        companyService.crawlCompanyDataFromEastMoney();
        companyService.importListingDateFromExcel(docPath + "新三板企业挂牌日期表.xls");
        companyService.importPEVCInvestDataFromExcel(docPath + "新三板企业PEVC投资明细.xlsx");
        return "success";
    }
}
