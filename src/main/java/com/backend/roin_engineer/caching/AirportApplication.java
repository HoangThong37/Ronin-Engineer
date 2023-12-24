package com.backend.roin_engineer.caching;

import com.google.common.cache.Cache;

import java.util.concurrent.TimeUnit;

public class AirportApplication {
    public static void main(String[] args) throws InterruptedException {

        Cache<String, AirPortDto> cache = CustomCacheManager.createCache(10, 1000L);
        AirportSerive airportSerive = new AirportSerive(cache);

        System.out.println("Get 1 : " + airportSerive.getByCode("name1"));

        TimeUnit.SECONDS.sleep(10);
        System.out.println("Continue get 1 : " + airportSerive.getByCode("name1"));

        TimeUnit.SECONDS.sleep(3);
        System.out.println("Continue get 1 : " + airportSerive.getByCode("name1"));
    }
}
