package org.drools.datasource.impl;

import org.drools.datasource.DataStream;

public class DataStreamImpl<T> extends AbstractObservable implements DataStream<T> {

    @Override
    public void send(T obj) {
        notifyInsert(obj);
    }
}
