package KiwiClub.KiwiClub.Repository;

import KiwiClub.KiwiClub.Domain.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface PlayerRepository extends CrudRepository<Player, UUID> {

}
