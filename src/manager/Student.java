package manager;

import java.io.IOException;

public class Student {

    private String firstName;
    private String lastName;
    private String sex;
    private String totalName;
    private int age;

    private NoteInBook note = new NoteInBook();

    public Student(String firstName, String lastName, int age, String sex) throws IOException {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;

        totalName = this.lastName + " " + this.firstName + " " + this.age + " " + this.sex + " ";

        note.noteInBook(totalName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public String getTotalName() {
        return totalName;
    }

    public int getAge() {
        return age;
    }
}
