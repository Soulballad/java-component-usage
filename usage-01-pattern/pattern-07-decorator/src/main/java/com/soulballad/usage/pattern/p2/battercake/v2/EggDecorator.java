package com.soulballad.usage.pattern.p2.battercake.v2;

public class EggDecorator extends BatterCakeDecorator {

    public EggDecorator(BatterCake battercake) {
        super(battercake);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}