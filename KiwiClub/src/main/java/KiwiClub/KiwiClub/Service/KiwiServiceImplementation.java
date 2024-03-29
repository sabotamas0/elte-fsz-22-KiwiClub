package KiwiClub.KiwiClub.Service;

import KiwiClub.KiwiClub.Domain.*;
import KiwiClub.KiwiClub.QueryResult.JoinedLecture;
import KiwiClub.KiwiClub.Repository.KiwiRepository;
import KiwiClub.KiwiClub.Repository.LectureProgressRepository;
import KiwiClub.KiwiClub.Repository.LectureRepository;
import KiwiClub.KiwiClub.dto.KiwiDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class KiwiServiceImplementation implements KiwiService{
    @Autowired
    private KiwiRepository kiwiRepository;
    @Autowired
    private LectureRepository lectureRepository;

    @Autowired
    private LectureProgressRepository lectureProgressRepository;


    @Override
    public void saveKiwi(KiwiDto kiwiDto) {
        Kiwi kiwi = new Kiwi();
        //TODO
        switch (kiwiDto.getFaj()) {
            case "NORMAL" -> kiwi.setSpecies(KiwiSpecies.NORMAL);
            case "DOTTED" -> kiwi.setSpecies(KiwiSpecies.DOTTED);
        }
        switch (kiwiDto.getNem()) {
            case "MALE" -> kiwi.setSex(Sex.MALE);
            case "FEMALE" -> kiwi.setSex(Sex.FEMALE);
        }
        kiwi.setName(kiwiDto.getNev());
        kiwi.setUserId(kiwiDto.userId);
        kiwi.setBirthDay(Date.from(Instant.now()));
        kiwi.setLastFeedDay(Date.from(Instant.now()));
        kiwi.setLastPenaltyDay(Date.from(Instant.now()));
        kiwi.setAlive(true);
        kiwi.setWeight(10000.0f);
        kiwi.setThirst(1.0f);
        List<Lecture> lectures = lectureRepository.findAll();

        //itt majd hozzá kell rendelni az összes létező trükk lecturjeit
        kiwiRepository.save(kiwi);
        for(Lecture l : lectures) {
            LectureProgress lp = new LectureProgress();
            lp.setLectureId(l.getLectureId());
            lp.setKiwiId(kiwiRepository.getKiwiByUserId(kiwiDto.getUserId()).getKiwiId());
            lp.setHowManyDaysToLearn(1);
            lp.setLearned(false);
            lp.setProgress(0);
            lectureProgressRepository.save(lp);
        }
    }

    @Override
    public Kiwi findByUserId(Long userId) {
        return kiwiRepository.getKiwiByUserId(userId);
    }

    @Override
    public Optional<Kiwi> findById(Long kiwiId) {
        return kiwiRepository.findById(kiwiId);
    }

    @Override
    public List<JoinedLecture>  getJoinedLectures(Long trickId,Long kiwiId) {
        return lectureProgressRepository.getLectureProgressByKiwiIdAndTrickIdOptional(trickId,kiwiId);
    }

    @Override
    public void updateKiwi(Kiwi kiwi) {
        //itt az update-nél ha van új trükk akkor az összes lecturjét hozzáadni
        kiwiRepository.save(kiwi);
    }


}
