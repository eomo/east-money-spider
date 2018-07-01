package cn.moondev.spider.controller;

import cn.moondev.spider.service.CompanyService;
import cn.moondev.spider.service.FinancialService;
import cn.moondev.spider.service.ProspectusService;
import cn.moondev.spider.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public String financial(@RequestParam(required = false) String stock) {
        financialService.crawlFinancialDataFromEastMoney();
        return "success";
    }

    @RequestMapping(value = "/company", method = RequestMethod.GET)
    public String company() {
        companyService.crawlCompanyDataFromEastMoney();
        companyService.importListingDateFromExcel("D:\\WORKSPACE\\data\\一阶段数据样本\\新三板企业挂牌日期表.xls");
        return "success";
    }
}
