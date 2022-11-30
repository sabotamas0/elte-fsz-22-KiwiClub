package KiwiClub.KiwiClub.Repository;

import KiwiClub.KiwiClub.Domain.Kiwi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface KiwiRepository extends CrudRepository<Kiwi, UUID> {

}