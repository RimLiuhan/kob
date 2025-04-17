package com.lh.backend.controller.user.bot;

import com.lh.backend.service.user.bot.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * ClassName:UpdateController
 * Package:com.lh.backend.controller.user.bot
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/22-14:49
 * @version:v1.0
 */
@RestController
public class UpdateController {
    @Autowired
    private UpdateService updateService;
    @PostMapping("/api/user/bot/update/")
    public Map<String, String> update(@RequestParam Map<String, String> data)
    {
        return updateService.update(data);
    }
}
