package model;

import java.util.ArrayList;

public class LoanContainer {

	private static LoanContainer instance;
	private ArrayList<Loan> loans;

	private LoanContainer() {
		loans = new ArrayList<>();
	}

	public static LoanContainer getInstance() {
		if (instance == null) {
			instance = new LoanContainer();
		}
		return instance;
	}

	public boolean addLoan(Loan loan) {
		if (loan == null) {
			return false;
		} else {
			loans.add(loan);
			return true;
		}
	}

	public Loan findLoan(int loanNumber) {
		for (Loan loan : loans) {
			if (loan.getLoanNumber() == loanNumber) {
				return loan;
			}
		}
		return null;
	}

}
