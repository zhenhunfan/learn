package com.zhenhunfan.design.pattern._04_build.demo2;

import com.zhenhunfan.design.pattern._04_build.demo2.builder.HouseBuilder;
import com.zhenhunfan.design.pattern._04_build.demo2.component.Basic;
import com.zhenhunfan.design.pattern._04_build.demo2.component.Roof;
import com.zhenhunfan.design.pattern._04_build.demo2.component.Wall;
import lombok.Data;

/**
 * <p>Title: Director</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/5
 */
@Data
public class Director {
    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House build(){
        Basic basic = houseBuilder.buildBasic();
        Wall wall = houseBuilder.buildWall();
        Roof roof = houseBuilder.buildRoof();

        return new House(basic,wall,roof);
    }
}
