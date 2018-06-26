package cn.moondev.spider.spider;

public interface Spider {

    /**
     * 爬虫的抽象：
     * 现实的逻辑：给到你一只股票，需要爬取这只股票的各种数据：公司、股东、利润、资产、行情...
     * 应用的逻辑：通过股票代码，查询到各种数据，然后把数据存起来
     * 因此，整个爬虫的逻辑，仅仅需要抽象出这一个接口即可
     *
     * @param stock 股票代码
     */
    void spider(String stock);
}
