
package model;

import java.util.ArrayList;

public class Person {

	private String name;
	private String email;
    private String phone;
   
    private ArrayList<LP> lps;
    
	public Person(String name, String email, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		lps = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void addLPtoPerson(LP lp) {
		if (lp != null) {
			lps.add(lp);
		}
	}
	
	public void removeLP(LP lp) {
		lps.remove(lp);
	}
	
}