package KiwiClub.KiwiClub.Domain;
import javax.persistence.Entity;
import javax.persistence.OneToOne;


@Entity
public class Player extends User { // friendsList nélkül

	@OneToOne
	private Kiwi kiwi;
	@OneToOne
	private KiwiCoin money;
	private String email;
	
	public Player(String name, String password, Kiwi kiwi, KiwiCoin money) {
		super(name, password);
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
