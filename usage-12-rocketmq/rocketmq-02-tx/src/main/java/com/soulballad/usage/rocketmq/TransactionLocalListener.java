package com.soulballad.usage.rocketmq;

import org.apache.rocketmq.client.producer.LocalTransactionState;
import org.apache.rocketmq.client.producer.TransactionListener;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Soulballad
 * @date 2019/9/30 20:32
 * @email soda931vzr@163.com
 * @description
 */
public class TransactionLocalListener implements TransactionListener {

    private Map<String, Boolean> resultMap = new HashMap<>();

    @Override
    public LocalTransactionState executeLocalTransaction(Message message, Object o) {
        System.out.println("开始执行本地事务: " + o.toString());
        String orderId = o.toString();
        boolean result = Objects.hash(orderId) % 2 == 0;
        resultMap.put(orderId, result);
        return result ? LocalTransactionState.COMMIT_MESSAGE : LocalTransactionState.UNKNOW;
    }

    @Override
    public LocalTransactionState checkLocalTransaction(MessageExt messageExt) {
        String orderId = messageExt.getKeys();
        System.out.println("执行事务回调检查 orderId " + orderId);
        Boolean result = resultMap.get(orderId);
        System.out.println("数据的处理结果： " + result);
        return result ? LocalTransactionState.COMMIT_MESSAGE : LocalTransactionState.ROLLBACK_MESSAGE;
    }
}
