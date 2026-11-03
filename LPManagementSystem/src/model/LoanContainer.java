package model;
import java.util.ArrayList;

public class LoanContainer {

	private static LoanContainer instance;
	private ArrayList<Loan> loans;
	
	private LoanContainer() {
		loans= new ArrayList<>();
	}
	
	public static LoanContainer getInstance() {
		if (instance == null) {
			instance =  new LoanContainer();
		}
		return instance;
	}

	public boolean addLoan(Loan p) {
		
		return false;
	}
	
}
