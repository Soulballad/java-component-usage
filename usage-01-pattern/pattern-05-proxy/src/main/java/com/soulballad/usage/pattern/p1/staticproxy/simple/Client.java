package com.soulballad.usage.pattern.p1.staticproxy.simple;

public class Client {

    public static void main(String[] args) {

        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}