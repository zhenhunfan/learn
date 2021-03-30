package com.zhenhunfna.provider.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String sayHello(){
        System.out.println("8001来了");
        return "你好啊！";
    }
}
