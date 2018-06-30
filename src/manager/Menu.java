package manager;

import java.io.IOException;

public class Menu {

    private Selected selected = new Selected();

    public void run() throws IOException {

        Messeger.greeting();

        int k = 1;

        while (k != 0) {

            Messeger.mainMenu();
            k = selected.selected();
        }
    }
}
