package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.points.FacadeService;
import com.soulballad.usage.pattern.p2.points.GiftInfo;
import org.junit.Test;

public class GiftInfoFacadeTest {

    @Test
    public void test_giftFacade() {

        FacadeService facadeService = new FacadeService();
        GiftInfo giftInfo = new GiftInfo("《Spring 5核心原理》");
        facadeService.exchange(giftInfo);
    }
}
