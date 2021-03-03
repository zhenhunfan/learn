package com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.pizza;

/**
 * <p>Title: CheesePizza</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/2
 */
public class CheesePizza extends Pizza {

    public CheesePizza(){
        setName("奶酪披萨");
    }

    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨准备原材料");
    }
}
