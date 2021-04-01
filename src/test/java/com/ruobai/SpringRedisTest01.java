package com.ruobai;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class SpringRedisTest01 {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    void contextLoads(){
        //String
        redisTemplate.opsForValue().set("string","hello");
        redisTemplate.opsForValue().get("string");
//        //List
//        redisTemplate.opsForList().set("list",0,"hello list");
//        //Set
//        redisTemplate.opsForSet().add("set","hello set");
//        //Zset
//        redisTemplate.opsForZSet().add("zset","set",0);
        //获取连接
        RedisConnection redisConnection = redisTemplate.getConnectionFactory().getConnection();
        redisConnection.flushDb();
        redisConnection.flushAll();
    }
}
