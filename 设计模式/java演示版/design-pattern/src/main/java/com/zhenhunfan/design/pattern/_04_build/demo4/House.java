package com.zhenhunfan.design.pattern._04_build.demo4;

import com.zhenhunfan.design.pattern._04_build.demo4.component.Basic;
import com.zhenhunfan.design.pattern._04_build.demo4.component.Roof;
import com.zhenhunfan.design.pattern._04_build.demo4.component.Wall;
import lombok.Builder;
import lombok.Data;

/**
 * <p>Title: AbstractHouse</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/4
 */
@Data
@Builder
public class House {
    private Basic basic;
    private Wall wall;
    private Roof roof;

    public House(Basic basic, Wall wall, Roof roof) {
        this.basic = basic;
        this.wall = wall;
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "basic=" + basic +
                ", wall=" + wall +
                ", roof=" + roof +
                '}';
    }
}
