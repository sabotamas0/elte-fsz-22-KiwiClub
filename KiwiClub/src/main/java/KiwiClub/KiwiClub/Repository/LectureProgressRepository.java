package KiwiClub.KiwiClub.Repository;

import KiwiClub.KiwiClub.Domain.*;
import KiwiClub.KiwiClub.QueryResult.JoinedLecture;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LectureProgressRepository extends CrudRepository<LectureProgress, Long> {
    /*
     @Query("select NEW com.mypkg.PersonOrganization(p.guid as guid ...
                , o.name as organisationName)
            from person p left join p.organisation o")
    * */
    @Query("SELECT NEW JoinedLecture(l.lectureId as lectureId,lp.lectureProgressId as lectureProgressId,l.trickId as trickId,l.lectureName as lectureName,l.lectureIndex as lectureIndex,lp.kiwiId as kiwiId,lp.startDate as startDate,lp.howManyDaysToLearn as howManyDaysToLearn, lp.isLearned as isLearned,lp.progress as progress) FROM Lecture l INNER JOIN LectureProgress lp ON lp.lectureId = l.lectureId where l.trickId=:tId AND lp.kiwiId=:kId")
    List<JoinedLecture>  getLectureProgressByKiwiIdAndTrickIdOptional(@Param("tId")Long trickId, @Param("kId")Long kiwiId);
    List<LectureProgress> findAll();
    LectureProgress getLectureProgressByLectureProgressId(Long lectureProgressId);

}
