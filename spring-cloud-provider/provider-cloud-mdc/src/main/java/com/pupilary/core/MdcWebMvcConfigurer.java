package com.pupilary.core;

import com.pupilary.core.properties.MdcResourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author takesi
 * @date 2020-11-18
 */
@Configuration
@EnableConfigurationProperties(MdcResourceProperties.class)
public class MdcWebMvcConfigurer implements WebMvcConfigurer {

}
