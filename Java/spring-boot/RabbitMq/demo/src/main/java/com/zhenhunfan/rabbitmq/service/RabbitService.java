package com.zhenhunfan.rabbitmq.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitService {

    @RabbitListener(queues = "msg.direct.one")
    public void receive(Message message){
        System.out.println(message.getBody());//获取消息体
        System.out.println(message.getMessageProperties());//获取消息头
    }

    @RabbitListener(queues = "msg.direct.one")
    public void receive(Object messageBody){

    }
}
