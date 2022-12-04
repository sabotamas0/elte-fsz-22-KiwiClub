package KiwiClub.KiwiClub.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class KiwiCoin {
	@Id
	private UUID UserId;
	private int amount;
	
	public KiwiCoin() {
		
	}
	
	public KiwiCoin(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
