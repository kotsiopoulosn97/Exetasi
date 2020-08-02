package com.example.exetasi;

import java.util.ArrayList;
import java.util.List;

public class FoodIngredients {
    public List<String> getIngredients(String food) {
        List<String> ingredients = new ArrayList<>();
        if (food.equals("ΑΥΓΑ ΤΗΓΑΝΗΤΑ")) {
            ingredients.add("ΑΥΓΑ");
            ingredients.add("ΛΑΔΙ");
            ingredients.add("ΑΛΑΤΙ");
            ingredients.add("ΠΙΠΕΡΙ");
        }
        else if (food.equals("ΠΑΤΑΤΕΣ ΤΗΓΑΝΗΤΕΣ")) {
            ingredients.add("ΠΑΤΑΤΕΣ");
            ingredients.add("ΛΑΔΙ");
            ingredients.add("ΑΛΑΤΙ");
            ingredients.add("ΠΙΠΕΡΙ");
        }
        else if (food.equals("ΦΑΣΟΛΙΑ ΣΟΥΠΑ")){
            ingredients.add("ΦΑΣΟΛΙΑ");
            ingredients.add("ΤΟΜΑΤΕΣ");
            ingredients.add("ΛΑΔΙ");
            ingredients.add("ΚΑΡΟΤΑ");
            ingredients.add("ΑΛΑΤΙ");
            ingredients.add("ΠΙΠΕΡΙ");
        }
        return ingredients;
    }
    public int getPrice(String food) {
        if (food.equals("ΑΥΓΑ ΤΗΓΑΝΗΤΑ")) {
            return 7;
        }
        else if (food.equals("ΠΑΤΑΤΕΣ ΤΗΓΑΝΗΤΕΣ")) {
            return 10;
        }
        else if (food.equals("ΦΑΣΟΛΙΑ ΣΟΥΠΑ")){
            return 12;
        }
        return 0;
    }

}
