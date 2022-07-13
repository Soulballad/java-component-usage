package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p1.general.CarBuilder;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void test_carBuilder() {
        CarBuilder builder = new CarBuilder();
        builder.addDoor("防弹车门");
        builder.addEngine("V8发动机");
        builder.addLight("镭射强光灯");
        builder.addWheel("防弹轮胎");
        builder.addAirBag("安全气囊");
        System.err.println(builder.build());
    }
}
