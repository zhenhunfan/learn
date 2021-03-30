package com.zhenhunfan.provider.services;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service
public class SayHelloImpl implements SayHello {

    @Override
    public String sayHello() {
        return "你好啊！";
    }
}
