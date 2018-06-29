package manager;

import java.io.IOException;

public class RemoveSelected {

    private Scannering scan = new Scannering();
    private StudentGroup studGrp = new StudentGroup();
    private Action action = new Action();

    private final int REMOVE_FIRST_BY_FIRSTNAME = 1;
    private final int REMOVE_FIRST_BY_LASTNAME = 2;
    private final int REMOVE_FIRST_BY_AGE = 3;
    private final int REMOVE_FIRST_BY_SEX = 4;
    private final int REMOVE_ALL_BY_STATUS = 5;
    private final int REMOVE_ALL_BY_FIRSTNAME = 6;
    private final int REMOVE_ALL_BY_LASTNAME = 7;
    private final int REMOVE_ALL_BY_AGE = 8;
    private final int REMOVE_ALL_BY_SEX = 9;
    private final int REMOVE_BY_FULL_NAME = 10;
    private final int REMOVE_ALL = 11;
    private final int BACK_TO_MAIN_MENU = 12;
    private final int EXIT = 0;

    public RemoveSelected() throws IOException {
    }

    public void removeSelected() {

        switch (scan.getRemoveAction()) {

            case REMOVE_FIRST_BY_FIRSTNAME: {

                int index = studGrp.getPersonIndexByFirstName(scan.getStudentName());

                if (index >= 0) {
                    studGrp.remove(index);
                }
                break;
            }

            case REMOVE_FIRST_BY_LASTNAME: {

                int index = studGrp.getPersonIndexByLastName(scan.getStudentName());

                if (index >= 0) {
                    studGrp.remove(index);
                }
                break;
            }

            case REMOVE_FIRST_BY_AGE: {

                int index = studGrp.getPersonIndexByAge(scan.getAge());

                if (index >= 0) {
                    studGrp.remove(index);
                }
                break;
            }

            case REMOVE_FIRST_BY_SEX: {

                int index = studGrp.getPersonIndexBySex(scan.getStudentName());

                if (index >= 0) {
                    studGrp.remove(index);
                }
                break;
            }

            case REMOVE_ALL_BY_STATUS: {

                System.out.println(" Sorry this option in progress !");                    // Not ready class to that
                break;
            }

            case REMOVE_ALL_BY_FIRSTNAME: {

                action.removeAllByIndexFirstName(scan.getStudentName());
                break;
            }

            case REMOVE_ALL_BY_LASTNAME: {

                action.removeAllByIndexLastName(scan.getStudentName());
                break;
            }

            case REMOVE_ALL_BY_AGE: {

                action.removeAllByIndexAge(scan.getAge());
                break;
            }

            case REMOVE_ALL_BY_SEX: {                                                     // Out of bounds ??

                System.out.println(" Sorry this option in progress !");
               // action.removeAllByIndexSex(scan.getStudentName());
                break;
            }

            case REMOVE_BY_FULL_NAME: {

                System.out.println(" Sorry this option in progress !");                    // Return to this
                break;
            }

            case REMOVE_ALL: {

                System.out.println(" Sorry this option in progress !");                    // Return to this
                break;
            }

            case BACK_TO_MAIN_MENU: {

                Menu.bool4 = false;
                break;
            }

            case EXIT: {

                Messeger.parting();
                Menu.bool4 = false;
                Menu.bool = false;
                break;
            }
        }
    }
}
