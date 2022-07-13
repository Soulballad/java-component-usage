package com.soulballad.usage.sentinel;

import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RMapCache;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.IntegerCodec;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;

/**
 * @author Soulballad
 * @date 2019/8/29 20:34
 * @email soda931vzr@163.com
 * @description
 */
@Slf4j
public class RedissonDemo {

    private final RedissonClient redisClient;
    private final String key = "msgRateLimiter:" + "test";
    private final int limiter = 10000;

    @Autowired
    public RedissonDemo(RedissonClient redisClient) {
        this.redisClient = redisClient;
    }

    //服务启动的时候，先清一下 redis，防止 count 出错
    public void reload() {
        RMapCache<String, Integer> msgRateLimit = redisClient.getMapCache(key, IntegerCodec.INSTANCE);
        if (msgRateLimit.containsKey(key)) {
            msgRateLimit.delete();
        }
    }

    //该方法可以配合 mq，结果是 true 的话就 ack，false 的话就 reject
    public boolean handleMessage() {
        //分布式场景下的限流
        //String key = "msgRateLimiter:" + MsgConstants.MsgType.APP_PUSH[0];
        RMapCache<String, Integer> msgRateLimit =
                redisClient.getMapCache(key, IntegerCodec.INSTANCE);
        Integer count;
        try {
            msgRateLimit.putIfAbsent(key, 0, 1L, TimeUnit.SECONDS);
            count = msgRateLimit.addAndGet(key, 1);
            log.info("get redis counter:{}", count);
            if (count < limiter) {
                //此处是你要执行的代码
                return true;
            }
            log.warn("超过限流:{}", count);
        } catch (Exception e) {
            log.error("err", e);
        }
        return false;
    }
}
