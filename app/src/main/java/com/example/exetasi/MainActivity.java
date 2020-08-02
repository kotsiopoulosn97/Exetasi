package com.example.exetasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickFindIngredients(View view) {
        TextView ingredients = (TextView) findViewById(R.id.ingredients);
        Spinner foods = (Spinner) findViewById(R.id.food);
        String food = String.valueOf(foods.getSelectedItem());
        FoodIngredients fi = new FoodIngredients();
        List<String> ingredientNames = fi.getIngredients(food);
        StringBuilder sb = new StringBuilder();
        for (String ingredientName : ingredientNames) {
            sb.append(ingredientName).append('\n');
        }
        ingredients.setText(sb);
        int price = fi.getPrice(food);
        TextView pricetv = (TextView) findViewById(R.id.price);
        pricetv.setText("Τιμή: "+price+" ευρώ");
    }
    public void onClickShowFoodSteps(View view) {
        //Ανάκτησε μία αναφορά στο αντικείμενο Spinner
        // στο οποίο υπάρχει η επιλεγμένη τροφή
        Spinner f = (Spinner) findViewById(R.id.food);
        //Ανάκτησε την επιλεγμένη τροφή του Spinner
        String food = String.valueOf(f.getSelectedItem());
        //δημιουργία του επώνυμου Intent για την κλάση FoodSteps
        Intent intent = new Intent(this, FoodSteps.class);
        //τοποθέητηση της έξτρα πληροφορίας για την πρόθεση με το όνομα food
        intent.putExtra("food", food);
        //εκκίνηση της δραστηριότητας
        startActivity(intent);

    }
}
