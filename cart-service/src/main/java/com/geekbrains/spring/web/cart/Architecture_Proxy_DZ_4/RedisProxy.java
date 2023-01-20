package com.geekbrains.spring.web.cart.Architecture_Proxy_DZ_4;

import org.springframework.data.redis.core.RedisTemplate;

public class RedisProxy implements RedisKeys {
    private  RedisKeys redisKey;
    private  RedisTemplate<String, String> redisTemplate;

    public RedisProxy(RedisKeys redisKey) {
        this.redisKey = redisKey;
        redisTemplate = new RedisTemplate<>();
    }


    @Override
    public String getString(String key) {
        if (!redisTemplate.hasKey(key)){
            redisTemplate.opsForValue().set(key, key);
        }
        return  redisTemplate.opsForValue().get(key);
    }
}
