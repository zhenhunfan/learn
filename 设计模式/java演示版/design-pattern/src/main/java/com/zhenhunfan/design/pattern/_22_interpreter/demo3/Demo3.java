package com.zhenhunfan.design.pattern._22_interpreter.demo3;

import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

/**
 * <p>Title: Demo3</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/11
 */
public class Demo3 {
    public static void main(String[] args) throws ParseException {
        JEP jep = new JEP();
        //定义要计算的数据表达式
        String 存款利息 = "本金*利率*时间";
        //给相关变量赋值
        jep.addVariable("本金", 10000);
        jep.addVariable("利率", 0.038);
        jep.addVariable("时间", 2);
        Node parse = jep.parse(存款利息);//解析表达式
        Object accrual = jep.evaluate(parse);    //计算
        System.out.println("存款利息：" + accrual);
    }
}
