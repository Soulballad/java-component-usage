package com.soulballad.usage.sentinel;

import com.google.common.util.concurrent.RateLimiter;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * @author Soulballad
 * @date 2019/8/29 20:06
 * @email soda931vzr@163.com
 * @description
 */
public class RateLimiterDemo {

    static RateLimiter rateLimiter = RateLimiter.create(5);

    private static void getAcquire(int index) {
        if (rateLimiter.tryAcquire()) {
            System.out.println(index + "允许进行访问！");
        }else{
            System.out.println(index + "被限流了！");
        }
    }

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(1);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            final int index = i;
            new Thread(()->{
                try {
                    latch.await();
                    Thread.sleep(random.nextInt(1000));
                    getAcquire(index);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        latch.countDown();
    }
}
