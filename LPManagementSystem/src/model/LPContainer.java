package model;

import java.util.ArrayList;

public class LPContainer {
	
	private static LPContainer instance;
	private ArrayList <LP> lps;
	private int nextCopyNo = 1;

	public static LPContainer getInstance() {
		if (instance == null) {
			instance = new LPContainer();
		}
		return instance;
	}
	
	private LPContainer() {
		lps = new ArrayList<LP>();
	}
	
	
	// Opret nye LP
	public LP findLP (String titel) {
		LP res = null;
		for (int i =0; i < lps.size() && res == null; i++) {
			if (lps.get(i).getTitle().equals(titel)) {
				res = lps.get(i);
			}
		}
		return res;
	}
	
	public boolean addLP(LP l) {
		boolean res = false;
		if(findLP(l.getTitle())==null) {
			res = true;
			lps.add(l);
		}
		return res;
	}
	
	
	public LPcopy findLPcopy(int copyNo) {
		LPcopy res = null; 
		for (int i = 0; i < this.lps.size() && res == null; i++  ) {
			res = lps.get(i).findLPCopy(copyNo);
		}
		return res; 
	}
	
	public int getNextCopyNo () {
		return nextCopyNo;
	}
	
	public void updateNextNo() {
		nextCopyNo++;
	}
}
