package KiwiClub.KiwiClub.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KiwiDto {
    public Long userId;
    @NotEmpty
    private String nem;
    @NotEmpty
    private String faj;
    @NotEmpty
    private String nev;
}
