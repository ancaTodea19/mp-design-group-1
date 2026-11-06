package controller;
 
import model.LP;
import model.LPContainer;
import model.LPcopy;
 
 
 
 
 
 
public class LPController {
	public static LP findLP(String title) {
		return LPContainer.getInstance().findLP(title);
	}
	public static LPcopy registerLPCopy(LP lp, String purchaseDate, double purchasePrice) {

	    if (lp == null ||
	        purchaseDate == null ||
	        purchaseDate.isBlank() ||
	        purchasePrice < 0) {
	        return null;
	    }

	    LPContainer container = LPContainer.getInstance();

	    int no = container.getNextCopyNo();

	    LPcopy copy = lp.createLPCopy(no, purchaseDate, purchasePrice);

	    container.updateNextNo();

	    return copy;
	}
 
	public static LPcopy findCopis (int copyNo) {
		LPcopy copy = LPContainer.getInstance().findLPcopy(copyNo);
		return copy;
	}
	
}