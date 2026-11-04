package tui;

import controller.LPController;
import controller.PersonController;
import model.LP;
import model.LPcopy;
import model.Person;

public class LoanMenu {
    // instance variables 

	private PersonController personController;
	private LPController lpController;
	

    /**
     * Constructor for objects of class LoanMenu
     */
    public LoanMenu() {
    	personController = new PersonController();
    	lpController = new LPController();
    	
       
    }
    
    public void start() {
        boolean running = true;
        while (running) {
            int choice = writeLoanMenu();
            if (choice == 1) {
            	findPerson();
            	findLP();
            }
            else if (choice == 2) {
                createPerson();
            }
            //TODO perhaps you need further menu items?
            else {
                running = false;
            }
        }
    }
    

	// Opret lån
	
	private void findPerson() {
		System.out.println("Søg efter personen, som skal låne");
		String phoneNo = TextInput.inputString("    tlf nr:");
		Person p = personController.findPerson(phoneNo);
		displayLoan(p);
		
		
	}

	private void findLP() {
		System.out.println();
		System.out.println("Indtast det nummer LP, som du skal udlåne:");
		int copyNo = TextInput.inputNumber("	Nummer:");
		LPcopy l = LPController.findCopis(copyNo);
		displayLP(l);
	}
	


	
	
	// Opret person
	
	private void createPerson() {
    	System.out.println();
    	System.out.println("Opret ny person i systemet");
    	String name = TextInput.inputString("    Name");
    	String email = TextInput.inputString("    Email");
    	String phone = TextInput.inputString("    Phone no.");
    	String address = TextInput.inputString("    Address");
    	String postalCode = TextInput.inputString("    Postal code");
    	String city = TextInput.inputString("    City");
    	Person p = personController.createPerson(name, email, phone, address, postalCode, city);
		displayCreate(p);
		System.out.println();
		start();
    }
	
	
	// Displays
	
	private void displayLoan(Person p) {
		System.out.println("Person, som du opretter til:");
		if (p != null) {
			System.out.println("    Name: " + p.getName());
			System.out.println("    Email: " + p.getEmail());
			System.out.println("    Phone. no.: " + p.getPhone());
		} else {
			System.out.println("    <No member to display>");
		}
	}
	
	private void displayLP(LPcopy l) {
		System.out.println("LP, som du låner ud:");
		if (l!=null) { 
			System.out.println("	Nummer: " + l.getNo());
			
		}
	}
	
    
	private void displayCreate(Person p) {
		System.out.println();
		System.out.println("Person, som du har oprettet:");
		if (p != null) {
			System.out.println("    Name: " + p.getName());
			System.out.println("    Email: " + p.getEmail());
			System.out.println("    Phone no.: " + p.getPhone());
			System.out.println("    Address: " + p.getAddress());
			System.out.println("    Postal code: " + p.getPostalCode());
			System.out.println("    City: " + p.getCity());
		} else {
			System.out.println("    <No member to display>");
			start();
		}
	}
    

    private static int writeLoanMenu() {
        // creates a keyboard object to read input
        TextOptions menu = new TextOptions("\n ***** Udlånsmenu *****", "Tilbage"); 
        menu.addOption("Opret lån");
        menu.addOption("Opret Person");
        //TODO if you need more menu items they have to go here
        int choice = menu.prompt();

        return choice;
    }
    
    
}
