package com.zhenhunfan.design.pattern._02_factory.factory.pizzastore.pizza.factory;

import com.zhenhunfan.design.pattern._02_factory.factory.pizzastore.pizza.CheesePizza;
import com.zhenhunfan.design.pattern._02_factory.factory.pizzastore.pizza.Pizza;

/**
 * <p>Title: BJPizzaFactory</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/3
 */
public class CheesePizzaFactory extends PizzaFactory {
    public Pizza createPizza() {
        return new CheesePizza();
    }
}
