package com.soulballad.usage.p2.battercake.v1;

public class BattercakeWithEggAndSausage extends BattercakeWithEgg {

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    // 加一根香肠2块钱
    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}