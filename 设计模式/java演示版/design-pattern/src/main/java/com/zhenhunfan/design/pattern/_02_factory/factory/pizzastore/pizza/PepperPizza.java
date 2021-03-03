package com.zhenhunfan.design.pattern._02_factory.factory.pizzastore.pizza;


/**
 * <p>Title: PepperPizza</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/3
 */
public class PepperPizza extends Pizza {
    public PepperPizza(){
        setName("BJ胡椒披");
    }
    @Override
    public void prepare() {
        System.out.println("给制作BJ胡椒披萨准备原材料");
    }
}
