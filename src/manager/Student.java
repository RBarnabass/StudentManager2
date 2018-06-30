package manager;

import java.io.Serializable;

public class Student implements Serializable {

    private String firstName;
    private String lastName;
    private String sex;
    private String totalName;
    private int age;

    public Student(String firstName, String lastName, int age, String sex) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;

        totalName = this.lastName + " " + this.firstName + " " + this.age + " " + this.sex + " ";

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
