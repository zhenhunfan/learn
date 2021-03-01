package com.zhenhunfan.design.pattern.principle._03_inversion;

/**
 * <p>Title: Demo1</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/2/27
 */
public class Demo1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getlnfo() {
        return "电子邮件信息：hello,world";
    }
}
//完成Person接收消息的功能
//方式1分析
//1.简单，比较容易想到
//2.如果我们获取的对象是微信，短信等等，则新增类，同时Persons也要增加相应的接收方法
//3.解决思路:引入一个抽象的接口IReceiver,表示接收者，这样Person类与接口IReceiver发生依赖
//因为Email, WeiXin等等属于接收的范围，他们各自实现IReceiver接口就OK,这样我们就符和依赖倒转原则
class Person {
    public void receive(Email email ) {
        System.out.println(email.getlnfo());
    }
}
