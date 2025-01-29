package com.lh.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName:RestTemplateConfig
 * Package:com.lh.backend.config
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/29-10:55
 * @version:v1.0
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
