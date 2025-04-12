package com.lh.backend.controller.ranklist;

import com.alibaba.fastjson2.JSONObject;
import com.lh.backend.service.ranklist.GetRanklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * ClassName:GetRanklistController
 * Package:com.lh.backend.controller.ranklist
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/4/12-16:18
 * @version:v1.0
 */
@RestController
public class GetRanklistController {
    @Autowired
    private GetRanklistService getRanklistService;
    @GetMapping("/ranklist/getlist/")
    public JSONObject getlist(@RequestParam Map<String, String> data) {
        Integer page = Integer.parseInt(data.get("page"));
        return getRanklistService.getlist(page);
    }
}
