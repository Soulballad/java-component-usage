package com.soulballad.usage.p1.general;

public class Client {

    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype basePrototype) {

        return basePrototype.clone();
    }
}