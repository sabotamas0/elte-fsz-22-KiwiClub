package KiwiClub.KiwiClub.Repository;

import KiwiClub.KiwiClub.Domain.Trick;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TrickRepository extends CrudRepository<Trick, Long> {
    Trick getTrickByName(String name); //felhasznalo altal definialt
    List<Trick> findAll();
}