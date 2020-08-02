package com.example.exetasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FoodSteps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_steps);
        //ανάκτηση της πρόθεσης
        Intent intent = getIntent();
        //ανάκτηση του φαγητού
        String f = intent.getStringExtra("food");
        //ανάκτηση του textview για την εμφάνιση των βημάτων
        // προετοιμασίας του φαγητού
        TextView foodStepsTextView = (TextView) findViewById(R.id.food_steps);
        if (f.equals("ΑΥΓΑ ΤΗΓΑΝΗΤΑ")) {

            foodStepsTextView.setText("Βήματα προετοιμασίας της συνταγής ΑΥΓΑ ΤΗΓΑΝΗΤΑ");
        }
        else if (f.equals("ΠΑΤΑΤΕΣ ΤΗΓΑΝΗΤΕΣ")) {
            foodStepsTextView.setText("Βήματα προετοιμασίας της συνταγής ΠΑΤΑΤΕΣ ΤΗΓΑΝΗΤΕΣ");
        }
        else if (f.equals("ΦΑΣΟΛΙΑ ΣΟΥΠΑ")) {
            foodStepsTextView.setText("Βήματα προετοιμασίας της συνταγής ΦΑΣΟΛΙΑ ΣΟΥΠΑ");
        }
    }
}
