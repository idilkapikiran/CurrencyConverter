package com.example.currencyconverter;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.currencyconverter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    Spinner to;
    Spinner from;
    EditText amount1;
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        amount1 = findViewById(R.id.amount);
        to = findViewById(R.id.to_spinner);
        from = findViewById(R.id.from_spinner);
        but = findViewById(R.id.button1);

        String[] f = {"EUR", "SEK", "USD", "GBP", "CNY", "JPY", "KRW"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, f);
        from.setAdapter(ad);

        String[] t = {"EUR", "SEK", "USD", "GBP", "CNY", "JPY", "KRW"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, t);
        to.setAdapter(ad1);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double total;
                Double amount = Double.parseDouble((amount1.getText().toString()));

                if (from.getSelectedItem().toString() == to.getSelectedItem().toString()) {
                    total = amount;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }

                //EUR
                if (from.getSelectedItem().toString() == "EUR" && to.getSelectedItem().toString() == "SEK") {
                    total = amount * 10.11;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "EUR" && to.getSelectedItem().toString() == "USD") {
                    total = amount * 1.13;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "EUR" && to.getSelectedItem().toString() == "GBP") {
                    total = amount * 0.84;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "EUR" && to.getSelectedItem().toString() == "CNY") {
                    total = amount * 7.19;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "EUR" && to.getSelectedItem().toString() == "JPY") {
                    total = amount * 129.24;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "EUR" && to.getSelectedItem().toString() == "KRW") {
                    total = amount * 1338.22;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }

                //SEK
                if (from.getSelectedItem().toString() == "SEK" && to.getSelectedItem().toString() == "EUR") {
                    total = amount * 0.099;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "SEK" && to.getSelectedItem().toString() == "USD") {
                    total = amount * 0.11;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "SEK" && to.getSelectedItem().toString() == "GBP") {
                    total = amount * 0.083;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "SEK" && to.getSelectedItem().toString() == "CNY") {
                    total = amount * 0.71;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "SEK" && to.getSelectedItem().toString() == "JPY") {
                    total = amount * 12.78;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "SEK" && to.getSelectedItem().toString() == "KRW") {
                    total = amount * 132.32;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }

                //USD
                if (from.getSelectedItem().toString() == "USD" && to.getSelectedItem().toString() == "EUR") {
                    total = amount * 0.89;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "USD" && to.getSelectedItem().toString() == "GBP") {
                    total = amount * 0.75;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "USD" && to.getSelectedItem().toString() == "SEK") {
                    total = amount * 8.98;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "USD" && to.getSelectedItem().toString() == "CNY") {
                    total = amount * 6.39;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "USD" && to.getSelectedItem().toString() == "JPY") {
                    total = amount * 114.80;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "USD" && to.getSelectedItem().toString() == "KRW") {
                    total = amount * 1188.60;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }

                //GBP
                if (from.getSelectedItem().toString() == "GBP" && to.getSelectedItem().toString() == "EUR") {
                    total = amount * 1.19;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "GBP" && to.getSelectedItem().toString() == "SEK") {
                    total = amount * 12.01;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "GBP" && to.getSelectedItem().toString() == "USD") {
                    total = amount * 1.34;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "GBP" && to.getSelectedItem().toString() == "CNY") {
                    total = amount * 8.54;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "GBP" && to.getSelectedItem().toString() == "JPY") {
                    total = amount * 153.50;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "GBP" && to.getSelectedItem().toString() == "KRW") {
                    total = amount * 1589.34;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }

                //CNY
                if (from.getSelectedItem().toString() == "CNY" && to.getSelectedItem().toString() == "EUR") {
                    total = amount * 0.14;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "CNY" && to.getSelectedItem().toString() == "SEK") {
                    total = amount * 1.41;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "CNY" && to.getSelectedItem().toString() == "USD") {
                    total = amount * 0.16;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "CNY" && to.getSelectedItem().toString() == "GBP") {
                    total = amount * 0.12;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "CNY" && to.getSelectedItem().toString() == "JPY") {
                    total = amount * 17.97;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "CNY" && to.getSelectedItem().toString() == "KRW") {
                    total = amount * 186.07;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }

                //JPY
                if (from.getSelectedItem().toString() == "JPY" && to.getSelectedItem().toString() == "EUR") {
                    total = amount * 0.0077;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "JPY" && to.getSelectedItem().toString() == "SEK") {
                    total = amount * 0.078;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "JPY" && to.getSelectedItem().toString() == "USD") {
                    total = amount * 0.0087;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "JPY" && to.getSelectedItem().toString() == "GBP") {
                    total = amount * 0.0065;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "JPY" && to.getSelectedItem().toString() == "CNY") {
                    total = amount * 0.056;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "JPY" && to.getSelectedItem().toString() == "KRW") {
                    total = amount * 10.35;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }

                //KRW
                if (from.getSelectedItem().toString() == "KRW" && to.getSelectedItem().toString() == "EUR") {
                    total = amount * 0.00075;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "KRW" && to.getSelectedItem().toString() == "SEK") {
                    total = amount * 0.0076;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "KRW" && to.getSelectedItem().toString() == "USD") {
                    total = amount * 0.00084;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "KRW" && to.getSelectedItem().toString() == "GBP") {
                    total = amount * 0.00063;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "KRW" && to.getSelectedItem().toString() == "CNY") {
                    total = amount * 0.0054;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (from.getSelectedItem().toString() == "KRW" && to.getSelectedItem().toString() == "JPY") {
                    total = amount * 0.097;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

