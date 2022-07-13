package com.soulballad.usage.pattern.p1.general;

import java.util.Random;

/**
 * 代理角色
 */
public class Delegate implements Task {
    @Override
    public void doTask() {
        System.out.println("代理执行开始....");

        Task task = null;
        if (new Random().nextBoolean()) {
            task = new ConcreteA();
        } else {
            task = new ConcreteB();
        }
        task.doTask();

        System.out.println("代理执行完毕....");
    }
}
