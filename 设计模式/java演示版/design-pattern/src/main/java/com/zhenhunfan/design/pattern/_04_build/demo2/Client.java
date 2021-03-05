package com.zhenhunfan.design.pattern._04_build.demo2;

import com.zhenhunfan.design.pattern._04_build.demo2.builder.impl.DefaultHouseBuilder;
import com.zhenhunfan.design.pattern._04_build.demo2.component.Basic;
import com.zhenhunfan.design.pattern._04_build.demo2.component.Roof;
import com.zhenhunfan.design.pattern._04_build.demo2.component.Wall;

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

        DefaultHouseBuilder defaultHouseBuilder = new DefaultHouseBuilder();
        Director director = new Director(defaultHouseBuilder);

        House house = director.build();
        System.out.println(house);
    }
}
