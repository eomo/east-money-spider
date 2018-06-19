package cn.moondev.spider.configuration;

import cn.moondev.framework.provider.okhttp3.OkHttpOperations;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpiderConfiguration {

    @Value("{okhttp.connection.timeout:15}")
    private String connectionTimeout;

    @Bean
    public OkHttpOperations okHttpOperations() {
        return new OkHttpOperations(Long.parseLong(connectionTimeout));
    }
}
