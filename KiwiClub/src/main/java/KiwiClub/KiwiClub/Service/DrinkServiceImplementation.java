package KiwiClub.KiwiClub.Service;

import KiwiClub.KiwiClub.Domain.*;
import KiwiClub.KiwiClub.Repository.DrinkRepository;
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
public class DrinkServiceImplementation implements DrinkService{

    @Autowired
    private DrinkRepository drinkRepository;

    @Override
    public void deleteDrinkById(Long drinkId) {

    }

    @Override
    public Drink addDrink(Drink drink) {
        return null;
    }

    @Override
    public Drink getDrinkByName(String name) {
        return drinkRepository.getDrinkByName(name);
    }

    @Override
    public List<Drink> getAllDrinks() {
        List<Drink> drinks = new ArrayList<>();
        drinks.addAll(drinkRepository.findAll());
        return drinks;
    }
}
