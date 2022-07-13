package com.soulballad.usage.pattern.p2.battercake.v2;

public abstract class BatterCakeDecorator extends BatterCake {

    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    public String getMsg() {
        return this.batterCake.getMsg();
    }

    @Override
    public int getPrice() {
        return this.batterCake.getPrice();
    }
}