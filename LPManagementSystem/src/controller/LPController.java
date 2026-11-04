package controller;

import model.LP;
import model.LPContainer;
import model.LPcopy;

public class LPController {

	public static LPcopy findCopis (int copyNo) {
		LPcopy copy = LPContainer.getInstance().findLPcopy(copyNo);
		return copy;
	}
	
}
