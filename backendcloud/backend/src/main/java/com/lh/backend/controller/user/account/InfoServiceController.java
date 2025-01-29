package com.lh.backend.controller.user.account;

import com.lh.backend.service.user.account.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * ClassName:InfoServiceController
 * Package:com.lh.backend.controller.user.account
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/20-16:25
 * @version:v1.0
 */
@RestController
public class InfoServiceController {
    @Autowired
    private InfoService infoService;

    @GetMapping("/user/account/info/")
    public Map<String, String> getInfo()
    {
        return infoService.getInfo();
    }
}
