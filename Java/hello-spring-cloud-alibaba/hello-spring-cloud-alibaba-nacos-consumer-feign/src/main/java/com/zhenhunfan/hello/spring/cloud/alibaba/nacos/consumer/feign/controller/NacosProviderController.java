package com.zhenhunfan.hello.spring.cloud.alibaba.nacos.consumer.feign.controller;

import com.zhenhunfan.hello.spring.cloud.alibaba.nacos.consumer.feign.service.NacosProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: NacosProviderController</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/15
 */
@RestController
public class NacosProviderController {
    @Autowired
    private NacosProviderService nacosProviderService;

    @GetMapping(value = "/echo")
    public String echo(){
        return nacosProviderService.echo("hello feign");
    }
}
