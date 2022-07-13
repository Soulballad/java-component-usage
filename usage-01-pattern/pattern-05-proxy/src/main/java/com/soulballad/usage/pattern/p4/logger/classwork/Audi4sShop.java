package com.soulballad.usage.pattern.p4.logger.classwork;

public class Audi4sShop implements CarProducer {

    private AudiProducer audiProducer;

    public Audi4sShop(AudiProducer audiProducer) {
        this.audiProducer = audiProducer;
    }

    @Override
    public void saleCar() {

        introduce();
        this.audiProducer.saleCar();
        keep();
    }

    private void introduce() {
        System.out.println("介绍奥迪汽车");
    }

    private void keep() {
        System.out.println("保养奥迪汽车");
    }
}