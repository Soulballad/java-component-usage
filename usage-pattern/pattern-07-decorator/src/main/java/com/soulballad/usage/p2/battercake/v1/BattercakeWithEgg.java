package com.soulballad.usage.p2.battercake.v1;

public class BattercakeWithEgg extends Battercake {

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    // 加一个鸡蛋加1块钱
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}