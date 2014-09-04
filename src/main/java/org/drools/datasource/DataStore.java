package org.drools.datasource;

import java.util.Collection;

public interface DataStore<T> extends DataSource<T> {

    void insert(T obj);
    void update(T obj);
    void delete(T obj);

    Collection<T> getObjects();
}
