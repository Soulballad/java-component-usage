package com.soulballad.usage.pattern.p1.general;

// 具体元素
public class ConcreteElementA implements IElement {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return this.getClass().getSimpleName();
    }

}