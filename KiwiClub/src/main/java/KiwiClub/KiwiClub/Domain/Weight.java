package KiwiClub.KiwiClub.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Weight {

	@Id
	private UUID kiwiId;
	private int avgWeight;
	private int yourKiwisWeight;
	
	public Weight() {
		
	}
	
	public Weight(int yourKiwisWeight) {
		this.yourKiwisWeight = yourKiwisWeight;
	}

	public int getAvgWeight() {
		return avgWeight;
	}
	public void setAvgWeight(int avgWeight) {
		this.avgWeight = avgWeight;
	}
	public int getYourKiwisWeight() {
		return yourKiwisWeight;
	}
	
	
	
}
