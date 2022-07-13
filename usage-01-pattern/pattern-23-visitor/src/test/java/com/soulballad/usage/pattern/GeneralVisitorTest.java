package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p1.general.ConcreteVisitorA;
import com.soulballad.usage.pattern.p1.general.ConcreteVisitorB;
import com.soulballad.usage.pattern.p1.general.IVisitor;
import com.soulballad.usage.pattern.p1.general.ObjectStructure;
import org.junit.Test;

public class GeneralVisitorTest {

    @Test
    public void test_visitor() {
        ObjectStructure collection = new ObjectStructure();
        System.out.println("ConcreteVisitorA handle elements:");
        IVisitor visitorA = new ConcreteVisitorA();
        collection.accept(visitorA);
        System.out.println("------------------------------------");
        System.out.println("ConcreteVisitorB handle elements:");
        IVisitor visitorB = new ConcreteVisitorB();
        collection.accept(visitorB);
    }
}
