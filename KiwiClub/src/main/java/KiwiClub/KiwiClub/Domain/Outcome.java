package KiwiClub.KiwiClub.Domain;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Outcome {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public UUID OutcomeId;

	@OneToMany(
			mappedBy = "outcome",
			cascade = CascadeType.ALL,
			orphanRemoval = true
	)
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
