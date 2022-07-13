package com.soulballad.usage.pattern.p1.general;

// 抽象元素
public interface IElement {
    void accept(IVisitor visitor);
}