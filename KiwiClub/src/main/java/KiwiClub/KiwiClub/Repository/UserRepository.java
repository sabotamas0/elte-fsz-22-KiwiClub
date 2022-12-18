package KiwiClub.KiwiClub.Repository;

import KiwiClub.KiwiClub.Domain.User;
import KiwiClub.KiwiClub.QueryResult.JoinedLecture;
import KiwiClub.KiwiClub.QueryResult.UserBalance;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
    User findByName(String name);


}
