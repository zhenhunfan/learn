package com.zhenhunfan.design.pattern._04_build.demo3;

import com.zhenhunfan.design.pattern._04_build.demo3.component.Basic;
import com.zhenhunfan.design.pattern._04_build.demo3.component.Roof;
import com.zhenhunfan.design.pattern._04_build.demo3.component.Wall;
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

    static class Builder{
        private Basic basic;
        private Wall wall;
        private Roof roof;

        public Builder builderBasic(Basic basic){
            this.basic = basic;
            return this;
        }

        public Builder builderWall(Wall wall){
            this.wall = wall;
            return this;
        }

        public Builder builderRoof(Roof roof){
            this.roof = roof;
            return this;
        }

        House build(){
            return new House(this.basic,this.wall,this.roof);
        }
    }
}
