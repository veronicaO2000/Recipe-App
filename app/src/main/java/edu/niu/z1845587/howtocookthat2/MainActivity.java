package edu.niu.z1845587.howtocookthat2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String INTENTKEY_TITLETV = "titleTextView";
    public static final String INTENTKEY_RECIPETV = "recipeTextView";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ScrambledEggs(View view) {
        //create intent that will go to the recipe activity
        Intent recipeIntent = new Intent(edu.niu.z1845587.howtocookthat2.MainActivity.this, RecipeActivity.class);

        recipeIntent.putExtra(INTENTKEY_TITLETV, "Scrambled Eggs");
        recipeIntent.putExtra("image", R.drawable.scrambled_eggs);
        recipeIntent.putExtra(INTENTKEY_RECIPETV, getResources().getString(R.string.scrambledEggs));

        //go to the recipe activity
        startActivity(recipeIntent);
    }

    public void FriedEggs(View view) {
        //create intent that will go to the recipe activity
        Intent recipeIntent = new Intent(edu.niu.z1845587.howtocookthat2.MainActivity.this, RecipeActivity.class);

        recipeIntent.putExtra(INTENTKEY_TITLETV, "Fried Eggs");
        recipeIntent.putExtra("image", R.drawable.fried_eggs);
        recipeIntent.putExtra(INTENTKEY_RECIPETV, getResources().getString(R.string.friedEggs));

        //go to the recipe activity
        startActivity(recipeIntent);
    }

    public void PorkLoin(View view) {
        //create intent that will go to the recipe activity
        Intent recipeIntent = new Intent(edu.niu.z1845587.howtocookthat2.MainActivity.this, RecipeActivity.class);

        recipeIntent.putExtra(INTENTKEY_TITLETV, "Pork Loin");
        recipeIntent.putExtra("image", R.drawable.pork_loin);
        recipeIntent.putExtra(INTENTKEY_RECIPETV, getResources().getString(R.string.porkLoin));

        //go to the recipe activity
        startActivity(recipeIntent);
    }

    public void PorkChops(View view) {
        //create intent that will go to the recipe activity
        Intent recipeIntent = new Intent(edu.niu.z1845587.howtocookthat2.MainActivity.this, RecipeActivity.class);

        recipeIntent.putExtra(INTENTKEY_TITLETV, "Pork Chops");
        recipeIntent.putExtra("image", R.drawable.pork_chops);
        recipeIntent.putExtra(INTENTKEY_RECIPETV, getResources().getString(R.string.porkChops));

        //go to the recipe activity
        startActivity(recipeIntent);
    }

    public void SpamBowl(View view) {
        //create intent that will go to the recipe activity
        Intent recipeIntent = new Intent(edu.niu.z1845587.howtocookthat2.MainActivity.this, RecipeActivity.class);

        recipeIntent.putExtra(INTENTKEY_TITLETV, "Spam Bowl");
        recipeIntent.putExtra("image", R.drawable.spam_bowls);
        recipeIntent.putExtra(INTENTKEY_RECIPETV, getResources().getString(R.string.spamBowl));

        //go to the recipe activity
        startActivity(recipeIntent);
    }

    public void SpicyTuna(View view) {
        //create intent that will go to the recipe activity
        Intent recipeIntent = new Intent(edu.niu.z1845587.howtocookthat2.MainActivity.this, RecipeActivity.class);

        recipeIntent.putExtra(INTENTKEY_TITLETV, "Spicy Tuna Onigiri");
        recipeIntent.putExtra("image", R.drawable.spicy_tuna_onigiri);
        recipeIntent.putExtra(INTENTKEY_RECIPETV, getResources().getString(R.string.spicyTunaOnigiri));

        //go to the recipe activity
        startActivity(recipeIntent);
    }

    public void MacAndCheese(View view) {
        //create intent that will go to the recipe activity
        Intent recipeIntent = new Intent(edu.niu.z1845587.howtocookthat2.MainActivity.this, RecipeActivity.class);

        recipeIntent.putExtra(INTENTKEY_TITLETV, "Mac and Cheese");
        recipeIntent.putExtra("image", R.drawable.mac_and_cheese);
        recipeIntent.putExtra(INTENTKEY_RECIPETV, getResources().getString(R.string.mac));

        //go to the recipe activity
        startActivity(recipeIntent);
    }

    public void ChocolateCake(View view) {
        //create intent that will go to the recipe activity
        Intent recipeIntent = new Intent(edu.niu.z1845587.howtocookthat2.MainActivity.this, RecipeActivity.class);

        recipeIntent.putExtra(INTENTKEY_TITLETV, "Chocolate Cake");
        recipeIntent.putExtra("image", R.drawable.chocolate_cake);
        recipeIntent.putExtra(INTENTKEY_RECIPETV, getResources().getString(R.string.chocolate));

        //go to the recipe activity
        startActivity(recipeIntent);
    }

    public void StrawberryCheesecake(View view) {
        //create intent that will go to the recipe activity
        Intent recipeIntent = new Intent(edu.niu.z1845587.howtocookthat2.MainActivity.this, RecipeActivity.class);

        recipeIntent.putExtra(INTENTKEY_TITLETV, "Strawberry Cheesecake");
        recipeIntent.putExtra("image", R.drawable.strawberry_cheesecake);
        recipeIntent.putExtra(INTENTKEY_RECIPETV, getResources().getString(R.string.cheesecake));

        //go to the recipe activity
        startActivity(recipeIntent);
    }

    public void BirthdayCake(View view) {
        //create intent that will go to the recipe activity
        Intent recipeIntent = new Intent(edu.niu.z1845587.howtocookthat2.MainActivity.this, RecipeActivity.class);

        recipeIntent.putExtra(INTENTKEY_TITLETV, "Birthday Cake");
        recipeIntent.putExtra("image", R.drawable.birthday_cake);
        recipeIntent.putExtra(INTENTKEY_RECIPETV, getResources().getString(R.string.birthday));

        //go to the recipe activity
        startActivity(recipeIntent);
    }

    public void KeyLime(View view) {
        //create intent that will go to the recipe activity
        Intent recipeIntent = new Intent(edu.niu.z1845587.howtocookthat2.MainActivity.this, RecipeActivity.class);

        recipeIntent.putExtra(INTENTKEY_TITLETV, "Key Lime Pie");
        recipeIntent.putExtra("image", R.drawable.key_lime_pie);
        recipeIntent.putExtra(INTENTKEY_RECIPETV, getResources().getString(R.string.key_lime));

        //go to the recipe activity
        startActivity(recipeIntent);
    }

    public void ApplePie(View view) {
        //create intent that will go to the recipe activity
        Intent recipeIntent = new Intent(edu.niu.z1845587.howtocookthat2.MainActivity.this, RecipeActivity.class);

        recipeIntent.putExtra(INTENTKEY_TITLETV, "Apple Pie");
        recipeIntent.putExtra("image", R.drawable.apple_pie);
        recipeIntent.putExtra(INTENTKEY_RECIPETV, getResources().getString(R.string.apple));

        //go to the recipe activity
        startActivity(recipeIntent);
    }
}