package com.zhenhunfan.design.pattern._02_factory.absfactory.pizzastore.pizza;

/**
 * <p>Title: Pizza</p>
 * <p>Description: 将Pizza类做成抽象</p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/2
 */
public abstract class Pizza {

    protected String name; //名字

    //准备原材料,不同的披萨不一样，因此做成抽象方法
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting; ");
    }

    public void box() {
        System.out.println(name + " boxing; ");
    }

    public void setName(String name) {
        this.name = name;
    }
}
