package com.zhenhunfan.design.pattern._02_factory.simplefactory._01_tradition.pizzastore.pizza;

/**
 * <p>Title: GreekPizza</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/2
 */
public class GreekPizza extends Pizza {
    public void prepare() {
        System.out.println("给制作希腊披萨准备原材料");
    }
}
