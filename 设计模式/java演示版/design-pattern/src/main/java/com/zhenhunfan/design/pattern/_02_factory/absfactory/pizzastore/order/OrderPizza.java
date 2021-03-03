package com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.order;

import com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.pizza.Hotdog;
import com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.pizza.Pizza;
import com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.pizza.factory.FoodFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>Title: OrderPizza</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/2
 */
public class OrderPizza {

    FoodFactory foodFactory;

    public OrderPizza(FoodFactory foodFactory) {
        this.foodFactory = foodFactory;
    }

    public void orderPizza() {
        Pizza pizza;
        pizza = foodFactory.createPizza();
        if (pizza == null) {
            System.out.println("没有指定种类的pizza");
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        Hotdog hotdog = foodFactory.createHotdog();
        if (hotdog == null) {
            System.out.println("没有指定种类的hotdog");
        }
        hotdog.prepare();
        hotdog.bake();
        hotdog.cut();
        hotdog.box();
    }
}
