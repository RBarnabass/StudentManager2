package manager;

import java.io.*;

public class NoteOutBook {

    private StudentGroup sg = new StudentGroup();
    private int i = 0;
    private String sep = File.separator;
    private String path = sep + "Users" + sep + "Роман" + sep + "IdeaProjects" + sep + "StudentManager" + sep + "Students list.txt";

    public NoteOutBook() throws IOException { }

    public void getNoteBook() {

        try {
            FileReader reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader);

            while (bufferedReader.readLine() != null) {
               // Student student = (Student) ((Object) bufferedReader.readLine());

                Object object = bufferedReader.readLine();
                Object student =  object;

               // sg.addPerson(student);
                System.out.print(" - - - " + student + " - - - " + "\n");
                i++;
            }
            reader.close();
            bufferedReader.close();
        }

        catch (IOException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }


    public int getNumber() throws IOException {

        File file = new File("Number.txt");

        if (file.exists()) {

            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            return i = Integer.valueOf(bufferedReader.readLine());
        } else {
            return i;
        }
    }

    public void readOut() {

        try {
            FileInputStream fis = new FileInputStream("Students list.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student student = (Student) ois.readObject();
            System.out.println(student.getTotalName());

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
