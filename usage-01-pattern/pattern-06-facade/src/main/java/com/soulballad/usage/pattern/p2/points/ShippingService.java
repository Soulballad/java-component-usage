package com.soulballad.usage.pattern.p2.points;

public class ShippingService {
    public String delivery(GiftInfo giftInfo) {
        System.out.println(giftInfo.getName() + "进入物流系统");
        return "666";
    }
}
