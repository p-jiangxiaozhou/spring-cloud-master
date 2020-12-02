package com.pupilary.openfeign.properties;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * RestTemplate 配置
 *
 * @author takesi
 * @date 2020-11-30
 */
@Getter
@ConfigurationProperties(prefix = "spring.rest-template")
public class RestTemplateProperties implements Serializable {

	private static final long serialVersionUID = 3491024707748890013L;
	
	/**
     * 最大链接数
     */
    private int maxTotal = 200;
    /**
     * 同路由最大并发数
     */
    private int maxPerRoute = 50;
    /**
     * 读取超时时间 ms
     */
    private int readTimeout = 35000;
    /**
     * 链接超时时间 ms
     */
    private int connectTimeout = 10000;

    public void setMaxTotal(int maxTotal) {
        this.maxTotal = maxTotal;
    }

    public void setMaxPerRoute(int maxPerRoute) {
        this.maxPerRoute = maxPerRoute;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }
}
