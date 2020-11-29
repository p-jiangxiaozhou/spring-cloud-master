package com.pupilary.openfeign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import feign.Logger;

/**
 * @author takesi
 */
public class OpenFeignAutoConfigure implements CommandLineRunner {


    /**
     * Feign 日志级别
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Override
    public void run(String... args) throws Exception {

    }

}
