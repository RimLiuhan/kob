package com.lh.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String index(){
        return "hhhhhhhhh";
    }
}
