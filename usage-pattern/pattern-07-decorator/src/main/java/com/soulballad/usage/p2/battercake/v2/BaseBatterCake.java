package com.soulballad.usage.p2.battercake.v2;

/**
 * @author Soulballad
 * @date 2019/3/23/0023 13:40
 * @email soda931vzr@163.com
 * @description
 */
public class BaseBatterCake extends BatterCake {

    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}