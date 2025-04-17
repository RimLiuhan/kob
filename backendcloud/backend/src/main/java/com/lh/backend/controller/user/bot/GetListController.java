package com.lh.backend.controller.user.bot;

import com.lh.backend.pojo.Bot;
import com.lh.backend.service.user.bot.GetListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName:GetListController
 * Package:com.lh.backend.controller.user.bot
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/22-15:04
 * @version:v1.0
 */
@RestController
public class GetListController {
    @Autowired
    private GetListService getListService;
    @GetMapping("/api/user/bot/getlist/")
    public List<Bot> getList()
    {
        return getListService.getList();
    }
}
