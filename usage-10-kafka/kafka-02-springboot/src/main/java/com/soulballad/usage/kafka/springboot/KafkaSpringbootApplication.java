package com.soulballad.usage.kafka.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class KafkaSpringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(KafkaSpringbootApplication.class, args);
        SpringKafkaProducer kafkaProducer = context.getBean(SpringKafkaProducer.class);

        for (int i = 0; i < 3; i++) {
            try {
                kafkaProducer.send();
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
