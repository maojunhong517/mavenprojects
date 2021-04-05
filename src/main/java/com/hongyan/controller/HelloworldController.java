package com.hongyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloworldController {
    @RequestMapping("/say.html")
    @ResponseBody
    public String say(){
        return "HelloSpringBoot";
    }
}
