package com.soulballad.usage.p2.general.transparent;

public class Test {
    public static void main(String[] args) {
        // 来一个根节点
        Component root = new Composite("root");
        // 来一个树枝节点
        Component branchA = new Composite("---branchA");
        Component branchB = new Composite("------branchB");
        // 来一个叶子节点
        Component leafA = new Leaf("------leafA");
        Component leafB = new Leaf("---------leafB");
        Component leafC = new Leaf("---leafC");

        root.addChild(branchA);
        root.addChild(leafC);
        branchA.addChild(leafA);
        branchA.addChild(branchB);
        branchB.addChild(leafB);

        String result = root.operation();
        System.out.println(result);

    }
}
