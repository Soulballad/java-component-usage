package com.soulballad.usage.p2.calculate;

import java.util.Stack;

public class GPCalculator {
    private final Stack<IArithmeticInterpreter> stack = new Stack<>();

    public GPCalculator(String expression) {
        this.parse(expression);
    }

    private void parse(String expression) {
        String[] elements = expression.split(" ");
        IArithmeticInterpreter leftExpr, rightExpr;

        for (int i = 0; i < elements.length; i++) {
            String operator = elements[i];
            if (OperatorUtil.isOperator(operator)) {
                leftExpr = this.stack.pop();
                rightExpr = new NumInterpreter(Integer.parseInt(elements[++i]));
                System.out.println("出栈: " + leftExpr.interpret() + " 和 " + rightExpr.interpret());
                this.stack.push(OperatorUtil.getInterpreter(leftExpr, rightExpr, operator));
                System.out.println("应用运算符: " + operator);
            } else {
                NumInterpreter numInterpreter = new NumInterpreter(Integer.parseInt(elements[i]));
                this.stack.push(numInterpreter);
                System.out.println("入栈: " + numInterpreter.interpret());
            }
        }
    }

    public int calculate() {
        return this.stack.pop().interpret();
    }
}