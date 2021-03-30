package com.zhenhunfan.consumer2;

import com.zhenhunfan.consumer2.services.UseHello;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Consumer2ApplicationTests {

    @Autowired
    UseHello useHello;

    @Test
    void contextLoads() {
        useHello.sayHao();
    }

}
