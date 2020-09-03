package com.soulballad.usage.p1.general.safe;

// 抽象根节点
public abstract class Node {
    protected String name;

    public Node(String name) {
        this.name = name;
    }

    public abstract String operation();
}