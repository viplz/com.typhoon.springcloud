package com.typhoon.springcloud.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lian-zhang
 * @version 1.0
 * @ClassName ApplicationContextConfig.java
 * @Description TODO
 * @createTime 2021年10月01日 15:26:16
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
