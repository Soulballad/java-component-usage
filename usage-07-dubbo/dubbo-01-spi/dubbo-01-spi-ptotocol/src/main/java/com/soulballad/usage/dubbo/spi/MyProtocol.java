package com.soulballad.usage.dubbo.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.Exporter;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Protocol;
import org.apache.dubbo.rpc.RpcException;

/**
 * @author Soulballad
 * @date 2019/8/18 15:53
 * @email soda931vzr@163.com
 * @description
 */
public class MyProtocol implements Protocol {
    @Override
    public int getDefaultPort() {
        return 9999;
    }

    @Override
    public <T> Exporter<T> export(Invoker<T> invoker) throws RpcException {
        return null;
    }

    @Override
    public <T> Invoker<T> refer(Class<T> aClass, URL url) throws RpcException {
        return null;
    }

    @Override
    public void destroy() {

    }
}
