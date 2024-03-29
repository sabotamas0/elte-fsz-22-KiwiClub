package KiwiClub.KiwiClub.Domain;
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
@Table(name = "foods")
public class Food {
	@Id
	@GeneratedValue
	public Long foodId;
	private int price;
	private int nutrition;
	private String name;
}
