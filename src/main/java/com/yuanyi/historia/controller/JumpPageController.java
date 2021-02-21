package com.yuanyi.historia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 页面跳转控制器
 */
@Controller
public class JumpPageController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
