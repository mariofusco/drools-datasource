package org.drools.datasource;

import java.util.Observer;

public interface Observable {
    void addObserver(Observer o);
    void deleteObserver(Observer o);
}
