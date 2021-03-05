package com.zhenhunfan.design.pattern._04_build.demo2.builder;

import com.zhenhunfan.design.pattern._04_build.demo2.component.Basic;
import com.zhenhunfan.design.pattern._04_build.demo2.component.Roof;
import com.zhenhunfan.design.pattern._04_build.demo2.component.Wall;

/**
 * <p>Title: HouseBuilder</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/5
 */
public interface HouseBuilder {
    /**
     * 造地基
     */
    Basic buildBasic();

    /**
     * 造墙体
     */
    Wall buildWall();

    /**
     * 造楼顶
     */
    Roof buildRoof();
}
