package com.lh.botrunningsystem;

import com.lh.botrunningsystem.service.impl.BotRunningServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName:BotRunningSystemApplication
 * Package:com.lh.botrunningsystem
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/4/8-14:50
 * @version:v1.0
 */
@SpringBootApplication
public class BotRunningSystemApplication {
    public static void main(String[] args) {
        BotRunningServiceImpl.botPool.start();
        SpringApplication.run(BotRunningSystemApplication.class, args);
    }
}
