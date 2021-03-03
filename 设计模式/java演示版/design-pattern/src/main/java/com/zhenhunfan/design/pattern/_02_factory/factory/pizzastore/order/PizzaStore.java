package com.zhenhunfan.design.pattern._02_factory.factory.pizzastore.order;

import com.zhenhunfan.design.pattern._02_factory.factory.pizzastore.pizza.factory.CheesePizzaFactory;

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
        CheesePizzaFactory bjPizzaFactory = new CheesePizzaFactory();
        OrderPizza orderPizza = new OrderPizza(bjPizzaFactory);
        orderPizza.orderPizza();
    }
}
