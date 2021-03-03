package com.zhenhunfan.design.pattern._02_factory.factory.pizzastore.pizza.factory;

import com.zhenhunfan.design.pattern._02_factory.factory.pizzastore.pizza.Pizza;

/**
 * <p>Title: PizzaFactory</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/3
 */
public abstract class PizzaFactory {
    public abstract Pizza createPizza();
}
