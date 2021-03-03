package com.zhenhunfan.design.pattern._02_factory.simplefactory._02_improve.pizzastore.order;

import com.zhenhunfan.design.pattern._02_factory.simplefactory._02_improve.pizzastore.pizza.Pizza;

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
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType; //订购坡萨的类型

//    }

    SimpleFactory simpleFactory;

    public OrderPizza(SimpleFactory simpleFactory){
        this.simpleFactory = simpleFactory;
    }

    public void orderPizza(){
        do {
            Pizza pizza = null;
            String pizzaType = getType();
            pizza = simpleFactory.createPizza(pizzaType);
            if(pizza == null){
                System.out.println("没有指定种类的pizza");
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }
    /**
     * 写一个方法，可以获职客户希望订购的披萨种类
     */
    private String getType() {
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
