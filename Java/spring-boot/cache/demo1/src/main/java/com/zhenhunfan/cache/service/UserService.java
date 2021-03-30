package com.zhenhunfan.cache.service;

import com.zhenhunfan.cache.bean.User;
import com.zhenhunfan.cache.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * CacheManagers管理多个Cache，
     * @Cacheable 的几个属性
     *      cacheNames/value :指定缓存名称
     *      key: 指定key值，默认用的是参数值
     *      condition:指定付合条件的情况下才缓存
     *      unless:指定付合条件的情况下不缓存，可以使用结果（返回值）
     *      sync:是否使用异步缓存
     */
    @Cacheable(cacheNames = "users")
    public User getUserById(Integer id){
        System.out.println("UserService.getUserById执行了");
        return userMapper.getUser(id);
    }
}
