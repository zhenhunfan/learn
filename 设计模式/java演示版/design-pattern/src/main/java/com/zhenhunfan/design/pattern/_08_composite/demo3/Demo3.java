package com.zhenhunfan.design.pattern._08_composite.demo3;

import java.util.ArrayList;

/**
 * <p>Title: Demo3</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/9
 */
public class Demo3 {
    public static void main(String[] args) {
        Country china = new Country("China");

        Province zhejiang = new Province("浙江省");

        City hangzhou = new City("杭州",100);
        City ningbo = new City("宁波",200);

        china.add(zhejiang);
        zhejiang.add(hangzhou);
        zhejiang.add(ningbo);

        System.out.println("全国人口总数为："+china.calculate());
    }
}

interface Calculate{
    int calculate();
}

//国家
class Country implements Calculate{
    String name;
    private ArrayList<Calculate> children = new ArrayList<Calculate>();

    public Country(String name) {
        this.name = name;
    }

    public void add(Calculate c) {
        children.add(c);
    }
    public void remove(Calculate c) {
        children.remove(c);
    }
    public Calculate getChild(int i) {
        return children.get(i);
    }

    public int calculate() {
        int result = 0;
        for (Calculate obj : children) {
            result += obj.calculate();
        }
        return result;
    }
}

//省份
class Province implements Calculate{
    String name;
    private ArrayList<Calculate> children = new ArrayList<Calculate>();

    public Province(String name) {
        this.name = name;
    }

    public void add(Calculate c) {
        children.add(c);
    }
    public void remove(Calculate c) {
        children.remove(c);
    }
    public Calculate getChild(int i) {
        return children.get(i);
    }

    public int calculate() {
        int result = 0;
        for (Calculate obj : children) {
            result += obj.calculate();
        }
        return result;
    }
}

//市
class City implements Calculate{
    String name;
    private ArrayList<Calculate> children = new ArrayList<Calculate>();
    private int Count;

    public City(String name, int count) {
            this.name = name;
        Count = count;
    }
    public int calculate() {
        return Count;
    }
}
