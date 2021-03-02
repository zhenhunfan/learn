package com.zhenhunfan.design.pattern._01_singleton.demo08;

/**
 * <p>Title: Demo8</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/2
 */
public class Demo8 {
    public static void main(String[] args) {
        System.out.println("枚举,线程安全，效率也高，推荐");
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

        instance.method();
    }
}

enum Singleton {
    INSTANCE;

    public void method() {
        System.out.println("这是方法");
    }
}
