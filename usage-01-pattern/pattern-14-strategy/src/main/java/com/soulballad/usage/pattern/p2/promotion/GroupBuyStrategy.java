package com.soulballad.usage.pattern.p2.promotion;

public class GroupBuyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("5人成团，可以优惠");
    }
}
