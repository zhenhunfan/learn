package com.zhenhunfan.design.pattern._03_prototype.jdk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/4
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Object suzy1 = applicationContext.getBean("suzy");
        Object suzy2 = applicationContext.getBean("suzy");
        System.out.println(suzy1 == suzy2);
    }
}
