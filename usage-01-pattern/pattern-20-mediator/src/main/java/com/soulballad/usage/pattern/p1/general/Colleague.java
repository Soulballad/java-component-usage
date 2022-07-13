package com.soulballad.usage.pattern.p1.general;

// 抽象同事类
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}