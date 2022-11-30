package KiwiClub.KiwiClub.Domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class MiniGame {

	public UUID MiniGameId;
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
