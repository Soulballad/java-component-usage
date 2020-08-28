package com.soulballad.usage.p1.demo.safe;

public abstract class Directory {

    protected String name;

    public Directory(String name) {
        this.name = name;
    }

    public abstract void show();

}