package com.ma.bakingrecipes.data.database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.ma.bakingrecipes.model.Recipe;

/**
 * Created by amatanat.
 */

@Dao
public interface RecipeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Recipe... recipeEntries);

    @Query("SELECT * from recipe WHERE name = :name")
    LiveData<Recipe> getRecipeByName(String name);
}
