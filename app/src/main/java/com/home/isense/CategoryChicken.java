package com.home.isense;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.home.isense.databinding.ActivityChickenBinding;

public class CategoryChicken extends AppCompatActivity {
    private ActivityChickenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChickenBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ListView recipeListView = findViewById(R.id.recipeListView);
        DatabaseUtils.loadRecipesByCategory(R.string.category_chicken_food, this, recipeListView);
    }
}
