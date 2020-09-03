package com.soulballad.usage.p1.general.classadapter;

public class Adapter extends Adaptor implements Target {
    @Override
    public int request() {
        return super.specificRequest() / 10;
    }
}
