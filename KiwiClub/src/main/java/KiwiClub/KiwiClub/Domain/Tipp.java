package KiwiClub.KiwiClub.Domain;
import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class Tipp {
	@Id
	private UUID userId;
	private int tippedNumber;
	private Date gameDate;

	@ManyToOne(fetch = FetchType.LAZY)
	private MiniGame miniGame;
	@ManyToOne(fetch = FetchType.LAZY)
	private Outcome outcome;
	
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
