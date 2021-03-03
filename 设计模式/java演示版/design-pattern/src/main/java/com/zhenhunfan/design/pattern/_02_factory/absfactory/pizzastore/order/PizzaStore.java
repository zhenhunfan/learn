package com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.order;

import com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.pizza.factory.CheeseFoodFactory;

/**
 * <p>Title: PizzaStore</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/2
 */
public class PizzaStore {
    public static void main(String[] args) {
        CheeseFoodFactory cheeseFoodFactory = new CheeseFoodFactory();
        OrderPizza orderPizza = new OrderPizza(cheeseFoodFactory);
        orderPizza.orderPizza();
    }
}
