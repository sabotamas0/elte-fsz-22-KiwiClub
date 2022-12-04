package KiwiClub.KiwiClub.Repository;

import KiwiClub.KiwiClub.Domain.MiniGame;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MiniGameRepository extends CrudRepository<MiniGame, UUID> {

}