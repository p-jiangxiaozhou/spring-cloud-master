package com.pupilary.mybatis;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

/**
 * @author takesi
 * @date 2020-10-04
 */
public class MybatisAutoConfigurer implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MybatisAutoConfigurer.class);

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
