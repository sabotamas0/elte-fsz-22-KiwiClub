package KiwiClub.KiwiClub.Service;

import KiwiClub.KiwiClub.QueryResult.JoinedLecture;
import KiwiClub.KiwiClub.Domain.Kiwi;
import KiwiClub.KiwiClub.dto.KiwiDto;

import java.util.List;
import java.util.Optional;

public interface KiwiService {
    void saveKiwi(KiwiDto kiwiDto);
    Kiwi findByUserId(Long userId);
    Optional<Kiwi> findById(Long kiwiId);

    List<JoinedLecture> getJoinedLectures(Long kiwiId, Long trickId);
    void updateKiwi(Kiwi kiwi);
}
