package KiwiClub.KiwiClub.Service;

import KiwiClub.KiwiClub.Domain.Lecture;
import KiwiClub.KiwiClub.Domain.LectureProgress;
import KiwiClub.KiwiClub.Repository.LectureRepository;

import java.util.List;

public class LectureServiceImplementation implements LectureService{
    LectureRepository lectureRepository;
    @Override
    public List<Lecture> getAllLecture() {
        return lectureRepository.findAll();
    }
}
