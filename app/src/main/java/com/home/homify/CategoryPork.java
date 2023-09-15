package com.home.homify;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import com.home.homify.databinding.ActivityPorkBinding;

public class CategoryPork extends AppCompatActivity {
    private ActivityPorkBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPorkBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ListView recipeListView = findViewById(R.id.recipeListView);
        DatabaseUtils.loadRecipesByCategory("Sertés", this, recipeListView);
    }
}
