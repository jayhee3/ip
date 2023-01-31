/**
 * Handles interactions with the user.
 */
public class Ui {
    private static String HELP_MESSAGE = "The available commands are: \n" +
            "1) list\n" +
            "2) bye\n" +
            "3) todo ________\n" +
            "4) deadline ______ /by ___________ (Note that the date has to be in YYYY-MM-DD format.\n" +
            "5) event ________ /from _______  /to _________\n" +
            "6) unmark ____\n" +
            "7) mark ______ \n" +
            "8) help\n";


    /**
     * Greets the user.
     */
    public void greet() {
        System.out.println("Hi, my name's Duke, how may I be of assistance today? :)");
    }

    /**
     * Responds to the user.
     * @param message The response message to be delivered to the user.
     */
    public void respond(String message) {
        String topDivider = "~~~~~~~~~~~~~~~~o~~~~~~~~~~~~~~~~\n" + "Duke's Response: \n";
        String botDivider = "\n~~~~~~~~~~~~~~~~o~~~~~~~~~~~~~~~~";
        System.out.println(topDivider + "\n" + message + botDivider);
    }

    /**
     * Displays a loading error message to the user.
     */
    public void showLoadingError() {
        System.out.println("The data from the existing file could not be loaded. A new file has been created. ");
    }

    /**
     *  Displays a command error message to the user.
     */
    public void showCommandError() {
        System.out.println("I'm sorry, your command was not valid. To see what constitutes a valid command,"
            + " please type 'help'.");
    }

    /**
     *  Displays a help message to the user.
     */
    public void showHelpMessage() {
        System.out.println(HELP_MESSAGE);
    }







}
