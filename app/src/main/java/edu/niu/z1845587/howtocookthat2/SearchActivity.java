package edu.niu.z1845587.howtocookthat2;

import static edu.niu.z1845587.howtocookthat2.MainActivity.INTENTKEY_RECIPETV;
import static edu.niu.z1845587.howtocookthat2.MainActivity.INTENTKEY_TITLETV;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    // List View object
    ListView listView;

    // Define array adapter for ListView
    ArrayAdapter<String> adapter;

    // Define array List for List View data
    ArrayList<String> mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // initialize ListView with id
        listView = findViewById(R.id.listView);

        // Add items to Array List
        mylist = new ArrayList<>();
        mylist.add("Scrambled Eggs");
        mylist.add("Fried Eggs");
        mylist.add("Pork Loin");
        mylist.add("Pork Chops");
        mylist.add("Spam Bowl");
        mylist.add("Spicy Tuna Onigiri");
        mylist.add("Mac and Cheese");
        mylist.add("Chocolate Cake");
        mylist.add("Strawberry Cheesecake");
        mylist.add("Birthday Cake");
        mylist.add("Key Lime Pie");
        mylist.add("Apple Pie");

        // Set adapter to ListView
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mylist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        //Toast.makeText(getApplicationContext(), (String)parent.getItemAtPosition(position), Toast.LENGTH_LONG).show();
                        Intent scrambledEggs = new Intent(SearchActivity.this,RecipeActivity.class);

                        scrambledEggs.putExtra(INTENTKEY_TITLETV, "Scrambled Eggs");
                        scrambledEggs.putExtra("image", R.drawable.scrambled_eggs);
                        scrambledEggs.putExtra(INTENTKEY_RECIPETV, getResources().getString(R.string.scrambledEggs));

                        startActivity(scrambledEggs);
                        break;
                    case 1:
                        Intent friedEggs = new Intent(SearchActivity.this,RecipeActivity.class);

                        friedEggs.putExtra(INTENTKEY_TITLETV, "Fried Eggs");
                        friedEggs.putExtra("image", R.drawable.fried_eggs);
                        friedEggs.putExtra(INTENTKEY_RECIPETV,getResources().getString(R.string.friedEggs));

                        startActivity(friedEggs);
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate menu with items using MenuInflator
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        // Initialise menu item search bar
        // with id and take its object
        MenuItem searchViewItem = menu.findItem(R.id.search_bar);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchViewItem);

        // attach setOnQueryTextListener
        // to search view defined above
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            // Override onQueryTextSubmit method which is call when submit query is searched
            @Override
            public boolean onQueryTextSubmit(String query) {
                listView.setVisibility(View.VISIBLE);
                // If the list contains the search query than filter the adapter
                // using the filter method with the query as its argument
                if (mylist.contains(query)) {
                    adapter.getFilter().filter(query);
                }
                return false;
            }

            // This method is overridden to filter the adapter according
            // to a search query when the user is typing search
            @Override
            public boolean onQueryTextChange(String newText) {
                listView.setVisibility(View.VISIBLE);
                adapter.getFilter().filter(newText);
                return false;
            }

        });
        return super.onCreateOptionsMenu(menu);
    }
}
