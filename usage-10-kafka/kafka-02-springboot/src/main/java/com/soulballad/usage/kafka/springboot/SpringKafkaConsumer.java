package com.soulballad.usage.kafka.springboot;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author Soulballad
 * @date 2019/9/8 16:17
 * @email soda931vzr@163.com
 * @description
 */
@Component
public class SpringKafkaConsumer {

    @KafkaListener(topics = {"test-topic"})
    public void listener(ConsumerRecord record) {
        Optional<Object> optional = Optional.ofNullable(record.value());
        if (optional.isPresent()) {
            System.err.println(optional.get());
        }
    }
}
