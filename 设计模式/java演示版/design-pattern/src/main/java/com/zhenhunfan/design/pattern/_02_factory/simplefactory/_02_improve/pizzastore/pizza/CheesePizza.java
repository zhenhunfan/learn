package com.zhenhunfan.design.pattern._02_factory.simplefactory._02_improve.pizzastore.pizza;

/**
 * <p>Title: CheesePizza</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/2
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨准备原材料");
    }
}
