package com.soulballad.usage.p1.general;

//具体策略类 ConcreteStrategy
public class ConcreteStrategyA implements IStrategy {
    @Override
    public void algorithm() {
        System.out.println("Strategy A");
    }
}