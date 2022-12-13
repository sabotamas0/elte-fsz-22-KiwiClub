package KiwiClub.KiwiClub.Domain;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "kiwis")
public class Kiwi {
	@Id
	@GeneratedValue
	public Long kiwiId;
	private Long userId;
	private String name;
	private boolean isAlive;
	private Sex sex;
	private KiwiSpecies species;
	private Float weight;
	private Date birthDay;
	private Date lastFeedDay;
	
}
