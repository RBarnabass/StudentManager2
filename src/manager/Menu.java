package manager;

import java.io.IOException;

public class Menu {

    private Selected selected = new Selected();
    private AddSelected addSelected = new AddSelected();
    private GetSelected getSelected = new GetSelected();
    private RemoveSelected removeSelected = new RemoveSelected();

    public Menu() throws IOException { }

    public void run() throws IOException {

        Messeger.greeting();

        int k = 1;

        while (k != 0) {

            Messeger.mainMenu();
            k = selected.selected();

            if (k == 2) {
                while (k != 0) {
                    Messeger.addMenu();
                    k = addSelected.addSelected();
                }
            }

            if (k == 3) {
                while (k != 0) {
                    Messeger.getMenu();
                    k = getSelected.getSelected();
                }
            }

            if (k == 4) {
                while (k != 0) {
                    Messeger.removeMenu();
                    k = removeSelected.removeSelected();
                }
            }
        }
    }
}
