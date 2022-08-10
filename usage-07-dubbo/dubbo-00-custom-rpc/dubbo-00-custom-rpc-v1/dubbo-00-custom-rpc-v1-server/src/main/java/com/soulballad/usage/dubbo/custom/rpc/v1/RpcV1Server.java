package com.soulballad.usage.dubbo.custom.rpc.v1;


public class RpcV1Server {
    public static void main(String[] args) {
        IHelloService helloService = new HelloServiceImpl();

        RpcProxyServer proxyServer = new RpcProxyServer();
        proxyServer.publisher(helloService, 8080);
    }
}
