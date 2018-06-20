package cn.moondev.spider.configuration;

import cn.moondev.framework.provider.mysql.MybatisConfigurationSupport;
import cn.moondev.framework.provider.okhttp3.OkHttpOperations;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpiderConfiguration {

    @Value("${okhttp.connection.timeout:15}")
    private String connectionTimeout;

    @Bean
    public OkHttpOperations okHttpOperations() {
        return new OkHttpOperations(Long.parseLong(connectionTimeout));
    }

    /**
     * mybatis配置
     */
    @Configuration
    @MapperScan(basePackages = {"cn.moondev.spider.mapper"})
    public static class MybatisConfiguration extends MybatisConfigurationSupport {

        @Value("${moon.jdbc.url}")
        private String jdbcUrl;
        @Value("${moon.jdbc.user}")
        private String jdbcUser;
        @Value("${moon.jdbc.password}")
        private String jdbcPassword;


        @Override
        protected void initConfiguration() {
            super.dataSourceUri = jdbcUrl;
            super.user = jdbcUser;
            super.password = jdbcPassword;
            super.mapperLocations = new String[]{"classpath:mapper/**/*.xml"};
        }
    }
}
