package com.soulballad.usage.pattern.p1.general.objectadapter;

public class Adapter implements Target {
    private Adaptor adaptor;

    public Adapter(Adaptor adaptor) {
        this.adaptor = adaptor;
    }

    @Override
    public int request() {
        return adaptor.specificRequest() / 10;
    }
}
