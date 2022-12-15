package KiwiClub.KiwiClub.Service;

import KiwiClub.KiwiClub.Domain.Drink;
import java.util.List;

public interface DrinkService {
    void deleteDrinkById(Long drinkId);
    Drink addDrink(Drink drink);
    Drink getDrinkByName(String name);
    List<Drink> getAllDrinks();
}
