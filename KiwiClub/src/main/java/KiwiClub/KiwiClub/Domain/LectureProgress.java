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
@Table(name = "LectureProgress")
public class LectureProgress {
    @Id
    public Long lectureProgressId;
    public Long lectureId;
    private Long kiwiId;
    private Date startDate;
    private int howManyDaysToLearn;
    private boolean isLearned;
    private int progress;

}
