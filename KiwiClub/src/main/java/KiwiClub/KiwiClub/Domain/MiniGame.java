package KiwiClub.KiwiClub.Domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class MiniGame {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator"
	)
	@Column(name = "MiniGameId", updatable = false, nullable = false)
	public UUID MiniGameId;

	@OneToMany(
			mappedBy = "miniGame",
			cascade = CascadeType.ALL,
			orphanRemoval = true
	)
	private List<Tipp> tipps;

	public MiniGame() { }
	
	public MiniGame(List<Tipp> tipps) {
		this.tipps = tipps;
	}
	
	public List<Tipp> getTipps() {
		return tipps;
	}
	public void setTipps(List<Tipp> tipps) {
		this.tipps = tipps;
	}
	
	

}
