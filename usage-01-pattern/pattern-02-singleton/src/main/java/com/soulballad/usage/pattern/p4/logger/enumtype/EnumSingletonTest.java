package com.soulballad.usage.pattern.p4.logger.enumtype;

public class EnumSingletonTest {

    public static void main(String[] args) {

        EnumSingletonTest singletonTest = new EnumSingletonTest();

        Thread thread1 = new Thread(singletonTest.new ExecutorThread());
        Thread thread2 = new Thread(singletonTest.new ExecutorThread());

        thread1.start();
        thread2.start();
    }

    class ExecutorThread implements Runnable {

        @Override
        public void run() {

            EnumSingleton instance = EnumSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + instance);
        }
    }
}