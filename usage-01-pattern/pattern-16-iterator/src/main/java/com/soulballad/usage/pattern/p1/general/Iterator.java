package com.soulballad.usage.pattern.p1.general;

// 抽象迭代器
public interface Iterator<E> {

    E next();

    boolean hasNext();
}