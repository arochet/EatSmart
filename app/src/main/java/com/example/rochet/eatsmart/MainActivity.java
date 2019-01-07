package com.example.rochet.eatsmart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonCommencer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Page de bienvenue
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCommencer = findViewById(R.id.buttonCommencer);
    }

    void goToScanActivity(View view) {
        Intent intent = new Intent(this, ScanActivity.class);
        startActivity(intent);
    }

    public void goToPayActivity(View view) {
        Intent intent = new Intent(this, PayActivity.class);
        startActivity(intent);
    }

    public void goToMenuDesignActivity(View view) {
        Intent intent = new Intent(this, MenuDesignActivity.class);
        startActivity(intent);
    }

    public void goToMealActivity(View view) {
        Intent intent = new Intent(this, MealActivity.class);
        startActivity(intent);
    }

    public void goToFoodDetailActivity(View view) {
        Intent intent = new Intent(this, FoodDetailActivity.class);
        startActivity(intent);
    }
}
