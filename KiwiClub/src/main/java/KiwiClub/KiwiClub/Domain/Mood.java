package KiwiClub.KiwiClub.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Mood {
	@Id
	private UUID kiwiId;

	private int happines;

	public Mood() {
		
	}
	
	public Mood(int happines) {
		this.happines = happines;
	}

	public int getHappines() {
		return happines;
	}

	public void setHappines(int happines) {
		this.happines = happines;
	}
	
	
	
}
