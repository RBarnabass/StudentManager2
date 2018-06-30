package manager;

import java.io.IOException;

public class StudentGroup {

    private Student[] group = new Student[20];
    private int size = 0;
    private String[] allIndex = new String[50];
    private int[] indexPack = new int[50];
    private int k = 0;

    public StudentGroup() throws IOException {
        fullMass();
    }             // Fill up mass with start (temporary)

    public void addPerson(Student stud) {
        if (size >= group.length) {
            extendArray();
        }
       group[size++] = stud;

       /* Student student = (Student) (group[size++] = stud);
        System.out.println(student.getTotalName());*/
    }

    private void extendArray() {
        Student[] newArr = new Student[size << 1];
        System.arraycopy(group, 0, newArr, 0, group.length);
        group = newArr;
    }

    public void prepend(Student stud) {
        Student[] tmp = new Student[group.length + 1];
        System.arraycopy(group, 0, tmp, 1, group.length);
        tmp[0] = stud;
        group = tmp;
    }

    public Student getPerson(int index) {
        if (index < group.length && index >= 0) {
            return group[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void getAllGroup() {

        for (int i = 0; i < group.length; i++) {

            if (group[i] != null) {

                Student student = group[i];
                System.out.println(student.getTotalName());
            }
        }
    }                            // Fix later mass is empty with start

    public int getPersonIndexByFirstName(String name) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                Student student = group[i];
                if (student.getFirstName().equals(name)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int getPersonIndexByLastName(String name) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                Student student = group[i];
                if (student.getLastName().equals(name)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int getPersonIndexByAge(int age) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                Student student = group[i];
                if (student.getAge() == age) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int getPersonIndexBySex(String sex) {

        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                Student student = group[i];
                if (student.getSex().equals(sex)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int[] getAllPersonsIndexByFirstName(String name) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                Student student = group[i];
                if (student.getFirstName().equals(name)) {
                     allIndex[k] = String.valueOf(i);
                     k++;
                }
            }
        }
        return getCasting(allIndex);
    }

    public int[] getAllPersonsIndexByLastName(String name) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                Student student = group[i];
                if (student.getLastName().equals(name)) {
                    allIndex[k] = String.valueOf(i);
                    k++;
                }
            }
        }
        return getCasting(allIndex);
    }

    public int[] getAllPersonsIndexByAge(int age) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                Student student = group[i];
                if (student.getAge() == age) {
                    allIndex[k] = String.valueOf(i);
                    k++;
                }
            }
        }
        return getCasting(allIndex);
    }

    public int[] getAllPersonsIndexBySex(String sex) {

        for (int i = 0; i < group.length; i++) {

            if (group[i] != null) {
                Student student = group[i];

                if (student.getSex().equals(sex)) {
                    allIndex[k] = String.valueOf(i);
                    k++;
                }
            }
        }
        return getCasting(allIndex);
    }

    public int[] getAllPersonsIndexByStatus(String status) {

        for (int i = 0; i < group.length; i++)  {

            if (group[i] != null) {
                Bachelor bachelor = (Bachelor) group[i];

                if (bachelor.getTotalName().equals(status)) {
                    allIndex[k] = String.valueOf(i);
                    k++;
                }
            }
        }
        return getCasting(allIndex);
    }

    private int[] getCasting(String[] str) {
        int[] tmp = new int[k];
        int j = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] != null) {
                tmp[j] = Integer.valueOf(str[i]);
                j++;
            }
        }
        return tmp;
    }

    public void fullMass() throws IOException {

            Student rb = new Student("Roman", "Berezhnov", 28, "male");
            Student al = new Student("Adriana", "Lima", 33, "female");
            Student at = new Student("Adriana", "Tima", 35, "female");
            Student an = new Student("Adriana", "Nina", 33, "female");
            Student nb = new Student("Norman", "Berezhnov", 28, "male");
            Student rz = new Student("Rembrant", "Zakarpatskiy", 41, "male");

            addPerson(rb);
            addPerson(al);
            addPerson(at);
            addPerson(an);
            addPerson(nb);
            prepend(rz);
        }

    public void remove(int index) {

        if (index < group.length && index >= 0) {

            Student[] tmpArr = new Student[group.length - 1];
            System.arraycopy(group, 0, tmpArr, 0, index);
            System.arraycopy(group, index + 1, tmpArr, index, group.length - index - 1);
            group = tmpArr;
            System.out.println("And successfully removed");

        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    // ------------------------------------------------------------------------------------------------------------

    public void writeDown() {

        new NoteInBook().clear();

        for (int i = 0; i < group.length; i++) {

            if (group[i] != null) {
                new NoteInBook().noteInBook(group[i]);
            }
        }
    }
}
