package com.soulballad.usage.pattern.p1.general.transparent;

// 叶子节点
public class Leaf extends Node {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public String operation() {
        return this.name;
    }
}