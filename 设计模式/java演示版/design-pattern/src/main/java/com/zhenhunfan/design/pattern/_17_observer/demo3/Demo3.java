package com.zhenhunfan.design.pattern._17_observer.demo3;

import java.util.Observer;
import java.util.Observable;
/**
 * <p>Title: Demo3</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/10
 */
public class Demo3 {
    public static void main(String[] args) {
        OilFutures oil = new OilFutures();
        Observer bull = new Bull(); //多方
        Observer bear = new Bear(); //空方
        oil.addObserver(bull);
        oil.addObserver(bear);
        oil.setPrice(10);
        oil.setPrice(-8);
    }
}
//具体目标类：原油期货
class OilFutures extends Observable {
    private float price;
    public float getPrice() {
        return this.price;
    }
    public void setPrice(float price) {
        super.setChanged();  //设置内部标志位，注明数据发生变化
        super.notifyObservers(price);    //通知观察者价格改变了
        this.price = price;
    }
}
//具体观察者类：多方
class Bull implements Observer {
    public void update(Observable o, Object arg) {
        Float price = ((Float) arg).floatValue();
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，多方高兴了！");
        } else {
            System.out.println("油价下跌" + (-price) + "元，多方伤心了！");
        }
    }
}
//具体观察者类：空方
class Bear implements Observer {
    public void update(Observable o, Object arg) {
        Float price = ((Float) arg).floatValue();
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，空方伤心了！");
        } else {
            System.out.println("油价下跌" + (-price) + "元，空方高兴了！");
        }
    }
}
