package com.soulballad.usage.sentinel.dubbo;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Soulballad
 * @date 2019/9/1 16:15
 * @email soda931vzr@163.com
 * @description
 */
@RestController
public class SentinelController {

    @Reference
    private SentinelService sentinelService;

    @GetMapping("/sayHello")
    public String sayHello() throws InterruptedException {
        RpcContext.getContext().setAttachment("dubboApplication", "sentinel-web");
        return sentinelService.sayHello("zhangsan");
    }
}
