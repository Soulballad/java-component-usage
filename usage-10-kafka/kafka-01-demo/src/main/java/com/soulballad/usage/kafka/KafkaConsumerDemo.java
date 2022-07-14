package com.soulballad.usage.kafka;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

/**
 * @author Soulballad
 * @date 2019/9/8 15:07
 * @email soda931vzr@163.com
 * @description
 */
public class KafkaConsumerDemo extends Thread {

    KafkaConsumer<Integer, String> consumer;
    String topic; // 主题

    public KafkaConsumerDemo(String topic) {
        Properties properties = new Properties();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "172.16.11.128:9092,172.16.11.129:9092,172.16.11.130:9092");
        properties.put(ConsumerConfig.CLIENT_ID_CONFIG, "consumer-test");
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, IntegerDeserializer.class.getName());
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "test-consumer");
        properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");//设置offset自动提交
        properties.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");//自动提交间隔时间
        properties.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, "30000");
        properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");//对于当前groupid来说，消息的offset从最早的消息开始消费

        consumer = new KafkaConsumer<>(properties);
        this.topic = topic;
    }

    @Override
    public void run() {
        while (true) {
            //消费指定分区的时候，不需要再订阅
            //kafkaConsumer.subscribe(Collections.singletonList(topic));
            //消费指定的分区
            TopicPartition topicPartition = new TopicPartition(topic, 0);
            consumer.assign(Arrays.asList(topicPartition));
            ConsumerRecords<Integer, String> consumerRecords = consumer.poll(Duration.ofSeconds(1));
            consumerRecords.forEach(record -> {
                System.out.println(record.key() + "->" + record.value() + "->" + record.offset());
            });
        }
    }

    public static void main(String[] args) {
        new KafkaConsumerDemo("test-topic").start();
    }
}
