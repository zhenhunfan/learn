package com.zhenhunfan.hello.spring.cloud.alibaba.nacos.consumer.feign.service;

import com.zhenhunfan.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback.NacosProviderServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>Title: NacosProviderService</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/15
 */
@FeignClient(value = "nacos-provider",fallback = NacosProviderServiceFallback.class)
public interface NacosProviderService {
    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable(value = "message") String message);
}
