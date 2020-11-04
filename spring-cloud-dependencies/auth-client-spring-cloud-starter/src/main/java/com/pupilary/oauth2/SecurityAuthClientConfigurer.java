package com.pupilary.oauth2;

import com.pupilary.oauth2.properties.SecurityProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

/**
 * @author takesi
 * @date 2020-10-07
 */
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityAuthClientConfigurer implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(SecurityAuthClientConfigurer.class);

    /**
     * 装配BCryptPasswordEncoder用户密码的匹配
     *
     * @return PasswordEncoder
     */
    @Bean
    @ConditionalOnMissingBean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("SecurityAuthClientConfigurer: " + Arrays.toString(args));
    }
}
