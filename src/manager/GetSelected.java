package manager;

import java.io.IOException;

public class GetSelected {

        private final int GET_ALL_BY_FIRSTNAME = 1;
        private final int GET_ALL_BY_LASTNAME = 2;
        private final int GET_ALL_BY_AGE = 3;
        private final int GET_ALL_BY_SEX = 4;
        private final int GET_ALL_BY_STATUS = 5;
        private final int BACK_TO_MAIN_MENU = 6;
        private final int EXIT = 0;

        private Scannering scan = new Scannering();
        private StudentGroup studGrp = new StudentGroup();
        private Action action = new Action();

    public GetSelected() throws IOException {
    }

    public void getSelected() {

            switch (scan.getGetAction()) {

                case GET_ALL_BY_FIRSTNAME: {

                    action.getAllByIndexName(studGrp.getAllPersonsIndexByFirstName(scan.getStudentName()));
                    break;
                }

                case GET_ALL_BY_LASTNAME: {

                    action.getAllByIndexName(studGrp.getAllPersonsIndexByLastName(scan.getStudentName()));
                    break;
                }

                case GET_ALL_BY_AGE: {

                    action.getAllByIndexName(studGrp.getAllPersonsIndexByAge(scan.getAge()));
                    break;
                }

                case GET_ALL_BY_SEX: {

                    action.getAllByIndexName(studGrp.getAllPersonsIndexBySex(scan.getStudentName()));
                    break;
                }

                case GET_ALL_BY_STATUS: {

                    action.getAllByIndexName(studGrp.getAllPersonsIndexByStatus(scan.getStudentName()));                     // Do not work yet
                    break;
                }

                case BACK_TO_MAIN_MENU: {

                    Menu.bool3 = false;
                    break;
                }

                case EXIT: {

                    Messeger.parting();
                    Menu.bool3 = false;
                    Menu.bool = false;
                    break;
                }
            }
        }
}
