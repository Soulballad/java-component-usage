package com.soulballad.usage.dubbo.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

/**
 * @author Soulballad
 * @date 2019/8/18 15:55
 * @email soda931vzr@163.com
 * @description
 */
public class App {
    public static void main(String[] args) {
//        Protocol myProtocol = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("myProtocol");
//        System.out.println(myProtocol.getDefaultPort());

        Protocol compiler = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();
        System.out.println(compiler.getClass());
    }
}
