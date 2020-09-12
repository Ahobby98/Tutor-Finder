package com.example.tutorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import static com.example.tutorapplication.R.id.spinner1;

public class DaySelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_select);

        Spinner mySpinner = (Spinner) findViewById(spinner1);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(DaySelect.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.day));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
    }

}
