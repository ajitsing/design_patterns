package observer_pattern.observable;

import observer_pattern.Mode;
import observer_pattern.observers.Observer;

import java.util.ArrayList;

public class Theme implements Observable {

    private final ArrayList<Observer> observers;
    private Mode theme;

    public Theme(Mode theme) {
        this.theme = theme;
        observers = new ArrayList<>();
    }

    public void changeTheme(Mode theme) {
        this.theme = theme;
        notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(theme);
        }
    }
}
