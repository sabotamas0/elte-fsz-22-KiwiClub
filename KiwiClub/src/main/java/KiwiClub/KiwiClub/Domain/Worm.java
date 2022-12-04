package KiwiClub.KiwiClub.Domain;

public class Worm extends Food {
	private Worm instance;
	
	private Worm() {}
	
	public Worm getInstance() {
		if (instance==null) instance=new Worm();
		return instance;
	}
	
	
}
