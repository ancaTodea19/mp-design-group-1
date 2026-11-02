package tui;


public class LoanMenu {
    // instance variables 

    /**
     * Constructor for objects of class LoanMenu
     */
    public LoanMenu() {
     
       
    }
    
    public static void start() {
        boolean running = true;
        while (running) {
            int choice = writeLoanMenu();
            if (choice == 1) {
                System.out.println(" Denne er ikke implementeret endnu!");
            }
            //TODO perhaps you need further menu items?
            else {
                running = false;
            }
        }
    }

    private static int writeLoanMenu() {
        // creates a keyboard object to read input
        TextOptions menu = new TextOptions("\n ***** Udlånsmenu *****", "Tilbage"); 
        menu.addOption("Opret lån");
        //TODO if you need more menu items they have to go here
        int choice = menu.prompt();

        return choice;
    }
}
