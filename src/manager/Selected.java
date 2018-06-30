package manager;

import java.io.IOException;

import static manager.Scannering.sg;

public class Selected {

    private final int LIST_OF_PERSONS = 1;
    private final int ADD_PERSON = 2;
    private final int GET_PERSON = 3;
    private final int REMOVE_PERSON = 4;
    private final int EXIT = 0;

    private Scannering scan = new Scannering();                             // Check maybe delete
    private AddSelected add = new AddSelected();
    private GetSelected get = new GetSelected();
    private RemoveSelected rem = new RemoveSelected();

    public int selected() throws IOException {

        switch (scan.getAction()) {

            case LIST_OF_PERSONS: {                                        // Must be reformed

                sg.getAllGroup();
                return 1;
            }

            case ADD_PERSON: {
                Messeger.addMenu();
                int k = add.addSelected();
                if (k == 0) {
                    return 0;
                }
                return 1;
            }

            case GET_PERSON: {
                Messeger.getMenu();
                int k = get.getSelected();
                if (k == 0) {
                    return 0;
                }
                return 1;
            }

            case REMOVE_PERSON: {
                Messeger.removeMenu();
                int k = rem.removeSelected();
                if (k == 0) {
                    return 0;
                }
                return 1;
            }

            case EXIT: {
                Messeger.parting();
            }
        }
        return 0;
    }
}
