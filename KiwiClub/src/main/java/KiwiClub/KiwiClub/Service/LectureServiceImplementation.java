package KiwiClub.KiwiClub.Service;

import KiwiClub.KiwiClub.Domain.LectureProgress;
import KiwiClub.KiwiClub.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LectureServiceImplementation implements LectureProgressService {

    @Autowired
    private LectureProgressRepository lectureProgressRepository;

    @Override
    public List<LectureProgress> getAllLectureProgresses() {
        List<LectureProgress> lectureProgresses = new ArrayList<>();
        lectureProgresses.addAll(lectureProgressRepository.findAll());
        return lectureProgresses;
    }

    @Override
    public LectureProgress addLectureProgress(LectureProgress lectureProgress) {
        return lectureProgressRepository.save(lectureProgress);
    }

    @Override
    public LectureProgress updateLectureProgress(LectureProgress lectureProgress) {
        return lectureProgressRepository.save(lectureProgress);
    }

    @Override
    public LectureProgress getLectureProgressByLectureProgressId(Long lectureProgressId) {
        return lectureProgressRepository.getLectureProgressByLectureProgressId(lectureProgressId);
    }
}