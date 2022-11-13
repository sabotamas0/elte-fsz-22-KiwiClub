package KiwiClub.Domain;

import java.util.List;

public class LearnedTricks {
	
	private int kiwiId;
	private List<Trick> tricks;
	private int learnedLectures;
	
	public int getKiwiId() {
		return kiwiId;
	}
	public void setKiwiId(int kiwiId) {
		this.kiwiId = kiwiId;
	}
	public List<Trick> getTricks() {
		return tricks;
	}
	public void setTricks(List<Trick> tricks) {
		this.tricks = tricks;
	}
	
	
	
}
