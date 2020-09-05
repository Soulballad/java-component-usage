package com.soulballad.usage.p2.kpi;

import org.junit.Test;

public class KpiVisitorTest {

    @Test
    public void test_kpi() {
        BusinessReport report = new BusinessReport();
        System.out.println("==========CEO看报表===============");
        report.showReport(new CEOVisitor());
        System.out.println("==========CTO看报表===============");
        report.showReport(new CTOVisitor());
    }
}
