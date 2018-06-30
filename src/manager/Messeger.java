package manager;

public class Messeger {

    public static void greeting() {

        System.out.println();
        System.out.println(" - - - Hello mr.Manager !");
        System.out.println();
    }

    public static void mainMenu() {

        System.out.println();
        System.out.println(" - - - Choose your action, please - - - ");
        System.out.println();
        System.out.println(" >>> 1 - Show the students list\n >>> 2 - Add new person\n >>> 3 - Get persons\n >>> 4 - Remove person\n >>> 0 - Exit");
    }

    public static void parting() {
        System.out.println("Good Bye! It was pleasure to meet you !");
    }

    public static void error() {
        System.out.println(" - - Warning! Incorrect input! Please try again!");
    }

    public static void firstName() {
        System.out.println(" Enter person's first name please ");
    }

    public static void lastName() {
        System.out.println(" And enter person's last name please ");
    }

    public static void age() {
        System.out.println(" Enter person's age please ");
    }

    public static void sex() {
        System.out.println(" Enter person's sex please ");
    }

    public static void studentCreated() {
        System.out.println(" The new student is successfully created ");
    }

    public static void bachelorIsCreated() {
        System.out.println(" The new bachelor is successfully created ");
    }

    public  static void setDefault() {
        System.out.println(" Was set default value");
    }

    public static void removeName() {
        System.out.println(" For removing enter first or last name student");
    }

    public static void staff() {

        System.out.println();
        System.out.println(" = = = That's all what we have = = = ");
        System.out.println();
    }

    // ------------------- ADD -------------------------------------------------------------------------------------------

    public static void addMenu() {

        System.out.println();
        System.out.println(" - - - Choose your action, please - - - ");
        System.out.println();
        System.out.println(" >>> 1 - Add new student\n >>> 2 - Add new bachelor\n >>> 3 - Add new student to first position\n >>> 4 - Add new bachelor to first position\n >>> 5 - Back to main menu\n >>> 0 - Exit");

    }

    // ------------------- GET -------------------------------------------------------------------------------------------

    public static void getMenu() {

        System.out.println();
        System.out.println(" - - - Choose your action, please - - - ");
        System.out.println();
        System.out.println(" >>> 1 - Get all persons by first name\n >>> 2 - Get all persons by last name\n >>> 3 - Get all persons by age\n >>> 4 - Get all persons by sex\n >>> 5 - Get all persons by status (Doesn't work)\n >>> 6 - Back to main menu\n >>> 0 - Exit");

    }

    // ------------------- REMOVE -------------------------------------------------------------------------------------------

    public static void removeMenu() {

        System.out.println();
        System.out.println(" - - - Choose your action, please - - - ");
        System.out.println();
        System.out.println(" >>> 1  - Remove first person by first name\n >>> 2  - Remove first person by last name\n >>> 3  - Remove first person by age\n >>> 4  - Remove first person by sex\n >>> 5  - Remove all persons by status (Doesn't work)\n" +
                " >>> 6  - Remove all persons by first name\n >>> 7  - Remove all persons by last name\n >>> 8  - Remove all persons by age\n >>> 9  - Remove all persons by sex (Only if some persons can stay in group) \n >>> 10 - Remove by full name (Doesn't work)\n >>> 11 - Remove all (Doesn't work)\n >>> 12 - Back to main menu\n >>> 0  - Exit");

    }

}
