package com.soulballad.usage.pattern.p2.promotion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PromotionStrategyFacory {

    private static final Map<String, IPromotionStrategy> PROMOTIONS = new HashMap<String, IPromotionStrategy>();

    static {
        PROMOTIONS.put(PromotionKey.COUPON, new CouponStrategy());
        PROMOTIONS.put(PromotionKey.CASHBACK, new CashbackStrategy());
        PROMOTIONS.put(PromotionKey.GROUPBUY, new GroupBuyStrategy());
    }

    private static final IPromotionStrategy EMPTY = new EmptyStrategy();

    private PromotionStrategyFacory() {
    }

    public static IPromotionStrategy getPromotionStrategy(String promotionKey) {
        IPromotionStrategy strategy = PROMOTIONS.get(promotionKey);
        return strategy == null ? EMPTY : strategy;
    }

    private interface PromotionKey {
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }

    public static Set<String> getPromotionKeys() {
        return PROMOTIONS.keySet();
    }
}