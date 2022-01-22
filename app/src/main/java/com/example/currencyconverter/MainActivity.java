package com.example.currencyconverter;

import android.content.Intent;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.currencyconverter.databinding.ActivityMainBinding;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    Spinner to;
    Spinner from;
    EditText amount;
    Double total;
    TextView amountResult;
    Button buttonList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        amountResult = findViewById(R.id.result);
        amount = findViewById(R.id.convAmount);
        to = findViewById(R.id.to_spinner);
        from = findViewById(R.id.from_spinner);
        buttonList = findViewById(R.id.button1);

        String[] currenciesFrom = {"EUR", "USD", "SEK", "GBP", "CNY", "JPY", "KRW"};
        ArrayAdapter ad = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, currenciesFrom);
        from.setAdapter(ad);

        String[] currenciesTo = {"EUR", "USD", "SEK", "GBP", "CNY", "JPY", "KRW"};
        ArrayAdapter ad2 = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, currenciesTo);
        to.setAdapter(ad2);

        amount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (amount.getText().length() < 1) {
                    amountResult.setText("");
                    return;
                }
                double amountDouble = Double.parseDouble((amount.getText().toString()));
                if (from.getSelectedItem().toString() == to.getSelectedItem().toString()) {
                    total = amountDouble;
                }
                //EUR
                if (from.getSelectedItem().toString() == "EUR" && to.getSelectedItem().toString() == "SEK") {
                    total = amountDouble * 10.11;
                }
                if (from.getSelectedItem().toString() == "EUR" && to.getSelectedItem().toString() == "USD") {
                    total = amountDouble * 1.13;
                }
                if (from.getSelectedItem().toString() == "EUR" && to.getSelectedItem().toString() == "GBP") {
                    total = amountDouble * 0.84;
                }
                if (from.getSelectedItem().toString() == "EUR" && to.getSelectedItem().toString() == "CNY") {
                    total = amountDouble * 7.19;
                }
                if (from.getSelectedItem().toString() == "EUR" && to.getSelectedItem().toString() == "JPY") {
                    total = amountDouble * 129.24;
                }
                if (from.getSelectedItem().toString() == "EUR" && to.getSelectedItem().toString() == "KRW") {
                    total = amountDouble * 1338.22;
                }

                //SEK
                if (from.getSelectedItem().toString() == "SEK" && to.getSelectedItem().toString() == "EUR") {
                    total = amountDouble * 0.099;
                }
                if (from.getSelectedItem().toString() == "SEK" && to.getSelectedItem().toString() == "USD") {
                    total = amountDouble * 0.11;
                }
                if (from.getSelectedItem().toString() == "SEK" && to.getSelectedItem().toString() == "GBP") {
                    total = amountDouble * 0.083;
                }
                if (from.getSelectedItem().toString() == "SEK" && to.getSelectedItem().toString() == "CNY") {
                    total = amountDouble * 0.71;
                }
                if (from.getSelectedItem().toString() == "SEK" && to.getSelectedItem().toString() == "JPY") {
                    total = amountDouble * 12.78;
                }
                if (from.getSelectedItem().toString() == "SEK" && to.getSelectedItem().toString() == "KRW") {
                    total = amountDouble * 132.32;
                }

                //USD
                if (from.getSelectedItem().toString() == "USD" && to.getSelectedItem().toString() == "EUR") {
                    total = amountDouble * 0.89;
                }
                if (from.getSelectedItem().toString() == "USD" && to.getSelectedItem().toString() == "GBP") {
                    total = amountDouble * 0.75;
                }
                if (from.getSelectedItem().toString() == "USD" && to.getSelectedItem().toString() == "SEK") {
                    total = amountDouble * 8.98;
                }
                if (from.getSelectedItem().toString() == "USD" && to.getSelectedItem().toString() == "CNY") {
                    total = amountDouble * 6.39;
                }
                if (from.getSelectedItem().toString() == "USD" && to.getSelectedItem().toString() == "JPY") {
                    total = amountDouble * 114.80;
                }
                if (from.getSelectedItem().toString() == "USD" && to.getSelectedItem().toString() == "KRW") {
                    total = amountDouble * 1188.60;
                }

                //GBP
                if (from.getSelectedItem().toString() == "GBP" && to.getSelectedItem().toString() == "EUR") {
                    total = amountDouble * 1.19;

                }
                if (from.getSelectedItem().toString() == "GBP" && to.getSelectedItem().toString() == "SEK") {
                    total = amountDouble * 12.01;
                }
                if (from.getSelectedItem().toString() == "GBP" && to.getSelectedItem().toString() == "USD") {
                    total = amountDouble * 1.34;
                }
                if (from.getSelectedItem().toString() == "GBP" && to.getSelectedItem().toString() == "CNY") {
                    total = amountDouble * 8.54;
                }
                if (from.getSelectedItem().toString() == "GBP" && to.getSelectedItem().toString() == "JPY") {
                    total = amountDouble * 153.50;
                }
                if (from.getSelectedItem().toString() == "GBP" && to.getSelectedItem().toString() == "KRW") {
                    total = amountDouble * 1589.34;
                }

                //CNY
                if (from.getSelectedItem().toString() == "CNY" && to.getSelectedItem().toString() == "EUR") {
                    total = amountDouble * 0.14;
                }
                if (from.getSelectedItem().toString() == "CNY" && to.getSelectedItem().toString() == "SEK") {
                    total = amountDouble * 1.41;
                }
                if (from.getSelectedItem().toString() == "CNY" && to.getSelectedItem().toString() == "USD") {
                    total = amountDouble * 0.16;
                }
                if (from.getSelectedItem().toString() == "CNY" && to.getSelectedItem().toString() == "GBP") {
                    total = amountDouble * 0.12;
                }
                if (from.getSelectedItem().toString() == "CNY" && to.getSelectedItem().toString() == "JPY") {
                    total = amountDouble * 17.97;
                }
                if (from.getSelectedItem().toString() == "CNY" && to.getSelectedItem().toString() == "KRW") {
                    total = amountDouble * 186.07;
                }

                //JPY
                if (from.getSelectedItem().toString() == "JPY" && to.getSelectedItem().toString() == "EUR") {
                    total = amountDouble * 0.0077;
                }
                if (from.getSelectedItem().toString() == "JPY" && to.getSelectedItem().toString() == "SEK") {
                    total = amountDouble * 0.078;
                }
                if (from.getSelectedItem().toString() == "JPY" && to.getSelectedItem().toString() == "USD") {
                    total = amountDouble * 0.0087;
                }
                if (from.getSelectedItem().toString() == "JPY" && to.getSelectedItem().toString() == "GBP") {
                    total = amountDouble * 0.0065;
                }
                if (from.getSelectedItem().toString() == "JPY" && to.getSelectedItem().toString() == "CNY") {
                    total = amountDouble * 0.056;
                }
                if (from.getSelectedItem().toString() == "JPY" && to.getSelectedItem().toString() == "KRW") {
                    total = amountDouble * 10.35;
                }

                //KRW
                if (from.getSelectedItem().toString() == "KRW" && to.getSelectedItem().toString() == "EUR") {
                    total = amountDouble * 0.00075;
                }
                if (from.getSelectedItem().toString() == "KRW" && to.getSelectedItem().toString() == "SEK") {
                    total = amountDouble * 0.0076;
                }
                if (from.getSelectedItem().toString() == "KRW" && to.getSelectedItem().toString() == "USD") {
                    total = amountDouble * 0.00084;
                }
                if (from.getSelectedItem().toString() == "KRW" && to.getSelectedItem().toString() == "GBP") {
                    total = amountDouble * 0.00063;
                }
                if (from.getSelectedItem().toString() == "KRW" && to.getSelectedItem().toString() == "CNY") {
                    total = amountDouble * 0.0054;
                }
                if (from.getSelectedItem().toString() == "KRW" && to.getSelectedItem().toString() == "JPY") {
                    total = amountDouble * 0.097;
                }
                String amountString= Double.toString(total);
                amountResult.setText(amountString);
            }
        });
        buttonList.setOnClickListener(v -> openListActivity());
    }
    private void openListActivity() {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }
}
