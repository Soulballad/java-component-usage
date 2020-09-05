package com.soulballad.usage.p2.calculate;

public class OperatorUtil {

    public static boolean isOperator(String symbol) {
        return ("+".equals(symbol) || "-".equals(symbol) || "*".equals(symbol));
    }

    public static Interpreter getInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right, String symbol) {
        if ("+".equals(symbol)) {
            return new AddInterpreter(left, right);
        } else if ("-".equals(symbol)) {
            return new SubInterpreter(left, right);
        } else if ("*".equals(symbol)) {
            return new MultiInterpreter(left, right);
        } else if ("/".equals(symbol)) {
            return new DivInterpreter(left, right);
        }
        return null;
    }
}