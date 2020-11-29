package com.pupilary.openfeign;

import org.springframework.context.annotation.Bean;

import feign.Logger;

/**
 * 
 * @author takesi
 *
 */
public class OpenFeignAutoConfigure {
	
	
	/**
     * Feign 日志级别
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
