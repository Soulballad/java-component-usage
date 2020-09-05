package com.soulballad.usage.p1.staticproxy.simple;

public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        this.subject.request();
        after();
    }

    private void before() {

        System.out.println("called before request()");
    }

    private void after() {

        System.out.println("called after request()");
    }
}