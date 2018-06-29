package manager;

import java.io.*;

public class NoteOutBook {

    private int i = 0;
    private String sep = File.separator;
    private String path = sep + "Users" + sep + "Роман" + sep + "IdeaProjects" + sep + "StudentManager" + sep + "Students list.txt";

    public void getNoteBook() {

        try {
            FileReader reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader);

            while ((Menu.list[i] = bufferedReader.readLine()) != null) {
                System.out.print(" - - - " + Menu.list[i] + " - - - " + "\n");
                i++;
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getNoteBookFresh() {

        try {
            FileReader reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader);

            while ((Menu.list[i] = bufferedReader.readLine()) != null) {
                i++;
            }
        }

        catch (IOException e) {
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
}
