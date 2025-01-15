package com.lh.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:IndexController
 * Package:com.lh.backend.controller.pk
 * Description:
 *
 * @author:LH寒酥
 * @create:2025/1/15-16:06
 * @version:v1.0
 */
@RestController
@RequestMapping("/pk/")
public class IndexController {
    @RequestMapping("index/")
    public Map<String,String> index(){
        Map<String, String> map = new HashMap<>();
        map.put("name", "lh");
        map.put("age", "18");
        return map;
    }
}
