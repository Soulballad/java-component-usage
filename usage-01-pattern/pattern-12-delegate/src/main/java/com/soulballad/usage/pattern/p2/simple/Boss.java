package com.soulballad.usage.pattern.p2.simple;

public class Boss {
    public void command(String task, Leader leader) {
        leader.doing(task);
    }
}
