package com.zhenhunfan.design.pattern._11_proxy.demo2;

/**
 * <p>Title: Demo2</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/10
 */
public class Demo2 {
    public static void main(String[] args) {
        HouseProxy houseProxy = new HouseProxy();
        System.out.println("买房人收到报价："+houseProxy.offer());
    }
}

//出价接口，抽象主题
interface Offer{
    int offer();
}
//房子的主人
class HouseHolder implements Offer{

    public int offer() {
        return 50;
    }
}

class HouseProxy implements Offer{
    private HouseHolder houseHolder;

    public HouseProxy() {
        this.houseHolder = new HouseHolder();
    }

    public int offer() {
        System.out.println("房子房主出价是："+houseHolder.offer()+",这个我们不会告知买房人");
        System.out.println("我们告诉买房人的价格是翻一番："+houseHolder.offer()*2);
        return houseHolder.offer()*2;
    }
}
