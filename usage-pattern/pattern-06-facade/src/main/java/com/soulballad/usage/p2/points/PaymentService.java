package com.soulballad.usage.p2.points;

public class PaymentService {

    public boolean pay(GiftInfo giftInfo) {
        System.out.println("扣减" + giftInfo.getName() + " 积分成功");
        return true;
    }
}
