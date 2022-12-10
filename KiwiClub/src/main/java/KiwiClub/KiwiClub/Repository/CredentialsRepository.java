package KiwiClub.KiwiClub.Repository;
import KiwiClub.KiwiClub.Domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CredentialsRepository extends CrudRepository<User, Long> {

}