package com.zhenhunfan.design.pattern.principle._04_liskov;

/**
 * <p>Title: Demo1</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/1
 */
public class Demo1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("l-8=" + a.func1(1, 8));

        System.out.println("--------------------------------------------------");

        B b = new B();
        System.out.println("11-3=" + b.func1(11, 3));
        System.out.println("l-8=" + b.func1(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));
    }
}

//A类
class A {
    //返回两个数的差
    public int func1(int numl, int num2) {
        return numl - num2;
    }
}

//B类继承了A
//增加了一个新功能;完成两个数相加，然后和9求和
class B extends A {
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}
