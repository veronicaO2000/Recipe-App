package edu.niu.z1845587.howtocookthat2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeActivity extends AppCompatActivity {
    private TextView titleTV, recipeTV;
    ImageView imageView;
    int imagevalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        titleTV = findViewById(R.id.titleTextView);
        recipeTV = findViewById(R.id.recipeTextView);

        imageView = findViewById(R.id.recipeImageView);

        if (this.getIntent().getStringExtra(MainActivity.INTENTKEY_TITLETV) != null)
            titleTV.setText(this.getIntent().getStringExtra(MainActivity.INTENTKEY_TITLETV));

        Bundle bundle = getIntent().getExtras();

        // if bundle is not null then get the image value
        if (bundle != null) {
            imagevalue = bundle.getInt("image");
        }
        imageView.setImageResource(imagevalue);

        if (this.getIntent().getStringExtra(MainActivity.INTENTKEY_RECIPETV) != null)
            recipeTV.setText(this.getIntent().getStringExtra(MainActivity.INTENTKEY_RECIPETV));
    }

    //method to handle the button click
    public void goBack(View view)
    {
        //return to the meal activity
        finish();
    }//end goBack
}
