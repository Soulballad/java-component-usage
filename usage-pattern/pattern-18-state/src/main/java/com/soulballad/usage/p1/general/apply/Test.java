package com.soulballad.usage.p1.general.apply;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateA());
        context.handle();
    }
}
