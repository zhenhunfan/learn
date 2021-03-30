package com.zhenhunfan.cache;

import com.zhenhunfan.cache.bean.User;
import com.zhenhunfan.cache.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class DemoApplicationTests {

    /**
     * stringRedisTemplate.opsForValue()   //String操作字符串
     * stringRedisTemplate.opsForList()    //List操作列表
     * stringRedisTemplate.opsForSet()     //Set操作集合
     * stringRedisTemplate.opsForHash()     //hash操作散列
     * stringRedisTemplate.opsForZSet()    //ZSet操作有序集合
     */
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
        stringRedisTemplate.opsForValue().append("msg","hello world");
    }

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    UserMapper userMapper;

    @Test
    void test02(){
        User user = userMapper.getUser(7702);
        redisTemplate.opsForSet().add("user_01",user);
    }
}
