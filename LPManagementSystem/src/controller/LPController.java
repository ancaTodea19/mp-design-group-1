package controller;

import model.LP;


public class LPController {

	
	
	public LP createPerson(String name, String email,String phone) {
		Person p = new Person (name, email, phone);
		PersonContainer pc = PersonContainer.getInstance();
		boolean success = pc.addPerson(p);
		if(!success) {
			p = null;
		}
		return p;
	}
	
	

	public Person findByEmail(String emial) {
		Person p = PersonContainer.getInstance().findByEmail(emial);
		return p;
	}
}
