package com.lh.matchingsystem;

import com.lh.matchingsystem.service.impl.MatchingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName:MatchingSystemApplication
 * Package:com.lh.matchingsystem
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/29-10:29
 * @version:v1.0
 */
@SpringBootApplication
public class MatchingSystemApplication {
    public static void main(String[] args) {
        MatchingServiceImpl.matchingPool.start();
        SpringApplication.run(MatchingSystemApplication.class, args);
    }
}
