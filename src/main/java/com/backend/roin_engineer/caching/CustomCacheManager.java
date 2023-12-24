package com.backend.roin_engineer.caching;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.concurrent.TimeUnit;


public class CustomCacheManager {
    // libary : Guava Cache
    public static <T> Cache<String, T> createCache(int size, long expireTimeInMilliseconds) {
       return CacheBuilder.newBuilder()
                .maximumSize(size)
                .expireAfterWrite(expireTimeInMilliseconds, TimeUnit.MINUTES)
                .build();
    }
}
