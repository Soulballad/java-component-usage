package com.soulballad.usage.dubbo.custom.rpc.v2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringConfig {

    @Bean(name = "rpcPRoxyClient")
    public RpcProxyClient proxyClient() {
        return new RpcProxyClient();
    }
}
