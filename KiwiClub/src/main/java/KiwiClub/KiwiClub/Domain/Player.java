package KiwiClub.KiwiClub.Domain;

public class Player extends User { // friendsList nélkül

	private Kiwi kiwi;
	private KiwiCoin money;
	private String email;
	
	public Player(String name, String password, int userId, Kiwi kiwi, KiwiCoin money) {
		super(name, password, userId);
		this.kiwi=kiwi;
		this.money=money;
	}
	
	public Kiwi getKiwi() {
		return kiwi;
	}
	public void setKiwi(Kiwi kiwi) {
		this.kiwi = kiwi;
	}
	public KiwiCoin getMoney() {
		return money;
	}
	public void setMoney(KiwiCoin money) {
		this.money = money;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
