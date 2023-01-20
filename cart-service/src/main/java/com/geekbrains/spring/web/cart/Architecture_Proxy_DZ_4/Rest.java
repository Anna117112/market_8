package com.geekbrains.spring.web.cart.Architecture_Proxy_DZ_4;

public class Rest {
    public static void main(String[] args) {

        RedisKeys redisKeys = new RedisKeys() {};

        RedisProxy proxy = new RedisProxy(redisKeys);

        for (int i = 0; i<5; i++){
            System.out.println(proxy.getString("ДЗ_4"));
        }
    }
}
