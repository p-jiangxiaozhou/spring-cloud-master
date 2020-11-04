package com.pupilary.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author takesi
 * @date 2020-10-17
 */
@Configuration
public class MacWebMvcConfigurer implements WebMvcConfigurer {

    @Bean
    public TokenStore tokenStore() {
        return new InMemoryTokenStore();
    }

}
