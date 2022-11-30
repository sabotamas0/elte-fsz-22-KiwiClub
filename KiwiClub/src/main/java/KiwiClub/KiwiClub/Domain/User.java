package KiwiClub.KiwiClub.Domain;

import java.util.UUID;

public class User {
	protected String name;
	protected String password;
	protected UUID userId;
	
	public User() {
		
	}

	public User(String name, String password, UUID userId) {
		super();
		this.name = name;
		this.password = password;
		this.userId = userId;
	}
	
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
	public UUID getUserId() {
		return userId;
	}
	public void setUserId(UUID userId) {
		this.userId = userId;
	}
	
	
	
}
