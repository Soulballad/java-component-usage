package com.soulballad.usage.pattern.p1.general;

public abstract class Handler {

    protected Handler nextHandler;

    public void setNextHandler(Handler successor) {
        this.nextHandler = successor;
    }

    public abstract void handleRequest(String request);
}