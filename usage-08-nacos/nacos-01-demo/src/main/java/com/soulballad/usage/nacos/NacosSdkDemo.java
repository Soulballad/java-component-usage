package com.soulballad.usage.nacos;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;

import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * @author Soulballad
 * @date 2019/8/25 15:50
 * @email soda931vzr@163.com
 * @description
 */
public class NacosSdkDemo {

    public static void main(String[] args) {

        String serverAddr = "localhost:8848";
        String dataId = "example";
        String groupId = "DEFAULT_GROUP";

        Properties props = new Properties();
        props.put("serverAddr", serverAddr);

        try {
            ConfigService configService = NacosFactory.createConfigService(props);
            String content = configService.getConfig(dataId, groupId, 3000);
            System.out.println(content);
            // 添加一个监听器
            configService.addListener(dataId, groupId, new Listener() {
                @Override
                public Executor getExecutor() {
                    return null;
                }

                @Override
                public void receiveConfigInfo(String configInfo) {
                    System.out.println("configInfo: "+configInfo);
                }
            });
        } catch (NacosException e) {
            e.printStackTrace();
        }
    }
}
