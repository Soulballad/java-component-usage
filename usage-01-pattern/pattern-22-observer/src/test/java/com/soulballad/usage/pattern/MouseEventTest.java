package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p3.mouseevent.handler.Mouse;
import com.soulballad.usage.pattern.p3.mouseevent.handler.MouseEventListener;
import com.soulballad.usage.pattern.p3.mouseevent.handler.MouseEventType;
import org.junit.Test;

public class MouseEventTest {

    @Test
    public void test_mouseEvent() {
        MouseEventListener listener = new MouseEventListener();

        Mouse mouse = new Mouse();
        mouse.addListener(MouseEventType.ON_CLICK, listener);
        mouse.addListener(MouseEventType.ON_MOVE, listener);

        mouse.click();
        mouse.move();
    }
}
