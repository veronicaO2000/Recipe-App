package edu.niu.z1845587.howtocookthat2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String INTENTKEY_TITLETV = "titleTextView";
    public static final String INTENTKEY_RECIPETV = "recipeTextView";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate menu with items using MenuInflater
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.search) {
            Intent searchIntent = new Intent(edu.niu.z1845587.howtocookthat2.MainActivity.this, SearchActivity.class);
            startActivity(searchIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
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
