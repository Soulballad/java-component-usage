package com.soulballad.usage.dubbo.springboot;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Soulballad
 * @date 2019/8/18 10:46
 * @email soda931vzr@163.com
 * @description
 */
@RestController
public class DubboController {
    // dubbo中提供注解
//    @Reference(loadbalance = "roundrobin", cluster = "failfast", timeout = 1000, mock = "com.soulballad.usage.dubbo.springboot.MockSayHelloService")
    @Reference
    SayHelloService sayHelloService;

    @GetMapping("/sayHello")
    public String sayHello() {
        return sayHelloService.sayHello();
    }
}
