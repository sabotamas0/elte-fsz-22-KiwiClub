package KiwiClub.KiwiClub.Repository;

import KiwiClub.KiwiClub.Domain.Kiwi;
import KiwiClub.KiwiClub.Domain.LearnedTricks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface LearnedTricksRepository extends CrudRepository<LearnedTricks, UUID> {

}