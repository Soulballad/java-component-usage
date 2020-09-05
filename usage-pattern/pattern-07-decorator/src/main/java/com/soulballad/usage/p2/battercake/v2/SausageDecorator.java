package com.soulballad.usage.p2.battercake.v2;

public class SausageDecorator extends BatterCakeDecorator {

    public SausageDecorator(BatterCake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}