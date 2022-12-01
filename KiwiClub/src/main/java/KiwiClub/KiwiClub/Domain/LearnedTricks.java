package KiwiClub.KiwiClub.Domain;
import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class LearnedTricks {
	@Id
	private UUID kiwiId;

	@OneToMany(
			mappedBy = "learnedTricks",
			cascade = CascadeType.ALL,
			orphanRemoval = true
	)
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
