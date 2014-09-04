package org.drools.datasource.impl;

import org.drools.datasource.PassiveDataStore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListDataStore<T> implements PassiveDataStore<T> {

    private final List<T> store = new ArrayList<T>();

    @Override
    public void insert(T obj) {
        store.add(obj);
    }

    @Override
    public void update(T obj) {
        int index = store.indexOf(obj);
        if (index < 0) {
            throw new RuntimeException(obj + " not present");
        }
        store.set(index, obj);
    }

    @Override
    public void delete(T obj) {
        store.remove(obj);
    }

    @Override
    public Collection<T> getObjects() {
        return store;
    }
}
