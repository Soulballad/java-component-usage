package com.soulballad.usage.rocketmq;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.TransactionMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

import java.io.UnsupportedEncodingException;
import java.util.UUID;
import java.util.concurrent.Executors;

/**
 * @author Soulballad
 * @date 2019/9/30 20:27
 * @email soda931vzr@163.com
 * @description
 */
public class TransactionProducer {

    public static void main(String[] args) throws UnsupportedEncodingException, MQClientException, InterruptedException {

        TransactionMQProducer producer = new TransactionMQProducer("tx_producer_group");
        producer.setNamesrvAddr("172.16.11.125:9876");
        producer.setExecutorService(Executors.newFixedThreadPool(10));
        producer.setTransactionListener(new TransactionLocalListener());

        producer.start();

        for (int i = 0; i < 20; i++) {
            String orderId = UUID.randomUUID().toString();
            String body = "{'operation':'doOrder','orderId':'" + orderId + "'}";
            Message message = new Message("tx_order_topic", "TagsA", orderId, body.getBytes(RemotingHelper.DEFAULT_CHARSET));
            producer.sendMessageInTransaction(message, orderId + "&" + i);
            Thread.sleep(1000);
        }
    }
}
