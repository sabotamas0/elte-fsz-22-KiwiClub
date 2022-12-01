package KiwiClub.KiwiClub.Repository;

import KiwiClub.KiwiClub.Domain.Trick;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TrickRepository extends CrudRepository<Trick, UUID> {
    Trick getTrickByName(String name); //felhasznalo altal definialt
}