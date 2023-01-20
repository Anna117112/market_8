package com.geekbrains.spring.web.cart.Architecture_Proxy_DZ_4;

public interface RedisKeys {


    default String getString(String key){
        return key;
    }

}
