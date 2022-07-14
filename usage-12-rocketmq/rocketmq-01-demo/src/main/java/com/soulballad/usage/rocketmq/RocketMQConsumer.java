package com.soulballad.usage.rocketmq;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

/**
 * @author Soulballad
 * @date 2019/9/29 13:38
 * @email soda931vzr@163.com
 * @description
 */
public class RocketMQConsumer {

    public static void main(String[] args) throws MQClientException {
        //消费者的组名，这个和kafka是一样
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("test_consumer_group");
        //指定NameServer地址，多个地址以 ; 隔开
        consumer.setNamesrvAddr("172.16.11.125:9876");
        //设置Consumer第一次启动是从队列头部开始消费还是队列尾部开始消费
        //如果非第一次启动，那么按照上次消费的位置继续消费
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
        //订阅PushTopic下Tag为push的消息
        //*表示不过滤，可以通过tag来过滤，比如:”TagsA”
        consumer.subscribe("test_topic", "*");
        //注册消息监听回调，这里有两种监听，MessageListenerConcurrently以及MessageListenerOrderly
        //前者是普通监听，后者是顺序监听。这块在后续单独说明
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                System.out.println("receive message: " + list);
                //签收，返回消息消费状态
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

        consumer.start();
        System.out.println("consumer started...");
    }
}
