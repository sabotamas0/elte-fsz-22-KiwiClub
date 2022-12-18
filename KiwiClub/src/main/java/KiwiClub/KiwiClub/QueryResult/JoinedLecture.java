package KiwiClub.KiwiClub.QueryResult;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JoinedLecture {
    @Id
    public Long lectureId;
    public Long lectureProgressId;
    private Long trickId;
    private String lectureName;
    private int lectureIndex;
    private Long kiwiId;
    private Date startDate;
    private int howManyDaysToLearn;
    private boolean isLearned;
    private int progress;
}
