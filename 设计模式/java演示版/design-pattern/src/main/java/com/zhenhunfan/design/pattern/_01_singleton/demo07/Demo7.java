package com.zhenhunfan.design.pattern._01_singleton.demo07;

/**
 * <p>Title: Demo7</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/2
 */
public class Demo7 {
    public static void main(String[] args) {
        System.out.println("静态内部类,线程安全，效率也高，推荐");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

        //探究一个问题，执行下面这句话的时候，"Singleton 类初始化了"会不会输出？"SingletonInstance 类初始化了"会不会输出
        System.out.println(Singleton.name);
    }
}

class Singleton {

    static String name = "aaa";

    static {
        System.out.println("Singleton 类初始化了");
    }
    private Singleton() {}

    private static class SingletonInstance{
        static {
            System.out.println("SingletonInstance 类初始化了");
        }
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
