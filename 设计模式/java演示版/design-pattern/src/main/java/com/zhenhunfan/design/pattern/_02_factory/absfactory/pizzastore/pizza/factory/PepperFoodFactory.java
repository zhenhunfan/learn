package com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.pizza.factory;

import com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.pizza.Hotdog;
import com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.pizza.PepperHotdog;
import com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.pizza.PepperPizza;
import com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.pizza.Pizza;

/**
 * <p>Title: BJPizzaFactory</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/3
 */
public class PepperFoodFactory implements FoodFactory {
    public Pizza createPizza() {
        return new PepperPizza();
    }

    public Hotdog createHotdog(){
        return new PepperHotdog();
    }
}
