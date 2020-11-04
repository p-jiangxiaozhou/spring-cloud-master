package com.pupilary.oauth2.store;

import com.pupilary.oauth2.properties.SecurityProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.oauth2.provider.token.TokenStore;

/**
 * @author takesi
 * @date 2020-10-16
 */
@ConditionalOnProperty(prefix = "spring.oauth2.token.store", name = "type", havingValue = "redis", matchIfMissing = true)
public class AuthRedisTokenStore {

    @Autowired
    private RedisConnectionFactory connectionFactory;

    @Autowired
    private SecurityProperties securityProperties;

    @Bean
    public TokenStore tokenStore() {
        return new CustomRedisTokenStore(connectionFactory, securityProperties);
    }

}
