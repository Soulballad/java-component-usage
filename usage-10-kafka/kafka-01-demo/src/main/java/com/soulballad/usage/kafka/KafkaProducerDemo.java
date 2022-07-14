package com.soulballad.usage.kafka;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * @author Soulballad
 * @date 2019/9/8 14:58
 * @email soda931vzr@163.com
 * @description
 */
public class KafkaProducerDemo extends Thread {

    KafkaProducer<Integer, String> producer;
    String topic; // 主题

    public KafkaProducerDemo(String topic) {

        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "172.16.11.128:9092,172.16.11.129:9092,172.16.11.130:9092");
        properties.put(ProducerConfig.CLIENT_ID_CONFIG, "producer-test");
        properties.put(ProducerConfig.PARTITIONER_CLASS_CONFIG, "com.gupao.kafka.demo.MyPartition");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        producer = new KafkaProducer<>(properties);
        this.topic = topic;
    }

    @Override
    public void run() {
        int num = 0;
        while (num < 50) {
            try {
                String msg = "kafka demo message " + num;
//                RecordMetadata recordMetadata = producer.send(new ProducerRecord<>(topic, msg)).get();
//                System.out.println(recordMetadata.offset() + "->" + recordMetadata.partition() + "->" + recordMetadata.topic());
                producer.send(new ProducerRecord<>(topic, msg), new Callback() {
                    @Override
                    public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                        System.out.println(recordMetadata.offset() + "->" + recordMetadata.partition() + "->" + recordMetadata.topic());
                    }
                });
                // producer.send(new ProducerRecord<>(topic, msg), (medata, e)->System.out.println(medata.offset() + "->" + medata.partition() + "->" + medata.topic()));
                TimeUnit.SECONDS.sleep(2);
                ++num;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new KafkaProducerDemo("test-topic").start();
    }
}
