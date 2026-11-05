package model;

public class Loan {

	private int loanNumber;
	private String borrowDate;
	private String returnDate;
	private String status;
	private Person person;
	private LPcopy lpCopy;

	public Loan(int loanNumber, String borrowDate, String returnDate, String status, Person person, LPcopy lpCopy) {
		this.loanNumber = loanNumber;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
		this.person = person;
		this.lpCopy = lpCopy;
		status = "Status";
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
		return status;
	}

	public void setStatus(String status) {
		status = "Status";
	}

}
