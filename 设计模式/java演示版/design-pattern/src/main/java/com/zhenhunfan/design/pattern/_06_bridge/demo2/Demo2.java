package com.zhenhunfan.design.pattern._06_bridge.demo2;

/**
 * <p>Title: Demo2</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/9
 */
public class Demo2 {
    public static void main(String[] args) {
        //女士买个红色的挎包
        Red red = new Red();
        HandBag handBag = new HandBag();
        handBag.setColor(red);

        System.out.println("买了一个"+handBag.getName());
    }
}

//实现化角色：颜色
interface Color {
    String getColor();
}
//具体实现化角色：黄色
class Yellow implements Color {
    public String getColor() {
        return "yellow";
    }
}
//具体实现化角色：红色
class Red implements Color {
    public String getColor() {
        return "red";
    }
}
//抽象化角色：包
abstract class Bag {
    protected Color color;
    public void setColor(Color color) {
        this.color = color;
    }
    public abstract String getName();
}
//扩展抽象化角色：挎包
class HandBag extends Bag {
    public String getName() {
        return color.getColor() + "HandBag";
    }
}
//扩展抽象化角色：钱包
class Wallet extends Bag {
    public String getName() {
        return color.getColor() + "Wallet";
    }
}
