package com.zhenhunfan.design.pattern._03_prototype.demo4;


/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/3
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep friend = new Sheep("suzy",2,"black",null);
        Sheep tom = new Sheep("tom",1,"白色",friend);
        Sheep jack = tom.clone();

        //是两个不同的对象
        System.out.println("tom == jack : "+(tom == jack));

        //重写clone()后就不是同一个对象了
        System.out.println("tom.friend == jack.friend : "+(tom.friend == jack.friend));
    }
}
