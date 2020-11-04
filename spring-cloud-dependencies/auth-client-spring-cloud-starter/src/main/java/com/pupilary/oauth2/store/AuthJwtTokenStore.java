package com.pupilary.oauth2.store;

import org.springframework.beans.BeanUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.bootstrap.encrypt.KeyProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.provider.token.DefaultAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.UserAuthenticationConverter;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;

import javax.annotation.Resource;
import java.security.KeyPair;
import java.util.HashMap;
import java.util.Map;

/**
 * 认证服务器使用 JWT RSA 非对称加密令牌
 *
 * @author takesi
 * @date 2020-10-07
 */
@ConditionalOnProperty(prefix = "spring.oauth2.token.store", name = "type", havingValue = "authJwt")
public class AuthJwtTokenStore {

    @Resource
    private KeyProperties keyProperties;

    /**
     * 自定义配置UserAuthenticationConverter
     */
    @Resource
    private UserAuthenticationConverter userAuthenticationConverter;

    @Bean
    public KeyProperties keyProperties() {
        return new KeyProperties();
    }

    @Bean
    public TokenStore tokenStore(JwtAccessTokenConverter converter) {
        return new JwtTokenStore(converter);
    }

    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        final JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        KeyPair keyPair = new KeyStoreKeyFactory
                (keyProperties.getKeyStore().getLocation(), keyProperties.getKeyStore().getSecret().toCharArray())
                .getKeyPair(keyProperties.getKeyStore().getAlias());
        converter.setKeyPair(keyPair);
        DefaultAccessTokenConverter tokenConverter = (DefaultAccessTokenConverter) converter.getAccessTokenConverter();
        tokenConverter.setUserTokenConverter(userAuthenticationConverter);
        return converter;
    }

    /**
     * jwt 生成token 定制化处理
     * 添加一些额外的用户信息到token里面
     *
     * @return TokenEnhancer
     */
    @Bean
    public TokenEnhancer tokenEnhancer() {
        return (accessToken, authentication) -> {
            Map<String, Object> additionalInfo = new HashMap<>(1);
            Object principal = authentication.getPrincipal();
            // TODO 缺少一个工具类将实体类转换成Map
            BeanUtils.copyProperties(principal, additionalInfo);
            ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(additionalInfo);
            return accessToken;
        };
    }

}
