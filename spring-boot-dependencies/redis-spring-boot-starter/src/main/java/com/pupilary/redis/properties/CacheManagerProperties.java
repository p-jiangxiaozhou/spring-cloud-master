package com.pupilary.redis.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;
import java.util.List;

/**
 * @author takesi
 * @date 2020-10-16
 */
@Getter
@ConfigurationProperties(prefix = "spring.redis.cache-manager")
public class CacheManagerProperties implements Serializable {

    private static final long serialVersionUID = 2919400174200010836L;

    private List<CacheConfig> configs;

    public void setConfigs(List<CacheConfig> configs) {
        this.configs = configs;
    }

    @Setter
    @Getter
    public static class CacheConfig {
        /**
         * cache key
         */
        private String key;
        /**
         * 过期时间，sec
         */
        private long second = 60;
    }
}
