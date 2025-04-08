package com.lh.botrunningsystem.controller;

import com.lh.botrunningsystem.service.impl.BotRunningServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:BotRunningController
 * Package:com.lh.botrunningsystem.controller
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/4/8-14:55
 * @version:v1.0
 */
@RestController
public class BotRunningController {
    @Autowired
    private BotRunningServiceImpl botRunningService;
    @PostMapping("/bot/add/")
    public String addBot(@RequestParam MultiValueMap<String, String> data) {
        Integer userId = Integer.parseInt(data.getFirst("user_id"));
        String botCode = data.getFirst("bot_code");
        String input = data.getFirst("input");
        return botRunningService.addBot(userId, botCode, input);
    }
}
