package com.soulballad.usage.pattern.p1.general;

//抽象观察者
public interface IObserver<E> {
    void update(E event);
}