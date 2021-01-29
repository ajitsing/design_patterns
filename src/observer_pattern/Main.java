package observer_pattern;

import observer_pattern.observable.Theme;
import observer_pattern.observers.Footer;
import observer_pattern.observers.Header;
import observer_pattern.observers.NavBar;
import observer_pattern.observers.PageBody;

import static observer_pattern.Mode.BRIGHT;
import static observer_pattern.Mode.DARK;

public class Main {
    public static void main(String[] args) {
        Theme theme = new Theme(BRIGHT);

        Header header = new Header();
        NavBar navBar = new NavBar();
        Footer footer = new Footer();
        PageBody pageBody = new PageBody();

        theme.subscribe(header);
        theme.subscribe(footer);
        theme.subscribe(navBar);
        theme.subscribe(pageBody);

        theme.changeTheme(DARK);

        theme.unsubscribe(footer);

        theme.changeTheme(BRIGHT);
    }
}
