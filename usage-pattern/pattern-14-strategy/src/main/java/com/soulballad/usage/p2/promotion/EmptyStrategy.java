package com.soulballad.usage.p2.promotion;

/**
 * Created by Tom.
 */
public class EmptyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
