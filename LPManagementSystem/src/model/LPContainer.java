package model;

import java.util.ArrayList;

public class LPContainer {
	private static LPContainer instance;
	private ArrayList<LP> lps;
	
	private LPContainer() {
		lps = new ArrayList<LP>();
	}
	
	private static LPContainer getInstance() {
		if(instance == null) {
			instance = new LPContainer();
		}
		return instance;
	}
	
	
}
