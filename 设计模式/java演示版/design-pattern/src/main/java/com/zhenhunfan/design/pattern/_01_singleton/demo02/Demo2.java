package com.zhenhunfan.design.pattern._01_singleton.demo02;

/**
 * <p>Title: Demo2</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/2
 */
public class Demo2 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

//饿汉式（静态变量）
class Singleton {
    //1.构造器私有化，外部不能new
    private Singleton() {
    }

    //2.本类内部创建对象实例
    private static Singleton instance;

    static{
        instance  = new Singleton();
    }

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
