package com.soulballad.usage.p1.general;

// 抽象元素
public interface IElement {
    void accept(IVisitor visitor);
}