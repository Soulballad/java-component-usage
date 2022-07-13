package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p1.general.ConcreteObserver;
import com.soulballad.usage.pattern.p1.general.ConcreteSubject;
import com.soulballad.usage.pattern.p1.general.IObserver;
import com.soulballad.usage.pattern.p1.general.ISubject;
import org.junit.Test;

public class GeneralObserverTest {

    @Test
    public void main() {
        // 被观察者
        ISubject<String> observable = new ConcreteSubject<>();
        // 观察者
        IObserver<String> observer = new ConcreteObserver<>();
        // 注册
        observable.attach(observer);
        // 通知
        observable.notify("hello");
    }
}
