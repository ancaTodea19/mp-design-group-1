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
	
	public String getBarcode() {
		return barcode; 
	}
	
	
	public void setBarcode(String barcode) {
		this.barcode = barcode; 
	}


	public HashMap<String, String> getLpCopy() {
		return lpCopy;
	}


	public void setLpCopy(HashMap<String, String> lpCopy) {
		this.lpCopy = lpCopy;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtist() {
		return artist; 
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}


	public int getPublicationDate() {
		return publicationDate;
	}


	public void setPublicationDate(int publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	
	
	
	
}