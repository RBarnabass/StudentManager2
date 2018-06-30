package manager;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

       StudentGroup sg = new StudentGroup();
       Scannering scan = new Scannering();
       Action action = new Action();


        sg.addPerson(action.addStudent());
        Messeger.studentCreated();
        sg.getAllGroup();

        sg.addPerson(action.addStudent());
        Messeger.studentCreated();
        sg.getAllGroup();



         //sg.fullMass();
        //sg.getAllGroup();

       /* sg.writeDown();

            new NoteOutBook().getNoteBook();
*/
       // new NoteOutBook().getNoteBook();
        /*
        Student stud;
        stud = (Student) sg.getPerson(1);
        System.out.println(stud.getFirstName());*/

       //sg.getAllGroup();

    }
}
