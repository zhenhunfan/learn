package com.zhenhunfan.design.pattern.principle._05_ocp;

/**
 * <p>Title: Demo1</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/1
 */
public class Demo1 {
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
        if (s.m_type == 1)
            drawRectangle(s);
    else if (s.m_type == 2)
        drawCircle(s);
    }
    public void drawRectangle(Shape r) {
        System.out.println("矩形");
    }
    public void drawCircle(Shape r) {
        System.out.println("圆形");
    }
}

class Shape{
    int m_type;
}
class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}
class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}