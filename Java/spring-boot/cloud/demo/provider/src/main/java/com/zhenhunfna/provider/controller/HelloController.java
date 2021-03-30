package com.zhenhunfna.provider.controller;

import com.zhenhunfna.provider.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/sayhao")
    public String sayHao(){
       return helloService.sayHello();
    }
}
