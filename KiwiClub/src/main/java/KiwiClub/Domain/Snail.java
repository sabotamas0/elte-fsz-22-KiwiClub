package KiwiClub.Domain;

public class Snail extends Food {
	private Snail instance;
	
	private Snail() {}
	
	public Snail getInstance() {
		if (instance==null) instance=new Snail();
		return instance;
	}
	
}
