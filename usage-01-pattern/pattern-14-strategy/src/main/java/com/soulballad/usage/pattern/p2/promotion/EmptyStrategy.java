package com.soulballad.usage.pattern.p2.promotion;

public class EmptyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
