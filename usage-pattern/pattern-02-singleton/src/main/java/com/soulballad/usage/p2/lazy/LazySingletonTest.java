package com.soulballad.usage.p2.lazy;

import org.junit.Test;

/**
 * 单例的常见写法
 */
public class LazySingletonTest {

    @Test
    public void test_lazySimpleSingleton() {
        class ExecutorThread implements Runnable {
            @Override
            public void run() {
                LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + instance);
            }
        }

        Thread thread1 = new Thread(new ExecutorThread());
        Thread thread2 = new Thread(new ExecutorThread());

        thread1.start();
        thread2.start();
    }

    @Test
    public void test_lazySimpleSynchronizedSingleton() {
        class ExecutorThread implements Runnable {
            @Override
            public void run() {
                LazySimpleSynchronizedSingleton instance = LazySimpleSynchronizedSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + instance);
            }
        }

        Thread thread1 = new Thread(new ExecutorThread());
        Thread thread2 = new Thread(new ExecutorThread());

        thread1.start();
        thread2.start();
    }

    @Test
    public void test_lazyDoubleCheckSingleton() {
        class ExecutorThread implements Runnable {
            @Override
            public void run() {
                LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + instance);
            }
        }

        Thread thread1 = new Thread(new ExecutorThread());
        Thread thread2 = new Thread(new ExecutorThread());

        thread1.start();
        thread2.start();
    }

    @Test
    public void test_lazyInnerClassSingleton() {

        class ExecutorThread implements Runnable {
            @Override
            public void run() {
                LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + instance);
            }
        }

        Thread thread1 = new Thread(new ExecutorThread());
        Thread thread2 = new Thread(new ExecutorThread());

        thread1.start();
        thread2.start();
    }
}