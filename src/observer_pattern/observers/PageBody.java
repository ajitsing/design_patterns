package observer_pattern.observers;

import observer_pattern.Mode;

public class PageBody implements Observer {
    @Override
    public void update(Mode theme) {
        System.out.println("Applying " + theme.name() + " theme to body");
    }
}
