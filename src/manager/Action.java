package manager;

import java.io.IOException;

import static manager.Scannering.sg;

public class Action {

    private Scannering sc = new Scannering();

    public Student addStudent() {

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

    public Student addBachelor() throws IOException {

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

            Student student = sg.getPerson(index[i]);
            System.out.println(student.getTotalName());
        }
    }

    public void getAllByIndexNameB(int[] index) {

        for (int i = 0; i < index.length; i++) {

            Bachelor bachelor = (Bachelor) sg.getPerson(index[i]);
            System.out.println(bachelor.getTotalName());
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
    }

    public void removeAllByIndexAge(int age) {

        int[] tmp = sg.getAllPersonsIndexByAge(age);

        for (int i = 0; i < tmp.length; i++) {

            sg.remove(sg.getPersonIndexByAge(age));
        }
    }

    public void removeAllByIndexSex(String name) {

        int[] tmp = sg.getAllPersonsIndexBySex(name);

        for (int i = 0; i < tmp.length; i++) {

            sg.remove(sg.getPersonIndexBySex(name));
        }
    }

}
