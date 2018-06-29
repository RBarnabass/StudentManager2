package manager;

import java.io.IOException;

public class Selected {

    private final int LIST_OF_PERSONS = 1;
    private final int ADD_PERSON = 2;
    private final int GET_PERSON = 3;
    private final int REMOVE_PERSON = 4;
    private final int EXIT = 0;

    private Scannering scan = new Scannering();
    private StudentGroup studGrp = new StudentGroup();

    public Selected() throws IOException {
    }

    public void selected() throws IOException {

        switch (scan.getAction()) {

            case LIST_OF_PERSONS: {
                studGrp.fullMass();
                studGrp.getAllGroup();
                break;
            }

            case ADD_PERSON: {

                Menu.bool2 = true;
                break;
            }

            case GET_PERSON: {

                Menu.bool3 = true;
                break;
            }

            case REMOVE_PERSON: {

                Menu.bool4 = true;
                break;
            }

            case EXIT: {
                Messeger.parting();
                Menu.bool = false;
                break;
            }
        }
    }
}
