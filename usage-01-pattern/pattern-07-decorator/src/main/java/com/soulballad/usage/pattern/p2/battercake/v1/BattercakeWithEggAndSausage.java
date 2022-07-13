package com.soulballad.usage.pattern.p2.battercake.v1;

public class BattercakeWithEggAndSausage extends BattercakeWithEgg {

    @Override
    public String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    // 加一根香肠2块钱
    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}