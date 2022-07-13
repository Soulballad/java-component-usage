package com.soulballad.usage.pattern.p2.points;

public class PaymentService {

    public boolean pay(GiftInfo giftInfo) {
        System.out.println("扣减" + giftInfo.getName() + " 积分成功");
        return true;
    }
}
