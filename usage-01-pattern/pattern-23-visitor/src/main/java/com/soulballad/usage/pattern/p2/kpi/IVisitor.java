package com.soulballad.usage.pattern.p2.kpi;

public interface IVisitor {

    void visit(Engineer engineer);

    void visit(Manager manager);
}
