package KiwiClub.KiwiClub.Domain;

import java.util.List;
import java.util.UUID;

public class LearnedTricks {
	
	private UUID kiwiId;
	private List<Trick> tricks;
	private int learnedLectures;
	
	public UUID getKiwiId() {
		return kiwiId;
	}
	public void setKiwiId(UUID kiwiId) {
		this.kiwiId = kiwiId;
	}
	public List<Trick> getTricks() {
		return tricks;
	}
	public void setTricks(List<Trick> tricks) {
		this.tricks = tricks;
	}
	
	
	
}
