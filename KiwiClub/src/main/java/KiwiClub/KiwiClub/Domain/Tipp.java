package KiwiClub.KiwiClub.Domain;

import java.util.Date;
import java.util.UUID;

public class Tipp {
	
	private UUID userId;
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
	
	public Tipp(UUID userId, int tippedNumber, Date gameDate) {
		super();
		this.userId = userId;
		this.tippedNumber = tippedNumber;
		this.gameDate = gameDate;
	}

	public UUID getUserId() {
		return userId;
	}
	public void setUserId(UUID userId) {
		this.userId = userId;
	}
	public int getTippedNumber() {
		return tippedNumber;
	}
	public void setTippedNumber(int tippedNumber) {
		this.tippedNumber = tippedNumber;
	}
	
	

}
