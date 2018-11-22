package com.tangliangying.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class RedisCRUDService {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    public String hget(String key){
        ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
        String s = stringStringValueOperations.get(key);
        return s;
    }

    public void hset(String key, String value){
        ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
        stringStringValueOperations.set(key, value);
        return ;
    }
}
