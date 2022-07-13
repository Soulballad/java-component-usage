package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.kpi.BusinessReport;
import com.soulballad.usage.pattern.p2.kpi.CEOVisitor;
import com.soulballad.usage.pattern.p2.kpi.CTOVisitor;
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
