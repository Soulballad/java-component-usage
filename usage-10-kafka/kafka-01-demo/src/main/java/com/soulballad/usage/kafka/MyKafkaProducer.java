package com.soulballad.usage.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class MyKafkaProducer {

    public void send(String topic, String msg) throws ExecutionException, InterruptedException {
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "172.16.11.128:9092,172.16.11.129:9092,172.16.11.130:9092");
        properties.put(ProducerConfig.CLIENT_ID_CONFIG, "producer-test");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        KafkaProducer<Integer, String> producer = new KafkaProducer<>(properties);
        RecordMetadata metadata = producer.send(new ProducerRecord<>(topic, msg)).get();
        System.out.println(metadata.offset() + "->" + metadata.partition() + "->" + metadata.topic());
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new MyKafkaProducer().send("test-topic", "my first kafka message");
    }
}
