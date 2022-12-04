package KiwiClub.KiwiClub.Domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected UUID userId;
	protected String name;
	protected String password;
	
	public User() {
		
	}
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;

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
