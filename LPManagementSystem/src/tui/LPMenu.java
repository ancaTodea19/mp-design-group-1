package tui;

import controller.LPController;
import model.LP;
import model.LPcopy;

public class LPMenu {

	public void start() {
		boolean running = true;
		while (running) {
			int choice = writeLPMenu();

			if (choice == 1) {
				createLPCopy();
			}

			else if (choice == 2) {
				System.out.println("Her er din liste");
			}

			else {
				running = false;
			}

		}

	}

	private void createLPCopy() {
		System.out.println("Opret en LP-kopi.");
		String title = TextInput.inputString("Titel");
		LP existingLP = LPController.findLP(title);
		String barcode = null;
		String artist = null;
		int publicationDate = 0;
		if (existingLP == null) {
			System.out.println("LP'en findes ikke endnu. Indtast dens oplysninger:");
			barcode = TextInput.inputString("Stregkode");
			artist = TextInput.inputString("Kunstner");
			publicationDate = TextInput.inputNumber("Udgivelsesår");
		}

		String purchaseDate = TextInput.inputString("Købsdato");
		double purchasePrice;
		purchasePrice = Double.parseDouble(TextInput.inputString("Købspris"));

		LPcopy copy = LPController.createLPcopy(barcode, title, artist, publicationDate, purchaseDate,
				purchasePrice);
		if (copy == null) {
			System.out.println("LP-kopien kunne ikke oprettes. Kontroller, at titlen er udfyldt.");
		} else {
			System.out.println("LP-kopi nr. " + copy.getNo() + " er oprettet.");
		}
	}

	private int writeLPMenu() {
		// creates a keyboard object to read input
		TextOptions menu = new TextOptions("\n ***** LPMenu *****", "Tilbage");
		// TODO if you need more menu items they have to go here
		menu.addOption("Opret LP/kopi");
		menu.addOption("Se Liste");
		int choice = menu.prompt();

		return choice;
	}

}
