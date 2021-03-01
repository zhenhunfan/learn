package com.zhenhunfan.design.pattern.principle._04_liskov;

/**
 * <p>Title: Demo2</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/1
 */
public class Demo2 {
    public static void main(String[] args) {

        A2 a = new A2();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("l-8=" + a.func1(1, 8));

        System.out.println("--------------------------------------------------");

        B2 b = new B2();
        //因为B2类不再继承A2类，因此调用者，不会再认为func1是求减法
        //调用完成的功能就会很明确
        System.out.println("11+3=" + b.func1(11, 3));//这里本意是求出 11+3
        System.out.println("1+8=" + b.func1(1, 8));// 1+8
        System.out.println("11+3+9=" + b.func2(11, 3));
        //使用组合仍然可以使用到A类相关方法
        System.out.println("ll-3=" + b.func3(11, 3));// 这里本意是求出 11-3
    }
}

class Base {

}
//A2类继承了Base
class A2 extends Base{
    //返回两个数的差
    public int func1(int numl, int num2) {
        return numl - num2;
    }
}

//B2类继承了Base
//增加了一个新功能;完成两个数相加，然后和9求和
class B2 extends Base {
    //如果B2需要使用A2的方法，使用组合关系
    private A2 a2 = new A2();
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    public int func3(int a, int b) {
        return a2.func1(a, b);
    }
}
