package com.zhenhunfan.design.pattern.classloader;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/5
 */
public class Client {
    public static void main(String[] args) {

        //1.请求执行下面这句话会不会输出"Demo 初始化了",答案是不会
        //Class<Demo> demoClass = Demo.class;

        //2.请求执行下面这句话会不会输出"Demo 初始化了",答案是会
        System.out.println(Demo.name);
    }
}

class Demo{
    static {
        System.out.println("Demo 初始化了");
    }
    static Demo instance = new Demo();
    static String name = "aaa";
}
