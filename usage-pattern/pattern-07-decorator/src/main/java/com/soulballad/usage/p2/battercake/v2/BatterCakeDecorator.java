package com.soulballad.usage.p2.battercake.v2;

/**
 * @author Soulballad
 * @date 2019/3/23/0023 13:50
 * @email soda931vzr@163.com
 * @description
 */
public abstract class BatterCakeDecorator extends BatterCake {

    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    protected String getMsg() {
        return this.batterCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.batterCake.getPrice();
    }
}