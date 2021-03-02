package com.zhenhunfan.design.pattern._01_singleton.demo04;

/**
 * <p>Title: Demo4</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/2
 */
public class Demo4 {
    public static void main(String[] args) {
        System.out.println("懒汉式2,线程安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class Singleton {
    private static Singleton instance;
    private Singleton() {}
    //提供一个静态的公有方法，当使用到该方法时，才去创建instance
    //即懒汉式
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
