package com.soulballad.usage.pattern.p2.promotion;

public class PromotionActivity {
    private IPromotionStrategy strategy;

    public PromotionActivity(IPromotionStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.doPromotion();
    }
}
