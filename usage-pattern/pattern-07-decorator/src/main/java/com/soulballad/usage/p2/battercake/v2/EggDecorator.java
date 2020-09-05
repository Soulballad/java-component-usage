package com.soulballad.usage.p2.battercake.v2;

public class EggDecorator extends BatterCakeDecorator {

    public EggDecorator(BatterCake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}