package com.soulballad.usage.lock;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.ExponentialBackoffRetry;

public class LockDemo {

    private static String CONNECTION_STR = "192.168.13.102:2181,192.168.13.103:2181,192.168.13.104:2181";

    public static void main(String[] args) throws Exception {
        CuratorFramework curatorFramework = CuratorFrameworkFactory.builder().
                connectString(CONNECTION_STR).sessionTimeoutMs(50000000).
                retryPolicy(new ExponentialBackoffRetry(1000, 3)).build();
        curatorFramework.start();
        final InterProcessMutex lock = new InterProcessMutex(curatorFramework, "/locks");
        lock.acquire(); //阻塞竞争锁
        // todo 执行业务逻辑
        lock.release(); //释放锁


        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "->尝试竞争锁");
                try {
                    lock.acquire(); //阻塞竞争锁

                    System.out.println(Thread.currentThread().getName() + "->成功获得了锁");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(400000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        lock.release(); //释放锁
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, "Thread-" + i).start();
        }


    }


}
