package com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.pizza;

/**
 * <p>Title: PepperPizza</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/3
 */
public class PepperHotdog extends Hotdog {
    public PepperHotdog(){
        setName("胡椒热狗");
    }
    @Override
    public void prepare() {
        System.out.println("给制作胡椒热狗准备原材料");
    }
}
