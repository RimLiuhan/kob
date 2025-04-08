package com.lh.botrunningsystem.service.impl;

import com.lh.botrunningsystem.service.BotRunningService;
import org.springframework.stereotype.Service;

/**
 * ClassName:BotRunningServiceImpl
 * Package:com.lh.botrunningsystem.service.impl
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/4/8-14:54
 * @version:v1.0
 */
@Service
public class BotRunningServiceImpl implements BotRunningService {

    @Override
    public String addBot(Integer userId, String botCode, String input) {
        System.out.println("add bot: " + userId + " "+ botCode + " " + input);
        return "add bot success";
    }
}
