package model;

public class LPcopy {
	private int no;
	private String purchaseDate;
	private double purchasePrice;
	private boolean status;
	
	public LPcopy(int no, String purchaseDate, double purchasePrice) {
		super();
		this.no = no;
		this.purchaseDate = purchaseDate;
		this.purchasePrice = purchasePrice;
		this.status = true;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
