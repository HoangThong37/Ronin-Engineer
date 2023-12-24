package com.backend.roin_engineer.caching;

import com.google.common.cache.Cache;
import lombok.RequiredArgsConstructor;

import java.util.Map;
import java.util.Objects;

@RequiredArgsConstructor
public class AirportSerive {

    private static final Map<String, AirPortDto> AIR_PORT_DTO_MAP = Map.of(
            "name1", new AirPortDto("name1", "value1"),
            "name2",  new AirPortDto("name2", "value2"),
            "name3",  new AirPortDto("name3", "value3"),
            "name4",  new AirPortDto("name4", "value4"),
            "name5",  new AirPortDto("name5", "value5")
    );

    private final Cache<String, AirPortDto> airPortCacheManager;

    public AirPortDto getByCode(final String code) {
        AirPortDto airPortModel = airPortCacheManager.getIfPresent(code); // get value nếu tồn tại
        if (airPortModel != null) {
            System.out.printf("Đã tìm thấy airport %s in cache", code);
            return airPortModel;
        }

        airPortModel = AIR_PORT_DTO_MAP.get(code);
        System.out.printf("-> Lấy ra airport %s trong database %n", code);
        this.airPortCacheManager.put(code, airPortModel);

        return airPortModel;
    }
}
