package KiwiClub.KiwiClub.Domain;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

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
	@Value("${kiwis.weight:0.0f}")
	private Float weight;
	@Value("${kiwis.thirst:1.0f}")
	private Float thirst;
	private Date birthDay;
	private Date lastFeedDay;
	private Date lastPenaltyDay;
	
}
