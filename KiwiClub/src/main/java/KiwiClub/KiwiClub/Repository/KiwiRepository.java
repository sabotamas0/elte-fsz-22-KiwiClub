package KiwiClub.KiwiClub.Repository;

import KiwiClub.KiwiClub.Domain.Kiwi;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface KiwiRepository extends CrudRepository<Kiwi, Long> {
	Kiwi getKiwiByUserId(Long UserId);
	/*
	@Query("select NEW Kiwi (k as guid ...
			, o.name as organisationName)
	from person p left join p.organisation o")


	List<PersonOrganization> findPersonWithOrganization();

	 */
}