package manager;

import static manager.Scannering.sg;

public class GetSelected {

        private final int GET_ALL_BY_FIRSTNAME = 1;
        private final int GET_ALL_BY_LASTNAME = 2;
        private final int GET_ALL_BY_AGE = 3;
        private final int GET_ALL_BY_SEX = 4;
        private final int GET_ALL_BY_STATUS = 5;
        private final int BACK_TO_MAIN_MENU = 6;
        private final int EXIT = 0;

        private Scannering scan = new Scannering();
        private Action action = new Action();

    public int getSelected() {

            switch (scan.getGetAction()) {

                case GET_ALL_BY_FIRSTNAME: {

                    action.getAllByIndexName(sg.getAllPersonsIndexByFirstName(scan.getStudentName()));
                    return 1;
                }

                case GET_ALL_BY_LASTNAME: {

                   action.getAllByIndexName(sg.getAllPersonsIndexByLastName(scan.getStudentName()));
                    return 1;
                }

                case GET_ALL_BY_AGE: {

                    action.getAllByIndexName(sg.getAllPersonsIndexByAge(scan.getAge()));
                    return 1;
                }

                case GET_ALL_BY_SEX: {

                   action.getAllByIndexName(sg.getAllPersonsIndexBySex(scan.getStudentName()));
                    return 1;
                }

                case GET_ALL_BY_STATUS: {

                    action.getAllByIndexNameB(sg.getAllPersonsIndexByStatus(scan.getStudentName()));                     // Do not work yet
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
