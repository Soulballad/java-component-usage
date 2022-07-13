package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p1.general.ConcreteColleagueA;
import com.soulballad.usage.pattern.p1.general.ConcreteColleagueB;
import com.soulballad.usage.pattern.p1.general.ConcreteMediator;
import com.soulballad.usage.pattern.p1.general.Mediator;
import org.junit.Test;

public class ColleagueMediatorTest {

    @Test
    public void test_colleague() {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);
        colleagueA.depMethodA();
        System.out.println("-------------------------");
        colleagueB.depMethodB();
    }
}
