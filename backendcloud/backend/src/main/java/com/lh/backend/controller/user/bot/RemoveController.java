package com.lh.backend.controller.user.bot;

import com.lh.backend.service.user.bot.RemoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * ClassName:RemoveController
 * Package:com.lh.backend.controller.user.bot
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/22-14:15
 * @version:v1.0
 */
@RestController
public class RemoveController {
    @Autowired
    private RemoveService removeService;
    @PostMapping("/api/user/bot/remove/")
    public Map<String, String> remove(@RequestParam Map<String, String> data) {
        return removeService.remove(data);
    }
}
