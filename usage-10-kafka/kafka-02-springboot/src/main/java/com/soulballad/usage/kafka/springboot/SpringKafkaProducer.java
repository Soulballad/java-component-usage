package com.soulballad.usage.kafka.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Soulballad
 * @date 2019/9/8 16:14
 * @email soda931vzr@163.com
 * @description
 */
@Component
public class SpringKafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send() {
        kafkaTemplate.send("test-topic", "msgKey", "msgValue");
    }
}
