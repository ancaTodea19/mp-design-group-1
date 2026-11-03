package model;

import java.util.ArrayList;

public class LPContainer {
	private static LPContainer instance;
	private ArrayList<LP> lps;

	private LPContainer() {
		lps = new ArrayList<LP>();
	}

	private static LPContainer getInstance() {
		if (instance == null) {
			instance = new LPContainer();
		}
		return instance;
	}

	
	public LP findLP (String lp, int lpnr) {
		LP res = null;
		for(int i = 0; i < lps.size() && res == null; i++) {
			if (lps.get(i).getTitle().equals(lp)) {
				res = lps.get(i);
			}
		}
		return res;
	}

}
