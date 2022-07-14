package com.soulballad.usage.redis.shard;

import redis.clients.jedis.Client;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: qingshan
 * @Date: 2019/9/24 22:43
 * @Description: 咕泡学院，只为更好的你
 */
public class ShardingTest {
    public static void main(String[] args) {
        JedisPoolConfig poolConfig = new JedisPoolConfig();

        // Redis服务器
        JedisShardInfo shardInfo1 = new JedisShardInfo("127.0.0.1", 6379);
        JedisShardInfo shardInfo2 = new JedisShardInfo("192.168.8.202", 6379);

        // 连接池
        List<JedisShardInfo> infoList = Arrays.asList(shardInfo1, shardInfo2);
        ShardedJedisPool jedisPool = new ShardedJedisPool(poolConfig, infoList);

        ShardedJedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            for (int i = 0; i < 100; i++) {
                jedis.set("k" + i, "" + i);
            }
            for (int i = 0; i < 100; i++) {
                Client client = jedis.getShard("k" + i).getClient();
                System.out.println("取到值：" + jedis.get("k" + i) + "，" + "当前key位于：" + client.getHost() + ":" + client.getPort());
            }
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }
}
