package com.soulballad.usage.dubbo.springboot;

/**
 * @author Soulballad
 * @date 2019/8/18 11:39
 * @email soda931vzr@163.com
 * @description
 */
public class MockSayHelloService implements SayHelloService {
    @Override
    public String sayHello() {
        return "Sorry, 服务端发生异常，被降级啦！";
    }
}
