package KiwiClub.KiwiClub.Service;

import KiwiClub.KiwiClub.Domain.LectureProgress;

import java.util.List;

public interface LectureProgressService {
    List<LectureProgress> getAllLectureProgresses();
    LectureProgress addLectureProgress(LectureProgress lectureProgress);
    LectureProgress updateLectureProgress(LectureProgress lectureProgress);
    LectureProgress getLectureProgressByLectureProgressId(Long lectureProgressId);
}
