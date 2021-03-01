package com.zhenhunfan.design.pattern.principle._03_inversion;

/**
 * <p>Title: Demo3</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/2/27
 */
public class Demo3 {
}

//-----------------------------------------------------------------------------------

////方式1:通过接口传递实现依赖
////开关的接口
//interface TOpenAndClose {
//    public void open(ITV tv); //抽象方法，接收接口
//}
//
//interface ITV { //ITV接口
//    public void play();
//}
//


////实现接口
//class OpenAndClose implements TOpenAndClose {
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

//-----------------------------------------------------------------------------------

//方式2:通过构造方法依赖传递
//interface IOpenAndClose {
//    public void open(); //抽象方法
//}
//
//interface ITV { //ITV接口
//    public void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//    public ITV tv; //成员
//
//    public OpenAndClose(ITV tv) { //构造器
//        this.tv = tv;
//    }
//
//    public void open() {
//        this.tv.play();
//    }
//}

//-----------------------------------------------------------------------------------
//方式3 ,通过setter方法传递
//interface IOpenAndClose {
//    public void open(); // 抽象方法
//    public void setTv(ITV tv);
//}
//interface ITV { // ITV接口
//    public void play();
//}
//class OpenAndClose implements IOpenAndClose {
//    private ITV tv;
//    public void setTv(ITV tv) {
//        this.tv = tv;
//    }
//    public void open() {
//        this.tv.play();
//    }
//}