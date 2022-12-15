package KiwiClub.KiwiClub.Service;

import KiwiClub.KiwiClub.Domain.Kiwi;
import KiwiClub.KiwiClub.Domain.KiwiSpecies;
import KiwiClub.KiwiClub.Domain.Sex;
import KiwiClub.KiwiClub.Repository.KiwiRepository;
import KiwiClub.KiwiClub.dto.KiwiDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.Optional;

@Service
public class KiwiServiceImplementation implements KiwiService{
    @Autowired
    private KiwiRepository kiwiRepository;
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
        kiwiRepository.save(kiwi);
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
    public void updateKiwi(Kiwi kiwi) {
        kiwiRepository.save(kiwi);
    }

}
