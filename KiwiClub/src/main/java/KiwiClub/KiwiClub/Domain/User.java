package KiwiClub.KiwiClub.Domain;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue
	public Long userId;
	@Column(nullable = false)
	protected String name;
	@Column(nullable = false)
	protected String password;
	@Column(nullable = false, unique = true)
	protected String email;
	private boolean isAdmin;

}
