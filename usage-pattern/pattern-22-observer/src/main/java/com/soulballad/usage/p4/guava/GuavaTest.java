package com.soulballad.usage.p4.guava;

import com.google.common.eventbus.EventBus;
import org.junit.Test;

public class GuavaTest {

    @Test
    public void test_guava() {
        EventBus eventBus = new EventBus();

        PojoEvent guavaEvent = new PojoEvent();
        VoEvent voEvent = new VoEvent();
        eventBus.register(guavaEvent);
        eventBus.register(voEvent);

        eventBus.post(new Pojo("Tom"));
    }
}
