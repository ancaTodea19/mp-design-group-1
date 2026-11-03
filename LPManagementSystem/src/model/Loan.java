package model;

public class Loan {

	private int loanNumber;
	private String borrowDate;
	private String returnDate;
	private String Status;
	
	
	public Loan(int loanNumber, String borrowDate, String returnDate, String status) {
		this.loanNumber = loanNumber;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
		Status = status;
	}


	public int getLoanNumber() {
		return loanNumber;
	}


	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}


	public String getBorrowDate() {
		return borrowDate;
	}


	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}


	public String getReturnDate() {
		return returnDate;
	}


	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}


	public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}
	
	
	
	
}
