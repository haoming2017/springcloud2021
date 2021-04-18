package com.ai.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProviderPaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderPaymentMain8002.class, args);
    }

}
