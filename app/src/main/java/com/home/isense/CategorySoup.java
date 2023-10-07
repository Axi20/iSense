package com.home.isense;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.home.isense.databinding.ActivitySoupBinding;

public class CategorySoup extends AppCompatActivity {
    private ActivitySoupBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySoupBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ListView recipeListView = findViewById(R.id.recipeListView);
        DatabaseUtils.loadRecipesByCategory(R.string.category_soup, this, recipeListView);
    }
}
