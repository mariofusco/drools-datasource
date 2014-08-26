package org.drools.datasource;

public interface DataStream extends ReactiveDataSource {

    void send(Object obj);
}
