package com.soulballad.usage.pattern.p1.general;

import java.util.ArrayList;
import java.util.List;

// 具体容器
public class ConcreteAggregate<E> implements IAggregate<E> {
    private List<E> list = new ArrayList<E>();

    @Override
    public boolean add(E element) {
        return this.list.add(element);
    }

    @Override
    public boolean remove(E element) {
        return this.list.remove(element);
    }

    @Override
    public Iterator<E> iterator() {
        return new ConcreteIterator<E>(this.list);
    }
}