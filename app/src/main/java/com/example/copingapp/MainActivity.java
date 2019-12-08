package com.example.copingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void runQuotes(View view) {
        Intent intent = new Intent(this, quotes.class);
        startActivity(intent);
    }

    public void runDogs(View view) {
        Intent intent = new Intent(this, dogs.class);
        startActivity(intent);
    }

    public void runJokes(View view) {
        Intent intent = new Intent(this, jokes.class);
        startActivity(intent);
    }

    public void runActivities(View view) {
        Intent intent = new Intent(this, activities.class);
        startActivity(intent);
    }
}
