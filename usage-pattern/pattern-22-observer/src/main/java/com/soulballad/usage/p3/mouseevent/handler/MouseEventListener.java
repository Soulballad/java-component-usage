package com.soulballad.usage.p3.mouseevent.handler;

import com.soulballad.usage.p3.mouseevent.core.Event;
import com.soulballad.usage.p3.mouseevent.core.EventListener;

/**
 * 观察者
 */
public class MouseEventListener implements EventListener {

    public void onClick(Event e) {
        System.out.println("==========触发鼠标单击事件========\n" + e);
    }

    public void onMove(Event e) {

        System.out.println("==========触发鼠标移动事件========\n" + e);
    }
}
