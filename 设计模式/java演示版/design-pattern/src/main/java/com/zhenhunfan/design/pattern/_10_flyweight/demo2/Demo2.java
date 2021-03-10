package com.zhenhunfan.design.pattern._10_flyweight.demo2;

import java.util.HashMap;

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
        TreeFactory factory = new TreeFactory();
        Plant f01 = factory.getFlyweight("a");
        Plant f02 = factory.getFlyweight("a");
        Plant f03 = factory.getFlyweight("a");
        Plant f11 = factory.getFlyweight("b");
        Plant f12 = factory.getFlyweight("b");
        f01.planting_tree(new TreeNode(1,2));
        f02.planting_tree(new TreeNode(2,3));
        f03.planting_tree(new TreeNode(3,4));
        f11.planting_tree(new TreeNode(4,5));
        f12.planting_tree(new TreeNode(5,6));
    }
}

//非享元角色,树的坐标，外部状态
class TreeNode {
    private int x ;
    private int y ;

    public TreeNode(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

//抽象享元角色,种树接口
interface Plant {
    public void planting_tree(TreeNode treeNode);
}

//具体享元角色
class Tree implements Plant {
    //树的名字
    String name;

    public Tree(String name) {
        this.name = name;
    }

    public void planting_tree(TreeNode treeNode) {
        System.out.println(String.format("tree %s 种在了%d %d",name,treeNode.getX(),treeNode.getY()));
    }
}

//享元工厂角色，树工厂
class TreeFactory {
    private HashMap<String, Plant> flyweights = new HashMap<String, Plant>();

    public Plant getFlyweight(String key) {
        Plant flyweight = flyweights.get(key);
        if (flyweight != null) {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        } else {
            flyweight = new Tree(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}











