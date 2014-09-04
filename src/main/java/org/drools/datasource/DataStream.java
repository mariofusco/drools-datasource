package org.drools.datasource;

public interface DataStream<T> extends ReactiveDataSource<T> {

    void send(T obj);
}
