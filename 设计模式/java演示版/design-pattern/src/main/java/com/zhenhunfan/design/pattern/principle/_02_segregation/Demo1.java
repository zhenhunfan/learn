package com.zhenhunfan.design.pattern.principle._02_segregation;

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
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.depend1(b);
        a.depend2(b);
        a.depend3(b);

        c.depend1(d);
        c.depend4(d);
        c.depend5(d);
    }
}

//接口
interface Interfacel {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interfacel{

    public void operation1() {
        System.out.println("B 实现了 operationl");
    }

    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    public void operation3() {
        System.out.println("B 实现了 operation3");
    }

    public void operation4() {
        System.out.println("B 实现了 operation4");
    }

    public void operation5() {
        System.out.println("B 实现了 operation5");
    }
}

class D implements Interfacel{

    public void operation1() {
        System.out.println("D 实现了 operationl");
    }

    public void operation2() {
        System.out.println("D 实现了 operation2");
    }

    public void operation3() {
        System.out.println("D 实现了 operation3");
    }

    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}

class A {
    public void depend1(Interfacel i){
        i.operation1();
    }
    public void depend2(Interfacel i){
        i.operation2();
    }
    public void depend3(Interfacel i){
        i.operation3();
    }
}

class C {
    public void depend1(Interfacel i){
        i.operation1();
    }
    public void depend4(Interfacel i){
        i.operation4();
    }
    public void depend5(Interfacel i){
        i.operation5();
    }
}
