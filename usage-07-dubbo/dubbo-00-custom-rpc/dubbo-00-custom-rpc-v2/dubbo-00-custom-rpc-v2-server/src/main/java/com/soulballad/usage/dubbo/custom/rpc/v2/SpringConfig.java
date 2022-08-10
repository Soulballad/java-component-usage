package com.soulballad.usage.dubbo.custom.rpc.v2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.gupaoedu.vip")
public class SpringConfig {

    @Bean(name = "gpRpcServer")
    public GpRpcServer gpRpcServer() {
        return new GpRpcServer(8080);
    }
}
