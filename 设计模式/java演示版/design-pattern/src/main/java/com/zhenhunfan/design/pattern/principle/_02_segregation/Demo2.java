package com.zhenhunfan.design.pattern.principle._02_segregation;

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
        _2_A a = new _2_A();
        _2_B b = new _2_B();
        _2_C c = new _2_C();
        _2_D d = new _2_D();

        a.depend1(b);
        a.depend2(b);
        a.depend3(b);

        c.depend1(d);
        c.depend4(d);
        c.depend5(d);
    }
}

//接口
interface Interface2_1 {
    void operation1();
}
interface Interface2_2 {
    void operation2();
    void operation3();
}
interface Interface2_3 {
    void operation4();
    void operation5();
}

class _2_B implements Interface2_1,Interface2_2{

    public void operation1() {
        System.out.println("B 实现了 operationl");
    }

    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    public void operation3() {
        System.out.println("B 实现了 operation3");
    }
}

class _2_D implements Interface2_1,Interface2_3{

    public void operation1() {
        System.out.println("D 实现了 operationl");
    }

    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}

class _2_A {
    public void depend1(Interface2_1 i){
        i.operation1();
    }
    public void depend2(Interface2_2 i){
        i.operation2();
    }
    public void depend3(Interface2_2 i){
        i.operation3();
    }
}

class _2_C {
    public void depend1(Interface2_1 i){
        i.operation1();
    }
    public void depend4(Interface2_3 i){
        i.operation4();
    }
    public void depend5(Interface2_3 i){
        i.operation5();
    }
}
