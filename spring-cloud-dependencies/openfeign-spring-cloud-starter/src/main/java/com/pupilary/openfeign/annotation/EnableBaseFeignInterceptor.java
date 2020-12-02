package com.pupilary.openfeign.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

import com.pupilary.openfeign.interceptor.FeignInterceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

/**
 * 开启feign拦截器传递数据给下游服务，只包含基础数据
 * 
 * @author takesi
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(FeignInterceptor.class)
public @interface EnableBaseFeignInterceptor {

}
