package com.pupilary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author takesi
 * @date 2020-11-12
 */
@EnableFeignClients
@SpringBootApplication
public class ProviderMdcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderMdcApplication.class, args);
    }

}
