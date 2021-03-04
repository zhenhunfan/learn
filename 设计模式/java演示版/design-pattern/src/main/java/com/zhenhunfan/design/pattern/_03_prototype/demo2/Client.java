package com.zhenhunfan.design.pattern._03_prototype.demo2;


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
        Sheep tom = new Sheep("tom",1,"白色");

        Sheep sheep1 = (Sheep)tom.clone();
        Sheep sheep2 = (Sheep)tom.clone();
        Sheep sheep3 = (Sheep)tom.clone();
        Sheep sheep4 = (Sheep)tom.clone();
        Sheep sheep5 = (Sheep)tom.clone();
        Sheep sheep6 = (Sheep)tom.clone();
        Sheep sheep7 = (Sheep)tom.clone();
        Sheep sheep8 = (Sheep)tom.clone();
        Sheep sheep9 = (Sheep)tom.clone();
        Sheep sheep10 = (Sheep)tom.clone();

        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
        System.out.println(sheep6);
        System.out.println(sheep7);
        System.out.println(sheep8);
        System.out.println(sheep9);
        System.out.println(sheep10);

        System.out.println(sheep9 == sheep10);
    }
}
