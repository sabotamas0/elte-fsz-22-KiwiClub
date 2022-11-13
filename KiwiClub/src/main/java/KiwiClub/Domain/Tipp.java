package KiwiClub.Domain;

public class Tipp {
	
	private int userId;
	private int tippedNumber;
	
	public Tipp() {
		
	}
	
	public Tipp(int userId, int tippedNumber) {
		this.userId = userId;
		this.tippedNumber = tippedNumber;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getTippedNumber() {
		return tippedNumber;
	}
	public void setTippedNumber(int tippedNumber) {
		this.tippedNumber = tippedNumber;
	}
	
	

}
