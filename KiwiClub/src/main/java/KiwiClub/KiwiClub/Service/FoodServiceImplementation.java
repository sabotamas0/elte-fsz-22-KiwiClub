package KiwiClub.KiwiClub.Service;

import KiwiClub.KiwiClub.Domain.*;
import KiwiClub.KiwiClub.Repository.FoodRepository;
import KiwiClub.KiwiClub.Repository.KiwiRepository;
import KiwiClub.KiwiClub.Repository.UserRepository;
import KiwiClub.KiwiClub.dto.KiwiDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FoodServiceImplementation implements FoodService{

    @Autowired
    private FoodRepository foodRepository;
    @Override
    public void deleteFoodById(Long foodId) {

    }

    @Override
    public Food addFood(Food food) {
        return null;
    }

    @Override
    public Food getFoodByName(String name) {
        return foodRepository.getFoodByName(name);
    }

    @Override
    public List<Food> getAllFoods() {
        List<Food> foods = new ArrayList<>();
        foods.addAll(foodRepository.findAll());
        return foods;
    }
}
