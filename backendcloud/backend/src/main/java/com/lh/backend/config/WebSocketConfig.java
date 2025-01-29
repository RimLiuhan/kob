package com.lh.backend.config;

/**
 * ClassName:WebSocketConfig
 * Package:com.lh.backend.config
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/24-9:45
 * @version:v1.0
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@Configuration
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {

        return new ServerEndpointExporter();
    }
}