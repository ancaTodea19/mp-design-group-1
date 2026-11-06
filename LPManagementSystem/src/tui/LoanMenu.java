package tui;

import TestData.TestData;
import controller.LPController;
import controller.LendController;
import controller.PersonController;
import model.LP;
import model.LPcopy;
import model.Loan;
import model.Person;

public class LoanMenu {
	// instance variables

	private PersonController personController;
	private LPController lpController;

	private Person savePerson;
	private LPcopy saveLP;

	/**
	 * Constructor for objects of class LoanMenu
	 */
	public LoanMenu() {
		personController = new PersonController();
		lpController = new LPController();
		TestData.createTestdataPerson();

	}

	public void start() {
		boolean running = true;
		while (running) {
			int choice = writeLoanMenu();
			if (choice == 1) {
				findPerson();
				findLP();
				if (savePerson != null && saveLP != null) {
					createLoan();
				} else {
					System.out.println("Lånet blev ikke oprettet. Vælg en person og en LP først.");
				}
			} else if (choice == 2) {
				createPerson();
			} else {
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
		savePerson = p;

	}

	private void findLP() {
		System.out.println();
		System.out.println("Indtast nummeret på den LP-kopi, som du skal udlåne:");
		int copyNo = TextInput.inputNumber("Nummer");
		saveLP = LPController.findCopis(copyNo);
		if (saveLP == null) {
			System.out.println("Ingen LP-kopi fundet med nummer " + copyNo + ".");
			return;
		}

		displayLP(saveLP);

	}

	private void createLoan() {
		System.out.println();
		System.out.println("indtast de sidste detaljer:");
		int loanNumber = TextInput.inputNumber("    Lånenummer");
		String borrowDate = TextInput.inputString("    Udlånsdato");
		String returnDate = TextInput.inputString("    Afleveringsdato");
		String status = "Udlånt";
		Loan l = LendController.createLoan(loanNumber, borrowDate, returnDate, status, savePerson, saveLP);
		if (l != null) {
			System.out.println("Lånet er oprettet med LP kopi nr. " + l.getLpCopy().getNo() + ".");
		} else {
			System.out.println("Lånet kunne ikke oprettes. Kontroller, at lånenummeret ikke allerede er brugt.");
		}
	}

	// Opret person

	private void createPerson() {
		System.out.println();
		System.out.println("Opret ny person i systemet");
		String name = TextInput.inputString("    Navn");
		String email = TextInput.inputString("    E-mail");
		String phone = TextInput.inputString("    Telefon nr.");
		String address = TextInput.inputString("    Adresse");
		String postalCode = TextInput.inputString("    Postnummer");
		String city = TextInput.inputString("    By");
		Person p = personController.createPerson(name, email, phone, address, postalCode, city);
		displayCreate(p);
		System.out.println();
		start();
	}

	// Displays

	private void displayLoan(Person p) {
		System.out.println("Person, som du opretter til:");
		if (p != null) {
			System.out.println("    Navn: " + p.getName());
			System.out.println("    E-mail: " + p.getEmail());
			System.out.println("    Telefon nr.: " + p.getPhone());
		} else {
			System.out.println("    <Ingen person at vise>");
		}
	}

	private void displayLP(LPcopy l) {
		System.out.println("LP, som du låner ud:");
		if (l != null) {
			System.out.println("	Nummer: " + l.getNo());

		}
	}

	private void displayCreate(Person p) {
		System.out.println();
		System.out.println("Person, som du har oprettet:");
		if (p != null) {
			System.out.println("    Navn: " + p.getName());
			System.out.println("    E-mail: " + p.getEmail());
			System.out.println("    Telefon nr.: " + p.getPhone());
			System.out.println("    Adresse: " + p.getAddress());
			System.out.println("    Postnummer: " + p.getPostalCode());
			System.out.println("    By: " + p.getCity());
		} else {
			System.out.println("    <Ingen person at vise>");
			start();
		}
	}

	private static int writeLoanMenu() {
		// creates a keyboard object to read input
		TextOptions menu = new TextOptions("\n ***** Udlånsmenu *****", "Tilbage");
		menu.addOption("Opret lån");
		menu.addOption("Opret Person");
		//menu.addOption("Opret Data");
		// TODO if you need more menu items they have to go here
		int choice = menu.prompt();

		return choice;
	}


}
