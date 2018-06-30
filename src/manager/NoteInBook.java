package manager;

import java.io.*;

public class NoteInBook {

    public  void noteInBook(Student student) {

        File myFile = new File("Students list.txt");

        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer.println(student);
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void noteNumber(int num) {

        File myNumber = new File("Number.txt");

        try {
            FileWriter writer = new FileWriter(myNumber);
            String tmp = String.valueOf(num);
            writer.write(tmp);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clear() {
        File myNumber = new File("Students list.txt");

        try {
            FileWriter writer = new FileWriter(myNumber);
            String tmp = "";
            writer.write(tmp);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeObject(Student student) {

        try {
            FileOutputStream fos = new FileOutputStream("Students list.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.defaultWriteObject();
            oos.writeObject(student);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
