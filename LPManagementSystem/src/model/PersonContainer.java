package model;

import java.util.ArrayList;

public class PersonContainer {
	private static PersonContainer instance;
	private ArrayList<Person> persons;
	
	private PersonContainer() {
		persons = new ArrayList<Person>();
	}
	
	public static PersonContainer getInstance() {
		if (instance== null) {
			instance = new PersonContainer(); 
		}
		return instance;
	}
	
	public Person findByEmail (String email) {
		Person res = null;
		for(int i = 0; i < persons.size() && res == null; i++) {
			if (persons.get(i).getEmail().equals(email)) {
				res = persons.get(i);
			}
		}
		return res;
	}
	
	public boolean addPerson (Person p) {
		boolean res = false;
		if (findByEmail(p.getEmail())==null) {
			res = true;
			persons.add(p);
		}
		return res;
	}
		

}