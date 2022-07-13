package com.soulballad.usage.pattern;

import com.google.common.eventbus.EventBus;
import com.soulballad.usage.pattern.p4.guava.Pojo;
import com.soulballad.usage.pattern.p4.guava.PojoEvent;
import com.soulballad.usage.pattern.p4.guava.VoEvent;
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
