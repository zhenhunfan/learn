package com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.pizza.factory;

import com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.pizza.*;

/**
 * <p>Title: BJPizzaFactory</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/3
 */
public class CheeseFoodFactory implements FoodFactory {
    public Pizza createPizza() {
        return new CheesePizza();
    }

    public Hotdog createHotdog(){
        return new CheeseHotdog();
    }
}
