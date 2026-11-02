package tui;

import java.util.Scanner;

import controller.personController;
import model.Person;

public class CreateLoan {
	
	
	private static Scanner scanner;
	static {
		scanner = new Scanner(System.in);
	}
	

	public static void start () {
		boolean running = true;
		while (running) {
			int choise = input;
		}
	}
	
	
	private static void findPerson() {
		System.out.println("find Person");
		String name = input("	name");
		personController pCtrl = new personController();
		Person res = pCtrl.findByName(name);
		display(res);
	}
	 
	
	
	private static String input(String prompt) {
		System.out.print(prompt + ": ");
		String res = scanner.nextLine();
		return res;
	}
	
}
