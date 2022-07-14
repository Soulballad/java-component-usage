package com.soulballad.usage.rocketmq;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

/**
 * @author Soulballad
 * @date 2019/9/29 13:38
 * @email soda931vzr@163.com
 * @description
 */
public class RocketMQProducer {

    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {

        // 生产者组，简单来说就是多个发送同一类消息的生产者称之为一个生产者组
        // rocketmq支持事务消息，在发送事务消息时，如果事务消息异常（producer挂了），broker端会来回查事务的状态，
        // 这个时候会根据group名称来查找对应的producer来执行相应的回查逻辑。相当于实现了producer的高可用
        DefaultMQProducer producer = new DefaultMQProducer("test_producer_group");
        // 指定namesrv服务地址，获取broker相关信息
        producer.setNamesrvAddr("172.16.11.125:9876");
        producer.start();

        int num = 0;
        while (num < 20) {
            num++;
            // 创建一个消息实例，指定指定 topic、tag、body
            // public Message(String topic, String tags, byte[] body)
            Message message = new Message("test_topic", "TagsA", ("hello rocketMQ: " + num).getBytes());
            // 发送消息并且获取发送结果
            SendResult sendResult = producer.send(message);
            System.out.println(sendResult);
        }
    }
}
