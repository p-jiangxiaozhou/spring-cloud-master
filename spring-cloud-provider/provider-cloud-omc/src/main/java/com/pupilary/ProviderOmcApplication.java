package com.pupilary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author takesi
 * @date 2020-11-21
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderOmcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderOmcApplication.class, args);
    }

}
