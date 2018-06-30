package manager;

import static manager.Scannering.sg;

public class RemoveSelected {

    private Scannering scan = new Scannering();
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

    public int removeSelected() {

        switch (scan.getRemoveAction()) {

            case REMOVE_FIRST_BY_FIRSTNAME: {

                int index = sg.getPersonIndexByFirstName(scan.getStudentName());

                if (index >= 0) {
                    sg.remove(index);
                }
                return 1;
            }

            case REMOVE_FIRST_BY_LASTNAME: {

                int index = sg.getPersonIndexByLastName(scan.getStudentName());

                if (index >= 0) {
                    sg.remove(index);
                }
                return 1;
            }

            case REMOVE_FIRST_BY_AGE: {

                int index = sg.getPersonIndexByAge(scan.getAge());

                if (index >= 0) {
                    sg.remove(index);
                }
                return 1;
            }

            case REMOVE_FIRST_BY_SEX: {

                int index = sg.getPersonIndexBySex(scan.getStudentName());

                if (index >= 0) {
                    sg.remove(index);
                }
                return 1;
            }

            case REMOVE_ALL_BY_STATUS: {

                System.out.println(" Sorry this option in progress !");                    // Not ready class to that
                return 1;
            }

            case REMOVE_ALL_BY_FIRSTNAME: {

                action.removeAllByIndexFirstName(scan.getStudentName());
                return 1;
            }

            case REMOVE_ALL_BY_LASTNAME: {

               action.removeAllByIndexLastName(scan.getStudentName());
                return 1;
            }

            case REMOVE_ALL_BY_AGE: {

                action.removeAllByIndexAge(scan.getAge());
                return 1;
            }

            case REMOVE_ALL_BY_SEX: {                                                     // Out of bounds ??

                action.removeAllByIndexSex(scan.getStudentName());
                return 1;
            }

            case REMOVE_BY_FULL_NAME: {

                System.out.println(" Sorry this option in progress !");                    // Return to this
                return 1;
            }

            case REMOVE_ALL: {

                System.out.println(" Sorry this option in progress !");                    // Return to this
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
