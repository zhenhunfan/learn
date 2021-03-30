package com.zhenhunfan.consumer2.services;

import com.zhenhunfan.provider.services.SayHello;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UseHello {
    @Reference
    SayHello sayHello;

    public void sayHao(){
        System.out.println(sayHello.sayHello());
    }
}
