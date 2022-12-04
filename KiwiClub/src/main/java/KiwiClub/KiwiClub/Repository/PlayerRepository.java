package KiwiClub.KiwiClub.Repository;

import KiwiClub.KiwiClub.Domain.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlayerRepository extends CrudRepository<Player, UUID> {

}
