package com.zhenhunfan.design.pattern._04_build.jdk;

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
        //StringBuilder 用到了一些创建者模式的思想，append后的对象还是同一个对象，就像在一步步创建对象
        StringBuilder sb = new StringBuilder();
        StringBuilder aaa = sb.append("aaa");
        System.out.println(sb == aaa);

        //BeanDefinitionBuilder类也是
    }
}
