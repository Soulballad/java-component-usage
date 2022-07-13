package com.soulballad.usage.dubbo.springboot;

import org.apache.dubbo.config.annotation.Service;

/**
 * @author Soulballad
 * @date 2019/8/16 21:26
 * @email soda931vzr@163.com
 * @description
 */
//@Service(loadbalance = "random", timeout = 50000, cluster = "failsafe")
@Service
public class SayHelloServiceImpl implements SayHelloService {
    @Override
    public String sayHello() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello dubbo!");
        return "Hello Dubbo";
    }


}
