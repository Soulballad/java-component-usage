package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p1.general.IStrategy;

//具体策略类 ConcreteStrategy
public class ConcreteStrategyA implements IStrategy {
    @Override
    public void algorithm() {
        System.out.println("Strategy A");
    }
}