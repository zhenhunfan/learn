package com.zhenhunfan.rabbitmq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.RabbitAutoConfiguration
 * 2.连接工厂 CachingConnectionFactory
 * 3、RabbitProperties
 * 4、RabbitTemplate 发送和接收消息的
 * 5、AmqpAdmin 管理exchange、queue、bind
 */
@EnableRabbit
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
