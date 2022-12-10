package KiwiClub.KiwiClub.Service;
import KiwiClub.KiwiClub.Domain.Trick;

import java.util.List;
import java.util.UUID;

public interface TrickService {
    void deleteTrickById(Long trickId);
    Trick addTrick(Trick trick);
    Trick getTrickByName(String name);
    List<Trick> getAllTricks();
}
