package com.zhenhunfan.design.pattern._02_factory.simplefactory._02_improve.pizzastore.order;

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
        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
        orderPizza.orderPizza();
    }
}
