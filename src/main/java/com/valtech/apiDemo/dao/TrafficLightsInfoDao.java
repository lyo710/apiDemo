package com.valtech.apiDemo.dao;

import com.valtech.apiDemo.dto.TrafficLightsInfoDTO;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
@CacheConfig(cacheNames = "trafficLightsInfoCache")
public class TrafficLightsInfoDao {

    @CachePut(value = "trafficLightsInfoCache", key="#trafficLightsInfoDTO.regionId.concat('-').concat(#trafficLightsInfoDTO.intersectionId)")
    public TrafficLightsInfoDTO save(TrafficLightsInfoDTO trafficLightsInfoDTO) {
        return trafficLightsInfoDTO;
    }

    @Cacheable(value = "trafficLightsInfoCache", key="#p0.concat('-').concat(#p1)")
    public TrafficLightsInfoDTO get(String regionId, String intersectionId) {
        return null;
    }
}
