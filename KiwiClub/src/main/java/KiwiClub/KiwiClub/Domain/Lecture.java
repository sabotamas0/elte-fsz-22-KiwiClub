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
public class Lecture {
    @Id
    public Long lectureId;
    private Long trickId;
    private String lectureName;
    private int lectureIndex;
}
