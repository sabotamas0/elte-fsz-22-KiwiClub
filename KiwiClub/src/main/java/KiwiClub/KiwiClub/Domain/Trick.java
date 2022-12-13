package KiwiClub.KiwiClub.Domain;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

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
public class Trick {
	@Id
	@GeneratedValue
	public Long trickId;
	private Long kiwiId;
	private String name;
	private int lectureCount;
}
