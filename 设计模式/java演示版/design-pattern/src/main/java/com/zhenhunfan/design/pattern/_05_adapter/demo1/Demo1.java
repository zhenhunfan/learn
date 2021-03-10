package com.zhenhunfan.design.pattern._05_adapter.demo1;

/**
 * <p>Title: Demo1</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/9
 */
public class Demo1 {
    /**
     * 充当客户端角色
     * @param args
     */
    public static void main(String[] args) {
        Translator translator = new Adapter(new Speaker());
        System.out.println(translator.translate());
    }
}

/**
 * 原有的类或接口
 */
class Speaker {
    public String speak() {
        return "China No.l";
    }
}

/**
 * 适配器接口
 */
interface Translator {
    String translate();
}

/**
 * 具体的适配器
 */
class Adapter implements Translator {
    private Speaker speaker;
    public Adapter(Speaker speaker) {
        this.speaker = speaker;
    }

    public String translate() {
        String result = speaker.speak();
        //...理解、手语话
        return result;
    }
}

