package com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.pizza.factory;

import com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.pizza.Hotdog;
import com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.pizza.Pizza;

/**
 * <p>Title: PizzaFactory</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/3
 */
public interface FoodFactory {
    Pizza createPizza();
    Hotdog createHotdog();
}
