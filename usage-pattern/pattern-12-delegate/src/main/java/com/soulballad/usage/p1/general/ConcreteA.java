package com.soulballad.usage.p1.general;

public class ConcreteA implements Task {
    @Override
    public void doTask() {
        System.out.println("执行 , 由A实现");
    }
}