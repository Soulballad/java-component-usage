package com.soulballad.usage.p2.promotion;

/**
 * Created by Tom.
 */
public class CouponStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("使用优惠券抵扣");
    }
}
