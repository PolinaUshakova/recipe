package com.banana.cinemer.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.banana.cinemer.Recipe;
import com.banana.cinemer.R;
import com.banana.cinemer.Recipe;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        Recipe recipe = (Recipe) getIntent().getSerializableExtra("MOVIE");
        getSupportActionBar().setTitle(recipe.title);
    }
}
