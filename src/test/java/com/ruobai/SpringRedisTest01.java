package com.ruobai;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ruobai.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;


@SpringBootTest
public class SpringRedisTest01 {
    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;
    @Autowired
    private User user;
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
        redisTemplate.opsForValue().set("mykey","user");
        System.out.println(redisTemplate.opsForValue().get("mykey"));
    }
    @Test
    void test() throws JsonProcessingException {
        user.setName("ruobai");
        user.setAge(3);
        // String JsonUser = new ObjectMapper().writeValueAsString(user);
        redisTemplate.opsForValue().set("user",user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }
}
