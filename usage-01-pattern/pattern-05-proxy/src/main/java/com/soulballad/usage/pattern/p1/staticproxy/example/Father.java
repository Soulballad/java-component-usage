package com.soulballad.usage.pattern.p1.staticproxy.example;

public class Father implements Person {

    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    @Override
    public void findLove() {
        System.out.println("父亲物色对象");
        this.son.findLove();
        System.out.println("双方父母同意，确立关系");
    }
}