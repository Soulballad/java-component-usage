package com.soulballad.usage.pattern.p1.general;

public class ConcreteB implements Task {
    @Override
    public void doTask() {
        System.out.println("执行 , 由B实现");
    }
}