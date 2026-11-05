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

	public static LPcopy findCopis (int copyNo) {
		LPcopy copy = LPContainer.getInstance().findLPcopy(copyNo);
		return copy;
	}
	
}
