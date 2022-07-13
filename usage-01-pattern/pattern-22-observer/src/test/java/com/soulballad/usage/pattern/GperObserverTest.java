package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.gper.GPer;
import com.soulballad.usage.pattern.p2.gper.Question;
import com.soulballad.usage.pattern.p2.gper.Teacher;
import org.junit.Test;

public class GperObserverTest {

    @Test
    public void test_gper() {
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher jerry = new Teacher("Jerry");

        gper.addObserver(tom);
        gper.addObserver(jerry);

        //用户行为
        Question question = new Question();
        question.setUserName("张三");
        question.setContent("观察者模式适用于哪些场景？");

        gper.publishQuestion(question);
    }
}
