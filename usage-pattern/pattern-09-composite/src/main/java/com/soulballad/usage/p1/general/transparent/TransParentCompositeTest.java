package com.soulballad.usage.p1.general.transparent;

import org.junit.Test;

public class TransParentCompositeTest {

    @Test
    public void test_transparent() {
        // 来一个根节点
        Node root = new Branch("root");
        // 来一个树枝节点
        Node branchA = new Branch("---branchA");
        Node branchB = new Branch("------branchB");
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
