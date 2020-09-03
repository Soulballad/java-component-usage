package com.soulballad.usage.p2.battercake.v2;

/**
 * @author Soulballad
 * @date 2019/3/23/0023 13:53
 * @email soda931vzr@163.com
 * @description
 */
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