package com.soulballad.usage.p3.rpc;

/**
 * //RPC Remote Procedure Call 远程过程调用
 * <p>
 * 伪代码
 */
public class Registry {
    // 通过中介者缩短调用链
    // 服务治理
    public boolean register(String serviceName, IService service) {
        return true;
    }

    public IService get(String serviceName) {
        return null;
    }
}
