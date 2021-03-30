package com.zhenhunfan.hello.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.*;

/**
 * <p>Title: NacosProviderController</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/2/23
 */
@RestController
public class NacosProviderController {

    /**
     * 这里不适用@Value的原因是，@Value只会在加载的时候读取一次，而不会接收到实时更新
     */
    @Autowired
    private ConfigurableApplicationContext configurableApplicationContext;

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable(value = "message") String message) {

        return "Hello Nacos " + message;
    }

    @RequestMapping(value = "/username",method = RequestMethod.GET)
    public String getUserName(){
        return configurableApplicationContext.getEnvironment().getProperty("user.name");
    }
}
