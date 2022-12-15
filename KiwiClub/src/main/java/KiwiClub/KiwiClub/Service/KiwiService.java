package KiwiClub.KiwiClub.Service;

import KiwiClub.KiwiClub.Domain.Kiwi;
import KiwiClub.KiwiClub.dto.KiwiDto;

import java.util.Optional;

public interface KiwiService {
    void saveKiwi(KiwiDto kiwiDto);
    Kiwi findByUserId(Long userId);
    Optional<Kiwi> findById(Long kiwiId);

    void updateKiwi(Kiwi kiwi);
}
