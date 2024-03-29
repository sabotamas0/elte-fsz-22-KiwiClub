package KiwiClub.KiwiClub.Domain;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Lecture")
public class Lecture {
    @Id
    public Long lectureId;
    private Long trickId;
    private String lectureName;
    private int lectureIndex;

}
