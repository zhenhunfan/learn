package com.zhenhunfan.task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Scheduled(cron = "* * * * * *")
    public void sayHello(){
        System.out.println("你好啊");
    }
}
