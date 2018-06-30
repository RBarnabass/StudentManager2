package manager;

import java.io.IOException;

import static manager.Scannering.sg;

public class AddSelected {
    private final int STUDENT_ADD = 1;
    private final int BACHELOR_ADD = 2;
    private final int STUDENT_ADD_AT_FIRST_POSITION = 3;
    private final int BACHELOR_ADD_AT_FIRST_POSITION = 4;
    private final int BACK_TO_MAIN_MENU = 5;
    private final int EXIT = 0;

    private Scannering scan = new Scannering();
    private Action action = new Action();

    public int addSelected() throws IOException {

        switch (scan.getAddAction()) {

            case STUDENT_ADD: {

                sg.addPerson(action.addStudent());
                Messeger.studentCreated();
                sg.getAllGroup();
                return 1;
            }

            case BACHELOR_ADD: {

                sg.addPerson(action.addBachelor());
                Messeger.bachelorIsCreated();
                return 1;
            }

            case STUDENT_ADD_AT_FIRST_POSITION: {

                sg.prepend(action.addStudent());
                return 1;
            }

            case BACHELOR_ADD_AT_FIRST_POSITION: {

                sg.prepend(action.addBachelor());
                return 1;
            }

            case BACK_TO_MAIN_MENU: {
                return 1;
            }

            case EXIT: {
                Messeger.parting();
            }
        }
        return 0;
    }
}
