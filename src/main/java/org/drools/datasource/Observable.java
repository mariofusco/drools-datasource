package org.drools.datasource;

public interface Observable {
    void addObserver(DataSourceObserver o);
    void deleteObserver(DataSourceObserver o);
}
