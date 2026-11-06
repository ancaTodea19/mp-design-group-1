package controller;

import model.LP;
import model.LPContainer;
import model.LPcopy;






public class LPController {
	public static LP findLP(String title) {
		return LPContainer.getInstance().findLP(title);
	}
	public static LPcopy registerLPCopy(LP lp, String PurchaseDate, double purchasePrice) {
		if(lp==null || PurchaseDate==null || PurchaseDate.isBlank()||purchasePrice<0) {
			
		}
		return null;
	}
	
	
	{
	LPContainer container= LPContainer.getInstance();
	int no =container.getNextCopyNo();
	Object purchasePrice;
	LP lp;
	String purchaseDate;
	LPcopy copy =lp.createLPCopy(no, purchaseDate, purchasePrice);
	container.updateNextNo();
	return copy;
	
}

	public static LP createLP(String barcode, String title, String artist, int publicationDate) {
		if (title == null) {
			return null;
		}

		LP lp = new LP(barcode, title, artist, publicationDate);
		if (!LPContainer.getInstance().addLP(lp)) {
			return null;
		}
		return lp;
	}

	public static LP findLP(String title) {
		return LPContainer.getInstance().findLP(title);
	}

	public static LPcopy createLPcopy(String barcode, String title, String artist, int publicationDate, String purchaseDate, double purchasePrice) {
		if (title == null) {
			return null;
		}

		LPContainer container = LPContainer.getInstance();
		LP lp = container.findLP(title);
		if (lp == null) {
			lp = createLP(barcode, title, artist, publicationDate);
			if (lp == null) {
				return null;
			}
		}

		int copyNo = container.getNextCopyNo();
		while (container.findLPcopy(copyNo) != null) {
			container.updateNextNo();
			copyNo = container.getNextCopyNo();
		}

		LPcopy copy = new LPcopy(copyNo, purchaseDate, purchasePrice);
		lp.getLpCopies().put(copyNo, copy);
		container.updateNextNo();
		return copy;
	}

	public static LPcopy findCopis (int copyNo) {
		LPcopy copy = LPContainer.getInstance().findLPcopy(copyNo);
		return copy;
	}
	
}
