package cn.moondev.spider.controller;

import cn.moondev.spider.service.FinancialService;
import cn.moondev.spider.service.ProspectusService;
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

    @RequestMapping(value = "/finanical", method = RequestMethod.GET)
    public String financial(@RequestParam(required = false) String stock) {
        financialService.crawlFinancialDataFromEastMoney();
        return "success";
    }
}
