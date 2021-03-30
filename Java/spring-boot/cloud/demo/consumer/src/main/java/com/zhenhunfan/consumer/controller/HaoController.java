package com.zhenhunfan.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HaoController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hao")
    public String hao(){
        String s = restTemplate.getForObject("http://provider/sayhao", String.class);
        return "哈哈"+s;
    }
}
