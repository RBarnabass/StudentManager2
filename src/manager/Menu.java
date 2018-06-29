package manager;

import java.io.IOException;

public class Menu {

    private AddSelected addSelected = new AddSelected();
    private Selected selected = new Selected();
    private GetSelected getSelected = new GetSelected();
    private RemoveSelected removeSelected = new RemoveSelected();

    static int count;
    static boolean bool = true;
    static boolean bool2 = false;
    static boolean bool3 = false;
    static boolean bool4 = false;
    static String[] list = new String[100];

    public Menu() throws IOException {
    }

    public void run() throws IOException {

        Messeger.greeting();

        while (bool) {

            Messeger.mainMenu();
            selected.selected();

            while (bool2) {

                Messeger.addMenu();
                addSelected.addSelected();
            }

            while (bool3) {

                Messeger.getMenu();
                getSelected.getSelected();
            }

            while (bool4) {

                Messeger.removeMenu();
                removeSelected.removeSelected();
            }
        }
    }
}
