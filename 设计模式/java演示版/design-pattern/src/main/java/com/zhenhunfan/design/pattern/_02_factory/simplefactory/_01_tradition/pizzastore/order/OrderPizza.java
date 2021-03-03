package com.zhenhunfan.design.pattern._02_factory.simplefactory._01_tradition.pizzastore.order;

import com.zhenhunfan.design.pattern._02_factory.simplefactory._01_tradition.pizzastore.pizza.CheesePizza;
import com.zhenhunfan.design.pattern._02_factory.simplefactory._01_tradition.pizzastore.pizza.GreekPizza;
import com.zhenhunfan.design.pattern._02_factory.simplefactory._01_tradition.pizzastore.pizza.Pizza;

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

    /**
     * 构造函数
     */
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; //订购坡萨的类型
        do {
            orderType = gettype();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName(" 希腊披萨 ");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName(" 奶酪披萨 ");
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    //写一个方法，可以获职客户希望订购的披萨种类
    private String gettype() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
