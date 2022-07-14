package com.soulballad.usage.rabbitmq.transaction;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.soulballad.usage.rabbitmq.util.ResourceUtil;

/**
 * @Author: qingshan
 * @Date: 2018/9/21 10:52
 * @Description: 咕泡学院，只为更好的你
 * 消息生产者，测试事务模式。发送消息的效率比较低，建议使用Confirm模式
 * 参考文章：https://www.cnblogs.com/vipstone/p/9350075.html
 */
public class TransactionProducer {
    private final static String QUEUE_NAME = "ORIGIN_QUEUE";

    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setUri(ResourceUtil.getKey("rabbitmq.uri"));

        // 建立连接
        Connection conn = factory.newConnection();
        // 创建消息通道
        Channel channel = conn.createChannel();

        String msg = "Hello world, Rabbit MQ";
        // 声明队列（默认交换机AMQP default，Direct）
        // String queue, boolean durable, boolean exclusive, boolean autoDelete, Map<String, Object> arguments
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        try {
            channel.txSelect();//开启事务模式
            // String exchange, String routingKey, BasicProperties props, byte[] body
            channel.basicPublish("", QUEUE_NAME, null, (msg).getBytes());// 发送消息
            // int i =1/0;
            channel.txCommit();// 消息提交
        } catch (Exception e) {
            channel.txRollback();//消息回滚
        }

        channel.close();
        conn.close();
    }
}

