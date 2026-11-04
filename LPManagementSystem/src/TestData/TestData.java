package TestData;

import controller.PersonController;
import model.Person;

public class TestData {
	
	private PersonController personController;
	private Person person;

	private TestData() {
		 createTestdataPerson();
	}
	
	public void createTestdataPerson() {
		
		personController.createPerson("Joe", "joe@mail.dk", "12345678", "Hervej 2", "9000", "Aalborg");
		
		personController.createPerson("jane", "jane@mail.dk", "23456789", "ligeHervej 2", "9230", "Svenstrup");
		personController.createPerson("joey", "joey@mail.dk", "34567890", "vejen 3", "9400", "Nørresundby");
	}
}

