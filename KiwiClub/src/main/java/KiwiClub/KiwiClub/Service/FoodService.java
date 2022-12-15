package KiwiClub.KiwiClub.Service;

import KiwiClub.KiwiClub.Domain.Food;
import KiwiClub.KiwiClub.Domain.Trick;

import java.util.List;
import java.util.UUID;

public interface FoodService {
    void deleteFoodById(Long foodId);
    Food addFood(Food food);
    Food getFoodByName(String name);
    List<Food> getAllFoods();
}
