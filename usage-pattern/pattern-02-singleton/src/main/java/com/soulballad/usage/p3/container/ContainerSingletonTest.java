package com.soulballad.usage.p3.container;

import org.junit.Test;

import com.soulballad.usage.p5.executor.ConcurrentExecutor;

/**
 * @author Soulballad
 * @date 2019/3/10/0010 15:30
 * @email soda931vzr@163.com
 * @description
 */
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