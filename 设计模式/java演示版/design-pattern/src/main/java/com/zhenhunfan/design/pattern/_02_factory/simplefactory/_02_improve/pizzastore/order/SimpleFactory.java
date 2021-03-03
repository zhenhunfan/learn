package com.zhenhunfan.design.pattern._02_factory.simplefactory._02_improve.pizzastore.order;

import com.zhenhunfan.design.pattern._02_factory.simplefactory._02_improve.pizzastore.pizza.CheesePizza;
import com.zhenhunfan.design.pattern._02_factory.simplefactory._02_improve.pizzastore.pizza.GreekPizza;
import com.zhenhunfan.design.pattern._02_factory.simplefactory._02_improve.pizzastore.pizza.PepperPizza;
import com.zhenhunfan.design.pattern._02_factory.simplefactory._02_improve.pizzastore.pizza.Pizza;

/**
 * <p>Title: SimpleFactory</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/3
 */
public class SimpleFactory {
    /**
     * 根据orderType 返回Pizza对象,当然也可以写成静态方法
     * @param orderType pizza类型
     * @return pizza对象
     */
    public static Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
