package KiwiClub.Domain;

public class Ant extends Food {
	private Ant instance;
	
	private Ant() {}
	
	public Ant getInstance() {
		if (instance==null) instance=new Ant();
		return instance;
	}
	
	
}
