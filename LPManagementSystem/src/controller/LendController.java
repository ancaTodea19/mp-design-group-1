package controller;

import model.Loan;
import model.LoanContainer;

public class LendController {


private static final String String = null;

public Loan createLoan(int loanNumber, String borrowDate, String returnDate, String status) {
	Loan p = new Loan( loanNumber,  borrowDate,  returnDate,  status);
	LoanContainer lc = LoanContainer.getInstance();
	boolean success = lc.addLoan(p);
	if(!success) {
		p=null;
	}
	return p;
}


	
	
	
}


