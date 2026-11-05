
package tui;

import TestData.TestData;

class Main {
	
	public static void main (String[] args) {
		
		Main mTui = new Main();
		mTui.start();
		
	}
	
	public void start() {
		 TestData.createTestdataLP();
		 boolean exit=false;
	        while (!exit) { //! means while exit not is true (that is: false)
	            int choice = writeMainMenu();
	            if(choice == 1) {
	            	System.out.println();
	                System.out.println(" Denne er endnu ikke implementeret");
	                
	            }
	            else if(choice == 2) { 
	                // TODO add code here
	            	LPMenu lpMenu = new LPMenu();
	            	lpMenu.start();
	            }
	            else if(choice == 3) {
	                LoanMenu loanMenu = new LoanMenu();
					loanMenu.start(); 
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
	        return menu.prompt();
	    }
	    
	    private static void writeEnd() {
	        System.out.println(" Tak for denne gang ");
	    }
}
