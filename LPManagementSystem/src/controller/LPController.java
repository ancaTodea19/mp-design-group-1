package controller;

import model.LP;
import model.LPContainer;
<<<<<<< Updated upstream
=======


>>>>>>> Stashed changes

public class LPController {

	
	
<<<<<<< Updated upstream
	

=======
	public LP createLp(String barcode, String title, String artist, String publicationDate) {
		LP lp = new LP (barcode, title, artist, publicationDate);
		LPContainer lps = LPContainer.getInstance();
		boolean success = lps.addLP(lp);
		if(!success) {
			lp = null;
		}
		return lp;
	}
	
	

	/*public Person findByEmail(String emial) {
		Person p = PersonContainer.getInstance().findByEmail(emial);
		return p;
	}*/
>>>>>>> Stashed changes
}
