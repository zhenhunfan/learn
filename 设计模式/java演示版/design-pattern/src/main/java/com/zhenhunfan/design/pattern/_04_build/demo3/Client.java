package com.zhenhunfan.design.pattern._04_build.demo3;


import com.zhenhunfan.design.pattern._04_build.demo3.component.Wall;
import com.zhenhunfan.design.pattern._04_build.demo3.component.Basic;
import com.zhenhunfan.design.pattern._04_build.demo3.component.Roof;

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
        House house = new House.Builder().builderBasic(new Basic()).builderWall(new Wall()).builderRoof(new Roof()).build();
        System.out.println(house);
    }
}
