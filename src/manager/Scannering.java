package manager;

import java.io.IOException;
import java.util.Scanner;



public class Scannering {
    private Scanner scan = new Scanner(System.in);

    public int getAction() {

        if (scan.hasNextInt()) {

            int tmp = scan.nextInt();

            if (tmp < 6 && tmp >= 0) {
                return tmp;
            }

        } else {
            Messeger.error();
        }

        return 0;
    }

    public String getStudentName() {

        String tmp = scan.next();

        if (tmp.length() > 20) {
            return tmp.substring(20);
        } else {
            return tmp;
        }
    }

    public int getAge() {

        if (scan.hasNextInt()) {
            int tmp = scan.nextInt();

            if (tmp > 91 || tmp < 14) {
                Messeger.setDefault();
                return 21;
            } else {
                return tmp;
            }
        }

        return 0;
    }

    public void remove() throws IOException {

        String name = scan.next();

        for (int i = 0; i < Menu.list.length; i++) {

            if (Menu.list[i] != null) {
                String[] tmp = Menu.list[i].split(" ");

                for (int j = 0; j < tmp.length; j++) {

                    boolean b = tmp[j].contentEquals(name);
                    if (b) {
                        new Action().delete(i);
                    }
                }
            }
        }
    }

    // ------------------------------ ADD --------------------------------------------------------------------------------

    public int getAddAction() {

        if (scan.hasNextInt()) {

            int tmp = scan.nextInt();

            if (tmp < 6 && tmp >= 0) {
                return tmp;
            } else {
                Messeger.error();
            }
        }
        return 0;
    }

    // ------------------------------ GET --------------------------------------------------------------------------------

    public int getGetAction() {

        if (scan.hasNextInt()) {

            int tmp = scan.nextInt();

            if (tmp < 7 && tmp >= 0) {
                return tmp;
            } else {
                Messeger.error();
            }
        }
        return 0;
    }

    // ------------------------------ REMOVE --------------------------------------------------------------------------------

    public int getRemoveAction() {

        if (scan.hasNextInt()) {

            int tmp = scan.nextInt();

            if (tmp < 13 && tmp >= 0) {
                return tmp;
            } else {
                Messeger.error();
            }
        }
        return 0;
    }

}

