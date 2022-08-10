package com.soulballad.usage.pattern.p1.general.simple;

// 具体状态类
public class ConcreteStateB implements IState {
    @Override
    public void handle() {
        // 必要时刻需要进行状态切换
        System.out.println("StateB do action");
    }
}