package observer_pattern.observers;

import observer_pattern.Mode;

public class Footer implements Observer {
    @Override
    public void update(Mode theme) {
        System.out.println("Applying " + theme.name() + " theme to footer");
    }
}
