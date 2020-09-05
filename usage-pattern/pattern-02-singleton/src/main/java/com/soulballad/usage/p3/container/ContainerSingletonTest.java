package com.soulballad.usage.p3.container;

import com.soulballad.usage.p5.executor.ConcurrentExecutor;
import org.junit.Test;

public class ContainerSingletonTest {

    @Test
    public void test_containerSingleton() {
        try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                @Override
                public void handle() {
                    Object instance = ContainerSingleton.getInstance("com.soulballad.usage.p3.container.TestClass");
                    System.out.println(System.currentTimeMillis() + ":" + instance);
                }
            }, 10, 6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test_containerSynchronizedSingleton() {
        try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                @Override
                public void handle() {
                    Object instance =
                            ContainerSynchronizedSingleton.getInstance("com.soulballad.usage.p3.container.TestClass");
                    System.out.println(System.currentTimeMillis() + ":" + instance);
                }
            }, 10, 6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}