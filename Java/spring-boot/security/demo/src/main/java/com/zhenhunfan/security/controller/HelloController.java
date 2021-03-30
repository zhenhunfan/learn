package com.zhenhunfan.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/res1")
    public String toRes1(){
        return "res1";
    }

    @GetMapping("/res2")
    public String toRes2(){
        return "res2";
    }

}
