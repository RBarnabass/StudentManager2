package manager;

import java.io.IOException;

public class AddSelected {
    private final int STUDENT_ADD = 1;
    private final int BACHELOR_ADD = 2;
    private final int STUDENT_ADD_AT_FIRST_POSITION = 3;
    private final int BACHELOR_ADD_AT_FIRST_POSITION = 4;
    private final int BACK_TO_MAIN_MENU = 5;
    private final int EXIT = 0;

    private Scannering scan = new Scannering();
    private Action action = new Action();
    private StudentGroup sg = new StudentGroup();

    public AddSelected() throws IOException {
    }

    public void addSelected() throws IOException {

        switch (scan.getAddAction()) {

            case STUDENT_ADD: {

                sg.addPerson(action.addStudent());
                Messeger.studentCreated();
                break;
            }

            case BACHELOR_ADD: {

                sg.addPerson(action.addBachelor());
                Messeger.bachelorIsCreated();
                break;
            }

            case STUDENT_ADD_AT_FIRST_POSITION: {

                sg.prepend(action.addStudent());
                break;
            }

            case BACHELOR_ADD_AT_FIRST_POSITION: {

                sg.prepend(action.addBachelor());
                break;
            }

            case BACK_TO_MAIN_MENU: {

                Menu.bool2 = false;
                break;
            }

            case EXIT: {

                Messeger.parting();
                Menu.bool2 = false;
                Menu.bool = false;
                break;
            }
        }
    }
}
