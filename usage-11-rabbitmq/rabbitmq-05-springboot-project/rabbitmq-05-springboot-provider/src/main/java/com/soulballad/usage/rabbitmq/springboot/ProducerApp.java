package com.soulballad.usage.rabbitmq.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 */
@SpringBootApplication
@MapperScan("com.soulballad.usage.rabbitmq.springboot.mapper")
public class ProducerApp {

    public static void main(String[] args) {
        SpringApplication.run(com.soulballad.usage.rabbitmq.springboot.ProducerApp.class, args);
    }
}
