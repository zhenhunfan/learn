package com.zhenhunfan.design.pattern._02_factory.jdk;

import java.util.Calendar;

/**
 * <p>Title: Demo</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/3
 */
public class Demo {
    public static void main(String[] args) {
        //这里用到了简单工厂
        Calendar cal = Calendar.getInstance();
        //注意月份下标从0开始，所以取月份要+1
        System.out.println("年：" + cal.get(Calendar.YEAR));
        System.out.println("月：" + (cal.get(Calendar.MONTH) + 1));
        System.out.println("日：" + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("时：" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分：" + cal.get(Calendar.MINUTE));
        System.out.println("秒：" + cal.get(Calendar.SECOND));
    }
}
