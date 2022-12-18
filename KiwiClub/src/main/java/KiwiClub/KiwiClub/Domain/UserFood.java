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
@Table(name = "userfoods")
public class UserFood {
    @Id
    public Long foodId;
    private Long UserId;
    private int amount;
}
