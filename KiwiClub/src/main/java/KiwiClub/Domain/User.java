package KiwiClub.Domain;

public class User {
	protected String name;
	protected String password;
	protected int userId;
	
	public User() {
		
	}

	public User(String name, String password, int userId) {
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
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
}
