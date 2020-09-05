package com.soulballad.usage.p1.general;

import java.util.List;

public class ConcretePrototypeA implements Prototype {

    private int id;
    private String name;
    private List hobbies;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Prototype clone() {

        ConcretePrototypeA prototypeA = new ConcretePrototypeA();

        prototypeA.setId(this.id);
        prototypeA.setName(this.name);
        prototypeA.setHobbies(this.hobbies);

        return prototypeA;
    }
}