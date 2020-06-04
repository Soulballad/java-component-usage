package com.soulballad.usage.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AsmOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsmOrderServiceApplication.class, args);
    }
}