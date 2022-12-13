package KiwiClub.KiwiClub.Service;

import KiwiClub.KiwiClub.Domain.Kiwi;
import KiwiClub.KiwiClub.dto.KiwiDto;

public interface KiwiService {
    void saveKiwi(KiwiDto kiwiDto);
    Kiwi findByUserId(Long userId);
}
