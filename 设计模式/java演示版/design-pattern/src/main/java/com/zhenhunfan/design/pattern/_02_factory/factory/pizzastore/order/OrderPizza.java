package com.zhenhunfan.design.pattern._02_factory.factory.pizzastore.order;

import com.zhenhunfan.design.pattern._02_factory.factory.pizzastore.pizza.Pizza;
import com.zhenhunfan.design.pattern._02_factory.factory.pizzastore.pizza.factory.PizzaFactory;

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

    PizzaFactory pizzaFactory;

    public OrderPizza(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public void orderPizza() {
        Pizza pizza;
        pizza = pizzaFactory.createPizza();
        if (pizza == null) {
            System.out.println("没有指定种类的pizza");
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }


}
