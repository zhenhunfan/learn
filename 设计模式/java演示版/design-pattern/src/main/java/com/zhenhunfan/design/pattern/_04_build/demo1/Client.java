package com.zhenhunfan.design.pattern._04_build.demo1;

import com.zhenhunfan.design.pattern._04_build.demo1.component.Basic;
import com.zhenhunfan.design.pattern._04_build.demo1.component.Roof;
import com.zhenhunfan.design.pattern._04_build.demo1.component.Wall;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/4
 */
public class Client {
    public static void main(String[] args) {
        House house = new House(new Basic(), new Wall(), new Roof());
        System.out.println(house);
    }
}
