package com.soulballad.usage.p1.general.safe;

import java.util.ArrayList;
import java.util.List;

// 树节点
public class Branch extends Node {
    private List<Node> mNodes;

    public Branch(String name) {
        super(name);
        this.mNodes = new ArrayList<Node>();
    }

    @Override
    public String operation() {
        StringBuilder builder = new StringBuilder(this.name);
        for (Node node : this.mNodes) {
            builder.append("\n");
            builder.append(node.operation());
        }
        return builder.toString();
    }

    public boolean addChild(Node node) {
        return this.mNodes.add(node);
    }

    public boolean removeChild(Node node) {
        return this.mNodes.remove(node);
    }

    public Node getChild(int index) {
        return this.mNodes.get(index);
    }

}