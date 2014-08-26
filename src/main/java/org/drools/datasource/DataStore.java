package org.drools.datasource;

import java.util.Collection;

public interface DataStore extends DataSource {

    void insert(Object obj);
    void update(Object obj);
    void delete(Object obj);

    Collection<Object> getObjects();
}
