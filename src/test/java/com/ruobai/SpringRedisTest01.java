package com.ruobai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class SpringRedisTest01 {
    @Autowired
    private RedisTemplate redisTemplate;

}
