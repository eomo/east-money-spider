package cn.moondev.spider.controller;

import cn.moondev.spider.service.FinancialService;
import cn.moondev.spider.service.ProspectusService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/v1/manual")
public class ManualController {

    @Autowired
    private ProspectusService prospectusService;
    @Autowired
    private FinancialService financialService;

    @RequestMapping(value = "/finanical", method = RequestMethod.GET)
    public String financial(@RequestParam(required = false) String stock) {
//        financialService.spider(stock);
        return "success";
    }

    @RequestMapping(value = "/prospectus", method = RequestMethod.GET)
    public String prospectus(@RequestParam(required = false) String stock) {
        List<String> stocks = Lists.newArrayList("300001");
        for (String ss : stocks) {
            try {
                prospectusService.crawl2db(ss);
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "success";
    }
}
