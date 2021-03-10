package com.zhenhunfan.design.pattern._07_decorator.demo2;

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
        Dress dress = new Mom(new Dad(new Child()));
        dress.dress();

        dress = new Dad(new Mom(new Child()));
        dress.dress();
    }
}

/**
 * 穿衣服接口，抽象构件角色
 */
interface Dress {
    void dress();
}

/**
 * 孩子类，会自己穿衣服，但只穿了内衣内裤，具体构件角色
 */
class Child implements Dress {

    public void dress() {
        System.out.println("孩子穿了内衣和内裤");
    }
}

/**
 * 穿其他衣服的类，抽象装饰
 */
abstract class Decorator implements Dress {
    private Dress dress;

    public Decorator(Dress dress) {
        this.dress = dress;
    }

    public void dress() {
        dress.dress();
    }
}

/**
 * 爸爸类，帮忙穿裤子，具体装饰角色
 */
class Dad extends Decorator{

    public Dad(Dress dress) {
        super(dress);
    }

    public void dress() {
        super.dress();
        System.out.println("爸爸帮忙穿裤子");
    }
}

/**
 * 妈妈类，帮忙穿上衣，具体装饰角色
 */
class Mom extends Decorator{

    public Mom(Dress dress) {
        super(dress);
    }

    public void dress() {
        super.dress();
        System.out.println("妈妈帮忙穿上衣");
    }
}


