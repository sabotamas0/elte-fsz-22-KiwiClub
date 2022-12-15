package KiwiClub.KiwiClub.Repository;

import KiwiClub.KiwiClub.Domain.Kiwi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface KiwiRepository extends CrudRepository<Kiwi, Long> {
	Kiwi getKiwiByUserId(Long UserId);
}