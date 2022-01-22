package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListActivity extends AppCompatActivity {

    private ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_dashboard);
        ListView listView;
        listView = findViewById(R.id.listview);
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getUpdateValues());
        listView.setAdapter(arrayAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search, menu);
        MenuItem menuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Search");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    private String[] getUpdateValues() {

        String[] values = {

                "EUR:\n" +
                        "\tUSD: " +1.13 +"\n" +
                        "\tSEK: " + 10.11 +"\n" +
                        "\tGBP: " +  0.84 +"\n" +
                        "\tCNY: " + 7.19 +"\n" +
                        "\tJPY: " + 129.24 +"\n" +
                        "\tKRW: " + 1338.22 +"\n" +
                        "\n",

                "SEK:\n" +
                        "\tEUR: " + 0.099  +"\n" +
                        "\tUSD: " +  0.11 +"\n" +
                        "\tGBP: " +  0.083 +"\n" +
                        "\tCNY: " + 0.71  +"\n" +
                        "\tJPY: " +  12.78 +"\n" +
                        "\tKRW: " + 132.32  +"\n" +
                        "\n",

                "USD:\n" +
                        "\tEUR: " +  0.89 +"\n" +
                        "\tSEK: " + 8.98  +"\n" +
                        "\tGBP: " +  0.75  +"\n" +
                        "\tCNY: " + 6.39  +"\n" +
                        "\tJPY: " +114.80   +"\n" +
                        "\tKRW: " + 1188.60  +"\n" +
                        "\n",

                "GBP:\n" +
                        "\tEUR: " + 1.19 +"\n" +
                        "\tUSD: " + 1.34 +"\n" +
                        "\tSEK: " + 12.01 +"\n" +
                        "\tCNY: " + 8.54 +"\n" +
                        "\tJPY: " + 153.50 +"\n" +
                        "\tKRW: " + 1589.34 +"\n" +
                        "\n",

                "CNY:\n" +
                        "\tEUR: " + 0.14 +"\n" +
                        "\tUSD: " + 0.16+"\n" +
                        "\tSEK: " + 1.41 +"\n" +
                        "\tGBP: " + 0.12 +"\n" +
                        "\tJPY: " + 17.97 +"\n" +
                        "\tKRW: " + 186.07 +"\n" +
                        "\n",

                "JPY:\n" +
                        "\tEUR: " + 0.0077 +"\n" +
                        "\tUSD: " + 0.0087 +"\n" +
                        "\tSEK: " + 0.078 +"\n" +
                        "\tGBP: " +  0.0065+"\n" +
                        "\tCNY: " + 0.056 +"\n" +
                        "\tKRW: " + 10.35 +"\n" +
                        "\n",

                "KRW:\n" +
                        "\tEUR: " + 0.00075 +"\n" +
                        "\tUSD: " + 0.00084 +"\n" +
                        "\tSEK: " + 0.0076 +"\n" +
                        "\tGBP: " + 0.00063 +"\n" +
                        "\tCNY: " + 0.0054 +"\n" +
                        "\tJPY: " + 0.097 +"\n" +
                        "\n",
        };
        return values;
    }
}


