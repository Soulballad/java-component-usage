package com.soulballad.usage.kafka;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;
import org.apache.kafka.common.PartitionInfo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @author Soulballad
 * @date 2019/9/8 16:48
 * @email soda931vzr@163.com
 * @description
 */
public class MyPartition implements Partitioner {
    @Override
    public int partition(String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, Cluster cluster) {

        // 获取集群中指定topic的所有分区信息
        List<PartitionInfo> partitionInfos = cluster.partitionsForTopic(topic);
        int size = partitionInfos.size();
        if (null == key) {
            // key没有设置，随机指定分区
            Random random = new Random();
            return random.nextInt(size);
        }
        // 否则，通过hash取模计算分区
        return Math.abs(Arrays.hashCode(keyBytes) % size);
    }

    @Override
    public void close() {
    }

    @Override
    public void configure(Map<String, ?> map) {
    }
}
