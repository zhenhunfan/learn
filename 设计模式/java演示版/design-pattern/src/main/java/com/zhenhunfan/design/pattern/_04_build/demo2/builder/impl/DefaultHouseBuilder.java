package com.zhenhunfan.design.pattern._04_build.demo2.builder.impl;

import com.zhenhunfan.design.pattern._04_build.demo2.builder.HouseBuilder;
import com.zhenhunfan.design.pattern._04_build.demo2.component.Basic;
import com.zhenhunfan.design.pattern._04_build.demo2.component.Roof;
import com.zhenhunfan.design.pattern._04_build.demo2.component.Wall;

/**
 * <p>Title: DefaultHouseBuilder</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/5
 */
public class DefaultHouseBuilder implements HouseBuilder {
    public Basic buildBasic() {
        System.out.println("建造地基");
        return new Basic();
    }

    public Wall buildWall() {
        System.out.println("建造墙壁");
        return new Wall();
    }

    public Roof buildRoof() {
        System.out.println("建造屋顶");
        return new Roof();
    }
}
