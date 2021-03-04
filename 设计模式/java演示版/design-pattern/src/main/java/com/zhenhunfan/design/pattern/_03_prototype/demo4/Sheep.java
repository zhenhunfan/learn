package com.zhenhunfan.design.pattern._03_prototype.demo4;

/**
 * <p>Title: Sheep</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/3
 */
public class Sheep implements Cloneable {
    String name;

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    Sheep friend;

    public Sheep(String name, int age, String color, Sheep friend) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.friend = friend;
    }

    public Sheep(Sheep sheep) throws CloneNotSupportedException {
        this.name = sheep.name;
        this.age = sheep.age;
        this.color = sheep.color;
        if(sheep.friend != null)
        this.friend = (Sheep) sheep.friend.clone();
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    int age;
    String color;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Sheep(this);
    }
}
