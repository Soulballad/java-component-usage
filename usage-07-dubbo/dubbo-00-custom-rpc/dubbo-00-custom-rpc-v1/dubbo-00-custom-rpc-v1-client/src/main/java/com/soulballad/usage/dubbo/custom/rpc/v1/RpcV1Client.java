package com.soulballad.usage.dubbo.custom.rpc.v1;


public class RpcV1Client {
    public static void main(String[] args) {
        RpcProxyClient rpcProxyClient = new RpcProxyClient();

        IHelloService iHelloService = rpcProxyClient.clientProxy
                (IHelloService.class, "localhost", 8080);

        String result = iHelloService.sayHello("Mic");
        System.out.println(result);
    }
}
