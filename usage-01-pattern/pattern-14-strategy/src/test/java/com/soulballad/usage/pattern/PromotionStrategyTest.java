package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.promotion.IPromotionStrategy;
import com.soulballad.usage.pattern.p2.promotion.PromotionStrategyFacory;
import org.junit.Test;

public class PromotionStrategyTest {

    @Test
    public void test_promotion() {
        String promotion = "";
//        IPromotionStrategy strategy = null;

//        PromotionActivity activity = new PromotionActivity(new GroupbuyStrategy());
//        activity.execute();
        PromotionStrategyFacory.getPromotionKeys();
        String promotionKey = "COUPON";

        IPromotionStrategy promotionStrategy = PromotionStrategyFacory.getPromotionStrategy(promotionKey);
        promotionStrategy.doPromotion();
    }
}
