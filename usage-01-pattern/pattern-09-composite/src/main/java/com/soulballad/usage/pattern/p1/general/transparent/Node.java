package com.soulballad.usage.pattern.p1.general.transparent;

// 抽象根节点
public abstract class Node {
    protected String name;

    public Node(String name) {
        this.name = name;
    }

    public abstract String operation();

    public boolean addChild(Node node) {
        throw new UnsupportedOperationException("addChild not supported!");
    }

    public boolean removeChild(Node node) {
        throw new UnsupportedOperationException("removeChild not supported!");
    }

    public Node getChild(int index) {
        throw new UnsupportedOperationException("getChild not supported!");
    }
}
