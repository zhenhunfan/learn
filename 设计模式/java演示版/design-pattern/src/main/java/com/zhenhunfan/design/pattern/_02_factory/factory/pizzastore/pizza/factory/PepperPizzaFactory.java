package com.zhenhunfan.design.pattern._02_factory.factory.pizzastore.pizza.factory;

import com.zhenhunfan.design.pattern._02_factory.factory.pizzastore.pizza.*;

/**
 * <p>Title: BJPizzaFactory</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/3
 */
public class PepperPizzaFactory extends PizzaFactory {
    public Pizza createPizza() {
        return new PepperPizza();
    }
}
