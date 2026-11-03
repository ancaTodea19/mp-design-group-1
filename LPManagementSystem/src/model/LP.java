package model;

import java.util.HashMap;

public class LP {

	private String barcode; 
	private String title;
	private String artist; 
	private int publicationDate;
	
	private HashMap<String, String> lpCopy;
	
	public LP(String barcode, String title, String artist, int publicationDate) {
		super();
		this.barcode = barcode;
		this.title = title;
		this.artist = artist; 
		this.publicationDate = publicationDate;
		lpCopy = new HashMap<>();
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPublicationDate() {
		return publicationDate;
	}


	public void setPublicationDate(int publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	
	
	
	
}