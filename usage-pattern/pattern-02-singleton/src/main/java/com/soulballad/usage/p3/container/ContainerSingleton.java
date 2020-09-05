package com.soulballad.usage.p3.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器式单例，利用map中key唯一来保存对象，实际上是线程不安全的
 */
public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static Map<String, Object> container = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className) {

        Object object = null;

        if (!container.containsKey(className)) {
            try {
                object = Class.forName(className).newInstance();
                container.put(className, object);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            object = container.get(className);
        }

        return object;
    }
}
