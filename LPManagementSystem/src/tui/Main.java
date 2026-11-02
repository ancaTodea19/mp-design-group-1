
package tui;

import java.util.Scanner;

class Main {
	
	private static LoanMenu loanMenu;
	

	
	
	public static void main (String[] args) {
		
		loanMenu = new LoanMenu();
		
		 boolean exit=false;
	        while (!exit) { //! means while exit not is true (that is: false)
	            int choice = writeMainMenu();
	            if(choice == 1) {
	            	System.out.println();
	                System.out.println(" Denne er endnu ikke implementeret");
	                
	            }
	            else if(choice == 2) { 
	                // TODO add code here
	            	System.out.println();
	                System.out.println(" Denne er endnu ikke implementeret");
	            }
	            else if(choice == 3) {
	                loanMenu.start(); 
	            }
	            else if(choice == 4) {
	                // TODO generate test data, this must not be part of final version
	            }
	            else {
	                writeEnd();
	                exit = true;
	            }//end else
	        }//end while
		
	}
	
	    private static int writeMainMenu(){
	        TextOptions menu = new TextOptions("\n ***Hovedmenu***", "Afslut programmet");
	        menu.addOption("Lånermenu");
	        menu.addOption("LP menu");
	        menu.addOption("Udlånsmenu");
	        menu.addOption("Generer test data");
	        return menu.prompt();
	    }
	    
	    private static void writeEnd() {
	        System.out.println(" Tak for denne gang ");
	    }
}
