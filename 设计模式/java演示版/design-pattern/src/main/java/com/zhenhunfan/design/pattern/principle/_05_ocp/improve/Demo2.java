package com.zhenhunfan.design.pattern.principle._05_ocp.improve;

/**
 * <p>Title: Demo2</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/1
 */
public class Demo2 {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

//这是一个用于绘图的类
class GraphicEditor {
    //接收Shape对象，然后根据type,来绘制不同的图形
    public void drawShape(Shape s) {
        s.draw();
    }
}

abstract class Shape{
    int m_type;
    abstract void draw();
}
class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    void draw() {
        System.out.println("绘制矩形");
    }
}
class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    void draw() {
        System.out.println("绘制圆形");
    }
}
