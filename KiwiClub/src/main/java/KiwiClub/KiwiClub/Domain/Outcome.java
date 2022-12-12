package KiwiClub.KiwiClub.Domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Outcome {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator"
	)
	@Column(name = "OutcomeId", updatable = false, nullable = false)
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
