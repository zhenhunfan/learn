package com.zhenhunfan.design.pattern._01_singleton.demo09;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * <p>Title: Demo1</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/2
 */
public class Demo9 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //测试
        Singleton instance = Singleton.getInstance();

        //拿到构造方法
        Constructor<Singleton> declaredConstructor = Singleton.class.getDeclaredConstructor();
        //修改构造方法的访问权限
        declaredConstructor.setAccessible(true);
        //通过构造方法创建实例
        Singleton instance2 = declaredConstructor.newInstance();

        //判断instance和instance2是否是同一个实例，发现并不是，因此违反了单例
        System.out.println(instance == instance2);
    }
}

//饿汉式（静态变量）
class Singleton {
    //1.构造器私有化，外部不能new
    private Singleton() {
        if(instance!=null)
            throw new RuntimeException("已经存在一个Singleton实例！");
    }

    //2.本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
