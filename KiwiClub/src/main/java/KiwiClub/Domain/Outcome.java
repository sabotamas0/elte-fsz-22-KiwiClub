package KiwiClub.Domain;

import java.util.List;

public class Outcome {
	
	private List<Tipp> winners;
	
	public Outcome() {
		
	}

	public Outcome(List<Tipp> winners) {
		this.winners = winners;
	}

	public List<Tipp> getWinners() {
		return winners;
	}

	public void setWinners(List<Tipp> winners) {
		this.winners = winners;
	}
	
	

}
