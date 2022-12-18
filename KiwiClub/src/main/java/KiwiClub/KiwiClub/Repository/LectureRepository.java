package KiwiClub.KiwiClub.Repository;

import KiwiClub.KiwiClub.Domain.Lecture;
import KiwiClub.KiwiClub.Domain.LectureProgress;
import KiwiClub.KiwiClub.Domain.Trick;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LectureRepository extends CrudRepository<Lecture, Long> {
    List<Lecture> findAll();
}
