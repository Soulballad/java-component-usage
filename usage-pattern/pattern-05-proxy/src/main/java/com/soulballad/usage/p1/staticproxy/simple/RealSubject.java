package com.soulballad.usage.p1.staticproxy.simple;

public class RealSubject implements Subject {

    @Override
    public void request() {

        System.out.println("real service is called.");
    }
}