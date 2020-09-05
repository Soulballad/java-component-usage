package com.soulballad.usage.p2.kpi;

public interface IVisitor {

    void visit(Engineer engineer);

    void visit(Manager manager);
}
