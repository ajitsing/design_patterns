package observer_pattern.observable;

import observer_pattern.observers.Observer;

public interface Observable {
    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyObservers();
}
