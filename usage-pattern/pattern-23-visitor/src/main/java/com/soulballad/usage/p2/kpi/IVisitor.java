package com.soulballad.usage.p2.kpi;

/**
 * Created by Tom.
 */
public interface IVisitor {

    void visit(Engineer engineer);

    void visit(Manager manager);

}
