package controller;

import model.LPcopy;
import model.Loan;
import model.LoanContainer;
import model.Person;

public class LendController {


	public static Loan createLoan(int loanNumber, String borrowDate, String returnDate, String status, Person person, LPcopy lpCopy) {
		Loan p = new Loan(loanNumber, borrowDate, returnDate, status, person, lpCopy);
		LoanContainer lc = LoanContainer.getInstance();
		boolean success = lc.addLoan(p);
		if (!success) {
			p = null;
		}
		return p;
	}

}
