package tui;

public class LPMenu {

	public void start() {
		boolean running = true;
		while (running) {
			int choice = writeLPMenu();

			if (choice == 1) {
				System.out.println("Du har nu oprettet en ny LP");
			}

			else if (choice == 2) {
				System.out.println("Her er din liste");
			}

			else {
				running = false;
			}

		}

	}

	private int writeLPMenu() {
		// creates a keyboard object to read input
		TextOptions menu = new TextOptions("\n ***** LPMenu *****", "Tilbage");
		// TODO if you need more menu items they have to go here
		menu.addOption("Opret ny LP");
		menu.addOption("Se Liste");
		int choice = menu.prompt();

		return choice;
	}

}
