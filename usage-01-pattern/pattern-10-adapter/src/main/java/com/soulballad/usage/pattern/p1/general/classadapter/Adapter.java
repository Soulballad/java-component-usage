package com.soulballad.usage.pattern.p1.general.classadapter;

public class Adapter extends Adaptor implements Target {
    @Override
    public int request() {
        return super.specificRequest() / 10;
    }
}
