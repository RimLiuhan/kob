package com.lh.backend.controller.user.bot;

import com.lh.backend.service.user.bot.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * ClassName:AddController
 * Package:com.lh.backend.controller.user.bot
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/22-13:36
 * @version:v1.0
 */
@RestController
public class AddController {
    @Autowired
    private AddService addService;

    @PostMapping("/api/user/bot/add/")
    public Map<String, String> add(@RequestParam Map<String, String> data) {
        return addService.add(data);
    }
}
