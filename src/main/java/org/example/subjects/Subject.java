package org.example.subjects;

import org.example.listeners.ListenerParent;

public interface Subject {

    void registerObserver(ListenerParent listener);

    void removeObserver(ListenerParent listener);

    public void notifyObserver();
}
