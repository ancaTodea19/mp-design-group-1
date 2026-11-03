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
	
	public LP findLP (String lp, String lpnr) {
		LP res = null;
		boolean seac
		for (int i =0; i < lps.size() && res == null; i++ ) {
			if (lps.get(i).getTitle().equals(lp)) {
				
				for (int j=0; j < lps.get(i).getLpCopy().size(); j++ ) {
					if() {
						
					}
				}
				
			}
			
		}
		
	}
	
}
