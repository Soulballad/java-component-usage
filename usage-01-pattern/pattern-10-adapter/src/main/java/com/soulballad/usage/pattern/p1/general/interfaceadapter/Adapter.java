package com.soulballad.usage.pattern.p1.general.interfaceadapter;

public abstract class Adapter implements Target {

    protected Adaptor adaptor;

    public Adapter(Adaptor adaptor) {
        this.adaptor = adaptor;
    }

    @Override
    public int request1() {
        return 0;
    }

    @Override
    public int request2() {
        return 0;
    }

    @Override
    public int request3() {
        return 0;
    }

    @Override
    public int request4() {
        return 0;
    }
}
