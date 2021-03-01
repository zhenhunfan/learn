package com.zhenhunfan.design.pattern.principle._03_inversion;

/**
 * <p>Title: Demo2</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/2/27
 */
public class Demo2 {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        IReceiver email = new Email2();
        IReceiver weixin = new Weixin();

        person2.receive(email);
        person2.receive(weixin);
    }
}

interface IReceiver{
    String getlnfo();
}
class Email2 implements IReceiver{
    public String getlnfo() {
        return "电子邮件信息：hello,world";
    }
}

class Weixin implements IReceiver{
    public String getlnfo() {
        return "微信信息：hello,world";
    }
}

class Person2 {
    public void receive(IReceiver iReceiver ) {
        System.out.println(iReceiver.getlnfo());
    }
}
