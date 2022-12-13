package KiwiClub.KiwiClub.Service;

import KiwiClub.KiwiClub.Domain.Kiwi;
import KiwiClub.KiwiClub.Domain.User;
import KiwiClub.KiwiClub.Repository.KiwiRepository;
import KiwiClub.KiwiClub.Repository.UserRepository;
import KiwiClub.KiwiClub.dto.KiwiDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KiwiServiceImplementation implements KiwiService{
    @Autowired
    private KiwiRepository kiwiRepository;
    @Override
    public void saveKiwi(KiwiDto kiwiDto) {
        Kiwi kiwi = new Kiwi();
        //TODO
        kiwiRepository.save(kiwi);
    }

    @Override
    public Kiwi findByUserId(Long userId) {
        return kiwiRepository.getKiwiByUserId(userId);
    }
}
