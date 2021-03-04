package com.zhenhunfan.design.pattern._03_prototype.demo1;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/3
 */
public class Client {
    public static void main(String[] args) {
        Sheep tom = new Sheep("tom",1,"白色");

        Sheep sheep1 = new Sheep(tom.getName(),tom.getAge(),tom.getColor());
        Sheep sheep2 = new Sheep(tom.getName(),tom.getAge(),tom.getColor());
        Sheep sheep3 = new Sheep(tom.getName(),tom.getAge(),tom.getColor());
        Sheep sheep4 = new Sheep(tom.getName(),tom.getAge(),tom.getColor());
        Sheep sheep5 = new Sheep(tom.getName(),tom.getAge(),tom.getColor());
        Sheep sheep6 = new Sheep(tom.getName(),tom.getAge(),tom.getColor());
        Sheep sheep7 = new Sheep(tom.getName(),tom.getAge(),tom.getColor());
        Sheep sheep8 = new Sheep(tom.getName(),tom.getAge(),tom.getColor());
        Sheep sheep9 = new Sheep(tom.getName(),tom.getAge(),tom.getColor());
        Sheep sheep10 = new Sheep(tom.getName(),tom.getAge(),tom.getColor());

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
    }
}
