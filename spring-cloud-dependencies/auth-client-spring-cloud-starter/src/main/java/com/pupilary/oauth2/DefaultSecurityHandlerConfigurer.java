package com.pupilary.oauth2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pupilary.oauth2.utils.ResponseUtil;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.security.web.AuthenticationEntryPoint;

/**
 * @author takesi
 * @date 2020-10-07
 */
public class DefaultSecurityHandlerConfigurer {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Bean
    @ConditionalOnMissingBean
    public AuthenticationEntryPoint authenticationEntryPoint() {
        return (request, response, e) -> ResponseUtil.writer(objectMapper, response, e.getMessage(),
                HttpStatus.UNAUTHORIZED.value());
    }

}
