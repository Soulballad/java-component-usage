package com.soulballad.usage.p2.points;

import org.junit.Test;

public class GiftInfoFacadeTest {

    @Test
    public void test_giftFacade() {

        FacadeService facadeService = new FacadeService();
        GiftInfo giftInfo = new GiftInfo("《Spring 5核心原理》");
        facadeService.exchange(giftInfo);
    }
}
