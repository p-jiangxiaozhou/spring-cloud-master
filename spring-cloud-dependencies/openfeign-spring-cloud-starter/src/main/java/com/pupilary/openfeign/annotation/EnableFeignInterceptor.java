package com.pupilary.openfeign.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

import com.pupilary.openfeign.interceptor.FeignHttpInterceptor;
import com.pupilary.openfeign.interceptor.FeignInterceptor;

/**
 * 开启feign拦截器传递数据给下游服务，包含基础数据和http的相关数据
 * 
 * @author takesi
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({ FeignInterceptor.class, FeignHttpInterceptor.class })
public @interface EnableFeignInterceptor {

}
