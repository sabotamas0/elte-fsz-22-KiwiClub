package KiwiClub.KiwiClub.Repository;

import KiwiClub.KiwiClub.Domain.Drink;
import KiwiClub.KiwiClub.Domain.Food;
import KiwiClub.KiwiClub.Domain.Kiwi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DrinkRepository extends CrudRepository<Drink, Long> {
    List<Drink> findAll();
    Drink getDrinkByName(String name);
}