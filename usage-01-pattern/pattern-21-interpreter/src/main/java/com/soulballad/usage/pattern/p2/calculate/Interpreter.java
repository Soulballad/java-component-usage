package com.soulballad.usage.pattern.p2.calculate;

public abstract class Interpreter implements IArithmeticInterpreter {

    protected IArithmeticInterpreter left;
    protected IArithmeticInterpreter right;

    public Interpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        this.left = left;
        this.right = right;
    }
}