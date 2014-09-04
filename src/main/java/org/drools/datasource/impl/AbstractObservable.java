package org.drools.datasource.impl;

import org.drools.datasource.DataSourceObserver;
import org.drools.datasource.Observable;

import java.util.ArrayList;
import java.util.List;

public class AbstractObservable implements Observable {

    private final List<DataSourceObserver> observers = new ArrayList<DataSourceObserver>();

    @Override
    public synchronized void addObserver(DataSourceObserver o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(DataSourceObserver o) {
        observers.remove(o);
    }

    protected synchronized void notifyInsert(Object obj) {
        for (DataSourceObserver observer : observers) {
            observer.objectInserted(obj);
        }
    }

    protected synchronized void notifyUpdate(Object obj) {
        for (DataSourceObserver observer : observers) {
            observer.objectUpdated(obj);
        }
    }
    protected synchronized void notifyDelete(Object obj) {
        for (DataSourceObserver observer : observers) {
            observer.objectDeleted(obj);
        }
    }
}
