package manager;

import java.io.IOException;

public class Action {

    private Scannering sc = new Scannering();
    private StudentGroup sg = new StudentGroup();

    public Action() throws IOException {
    }

    public void showList() {

        Messeger.staff();
        new NoteOutBook().getNoteBook();
    }

    public Object addStudent() throws IOException {

        Messeger.firstName();
        String firstName = sc.getStudentName();

        Messeger.lastName();
        String lastName = sc.getStudentName();

        Messeger.age();
        int age = sc.getAge();

        Messeger.sex();
        String sex = sc.getStudentName();

        return new Student(firstName, lastName, age, sex);
    }

    public void delete(int index) throws IOException {

        String[] tmp = new String[Menu.list.length];
        System.arraycopy(Menu.list, 0, tmp, 0, index);
        System.arraycopy(Menu.list, index + 1, tmp, index, tmp.length - index - 1);

        Menu.list = tmp;
        Menu.count = new NoteOutBook().getNumber();
        Menu.count--;

        new NoteInBook().noteNumber(Menu.count);
        new NoteInBook().clear();

        for (int i = 0; i < Menu.list.length; i++) {

            if (Menu.list[i] != null) {
                new NoteInBook().noteInBook(Menu.list[i]);
            }
        }
    }

    public Object addBachelor() throws IOException {

        Messeger.firstName();
        String firstName = sc.getStudentName();

        Messeger.lastName();
        String lastName = sc.getStudentName();

        Messeger.age();
        int age = sc.getAge();

        Messeger.sex();
        String sex = sc.getStudentName();
        return new Bachelor(firstName, lastName, age, sex);
    }

    public void getAllByIndexName(int[] index) {

        for (int i = 0; i < index.length; i++) {

            Student student = (Student) sg.getPerson(index[i]);
            System.out.println(student.getTotalName());
        }
    }

    public void removeAllByIndexFirstName(String name) {

        int[] tmp = sg.getAllPersonsIndexByFirstName(name);

        for (int i = 0; i < tmp.length; i++) {

            sg.remove(sg.getPersonIndexByFirstName(name));
        }
    }

    public void removeAllByIndexLastName(String name) {

        int[] tmp = sg.getAllPersonsIndexByLastName(name);

        for (int i = 0; i < tmp.length; i++) {

            sg.remove(sg.getPersonIndexByLastName(name));
        }
        //sg.getAllGroup();
    }

    public void removeAllByIndexAge(int age) {

        int[] tmp = sg.getAllPersonsIndexByAge(age);

        for (int i = 0; i < tmp.length; i++) {

            sg.remove(sg.getPersonIndexByAge(age));
        }
        //sg.getAllGroup();
    }

    public void removeAllByIndexSex(String name) {

        int[] tmp = sg.getAllPersonsIndexBySex(name);

        for (int i = 0; i < tmp.length; i++) {

            sg.remove(sg.getPersonIndexBySex(name));
        }
        sg.getAllGroup();
    }

  /*  public void removeAllByIndexFirstStatus(String name) {

        int[] tmp = sg.getAllPersonsIndexByStatus(name);

        for (int i = 0; i < tmp.length; i++) {

            sg.remove(sg.getPersonsIndexByStatus(name));
        }
    } */
}
