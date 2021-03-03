package com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.pizza;

/**
 * <p>Title: CheeseHotdog</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/3
 */
public class CheeseHotdog extends Hotdog {
    public CheeseHotdog(){
        setName("奶酪热狗");
    }

    @Override
    public void prepare() {
        System.out.println("给制作奶酪热狗准备原材料");
    }
}
