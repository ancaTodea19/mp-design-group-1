
package controller;

import model.Person;
import model.PersonContainer;

public class PersonController {
	
	public Person createPerson(String name, String email,String phone, String address, String postalCode, String city) {
		Person p = new Person (name, email, phone, address, postalCode, city);
		PersonContainer pc = PersonContainer.getInstance();
		boolean success = pc.addPerson(p);
		if(!success) {
			p = null;
		}
		return p;
	}
	
	
	
	public Person findPerson(String phoneNo) {
		Person pers = PersonContainer.getInstance().findPerson(phoneNo);
		return pers;
	}



}