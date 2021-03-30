package com.zhenhunfan.rabbitmq;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    AmqpAdmin amqpAdmin;

    @Test
    void amqpAdminShow(){
        amqpAdmin.declareExchange(new DirectExchange("show"));
    }

    @Test
    void sendmsg() {

        //send方法需要构造一个message对象,消息头，消息体
        //rabbitTemplate.send(exchang,routekey,message);

        //convertAndSend会自动把object序列化成消息体，
        Map<String,Object> map = new HashMap<>();
        map.put("msg","这是第一个消息");
        rabbitTemplate.convertAndSend("zhenhunfan.direct","msg.direct.one",map);
    }

    @Test
    void receivemsg(){
        Object o = rabbitTemplate.receiveAndConvert("msg.direct.one");
        System.out.println(o.getClass());
        System.out.println(o);
    }
}
