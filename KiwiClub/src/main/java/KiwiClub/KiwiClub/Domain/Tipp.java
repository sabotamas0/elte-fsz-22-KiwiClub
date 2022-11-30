package KiwiClub.KiwiClub.Domain;

import java.util.Date;

public class Tipp {
	
	private int userId;
	private int tippedNumber;
	private Date gameDate;
	
	public Date getGameDate() {
		return gameDate;
	}

	public void setGameDate(Date gameDate) {
		this.gameDate = gameDate;
	}

	public Tipp() {
		
	}
	
	public Tipp(int userId, int tippedNumber, Date gameDate) {
		super();
		this.userId = userId;
		this.tippedNumber = tippedNumber;
		this.gameDate = gameDate;
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
