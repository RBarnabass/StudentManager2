package manager;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {

       StudentGroup sg = new StudentGroup();
       Scannering scan = new Scannering();

 /*       Student rb = new Student("Roman", "Berezhnov", 28, "male" );
        Student al = new Student("Adriana", "Lima", 33, "female");
        Student at = new Student("Adriana", "Tima", 35, "female");
        Student an = new Student("Adriana", "Nina", 33, "female");
        Student nb = new Student("Norman", "Berezhnov", 28, "male" );
        Student rz = new Student("Rembrant", "Zakarpatskiy", 41, "male" );

        sg.addPerson(rb);
        sg.addPerson(al);
        sg.addPerson(at);
        sg.addPerson(an);
        sg.addPerson(nb);
        sg.prepend(rz);
*/



sg.fullMass();

        sg.getAllGroup();

        int[] tmp = sg.getAllPersonsIndexByFirstName("Adriana");
        for (int d: tmp) {
            System.out.println(d);
        }







        /*
        Student stud;
        stud = (Student) sg.getPerson(1);
        System.out.println(stud.getFirstName());*/

       //sg.getAllGroup();

       /* System.out.println(sg.getPersonIndexByFirstName("Adriana"));
        System.out.println(sg.getPersonIndexByLastName("Berezhnov"));*/

       // System.out.println(sg.);

       /* int[] ee;
        ee = sg.getAllPersonsIndexByFirstName("Adriana");
        for (int d: ee) {
            System.out.println(d);
        }*/

       /* int[] ee;
        ee = sg.getAllPersonsIndexByLastName("Berezhnov");
        for (int d: ee) {
            System.out.println(d);
        }*/

       /* int[] ee;
        ee = sg.getAllPersonsIndexByAge(35);
        for (int d: ee) {
            System.out.println(d);
        }*/

       /* int[] ee;
        ee = sg.getAllPersonsIndexBySex("female");
        for (int d: ee) {
            System.out.println(d);
        }*/
    }
}
