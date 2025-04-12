package com.lh.backend.controller.record;

import com.alibaba.fastjson2.JSONObject;
import com.lh.backend.service.record.GetRecordListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * ClassName:GetRecordListController
 * Package:com.lh.backend.controller.record
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/4/12-9:42
 * @version:v1.0
 */
@RestController
public class GetRecordListController {
    @Autowired
    private GetRecordListService getRecordListService;
    @GetMapping("/record/getlist")
    JSONObject getList(@RequestParam Map<String, String> data) {
        Integer page = Integer.parseInt(data.get("page"));
        return getRecordListService.getList(page);
    }
}
