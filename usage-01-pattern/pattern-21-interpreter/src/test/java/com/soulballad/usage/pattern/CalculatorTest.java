package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.calculate.GPCalculator;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void test_calculate() {
        System.out.println("result: " + new GPCalculator("10 + 30").calculate());
        System.out.println("result: " + new GPCalculator("10 + 30 - 20").calculate());
        System.out.println("result: " + new GPCalculator("100 * 2 + 400 * 1 + 66").calculate());
    }
}
