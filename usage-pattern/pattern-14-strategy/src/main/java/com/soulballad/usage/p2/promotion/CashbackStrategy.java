package com.soulballad.usage.p2.promotion;

/**
 * Created by Tom.
 */
public class CashbackStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现，直接打款到支付宝账号");
    }
}
