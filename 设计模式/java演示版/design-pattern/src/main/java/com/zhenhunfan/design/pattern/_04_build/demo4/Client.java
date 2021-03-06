package com.zhenhunfan.design.pattern._04_build.demo4;


import com.zhenhunfan.design.pattern._04_build.demo4.component.Basic;
import com.zhenhunfan.design.pattern._04_build.demo4.component.Roof;
import com.zhenhunfan.design.pattern._04_build.demo4.component.Wall;

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
        House house = new House.HouseBuilder().basic(new Basic()).wall(new Wall()).roof(new Roof()).build();
        System.out.println(house);
    }
}
