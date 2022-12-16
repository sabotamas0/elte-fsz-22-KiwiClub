package KiwiClub.KiwiClub.Repository;

import KiwiClub.KiwiClub.Domain.Food;
import KiwiClub.KiwiClub.Domain.Kiwi;
import KiwiClub.KiwiClub.Domain.Trick;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface FoodRepository extends CrudRepository<Food, Long> {
    List<Food> findAll();
    Food getFoodByName(String name);
}