package com.soulballad.usage.p1.general.safe;

import org.junit.Test;

public class SafeCompositeTest {

    @Test
    public void test_safe() {
        // 来一个根节点
        Branch root = new Branch("root");
        // 来一个树枝节点
        Branch branchA = new Branch("---branchA");
        Branch branchB = new Branch("------branchB");
        // 来一个叶子节点
        Node leafA = new Leaf("------leafA");
        Node leafB = new Leaf("---------leafB");
        Node leafC = new Leaf("---leafC");

        root.addChild(branchA);
        root.addChild(leafC);
        branchA.addChild(leafA);
        branchA.addChild(branchB);
        branchB.addChild(leafB);

        String result = root.operation();
        System.out.println(result);
    }
}
