package KiwiClub.KiwiClub.Domain;

import javax.persistence.*;


@Entity
public class User {
	@Id
	@GeneratedValue
	public Long userId;
	protected String name;
	protected String password;
	private boolean isAdmin;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isUserAdmin() {
		return isAdmin;
	}
	public void setUserAdmin(boolean pIsAdmin) {
		isAdmin = pIsAdmin;
	}
}
