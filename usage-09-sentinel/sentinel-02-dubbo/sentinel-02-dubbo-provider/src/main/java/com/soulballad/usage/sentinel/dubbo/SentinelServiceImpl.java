package com.soulballad.usage.sentinel.dubbo;

import org.apache.dubbo.config.annotation.Service;

/**
 * @author Soulballad
 * @date 2019/9/1 15:56
 * @email soda931vzr@163.com
 * @description
 */
@Service
public class SentinelServiceImpl implements SentinelService {
    @Override
    public String sayHello(String msg) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello " + msg;
    }
}
