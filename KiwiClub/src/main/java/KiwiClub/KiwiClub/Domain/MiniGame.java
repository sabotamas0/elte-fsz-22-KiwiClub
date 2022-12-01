package KiwiClub.KiwiClub.Domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class MiniGame {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
