package com.example.tutorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import static com.example.tutorapplication.R.id.spinner2;
import static com.example.tutorapplication.MyApplication.selectedDayStudent;

public class StudDaySelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stud_day_select);

        final Spinner mySpinner = (Spinner) findViewById(spinner2);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(StudDaySelect.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.day));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);


        Button next = findViewById(R.id.submitButton);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                selectedDayStudent = mySpinner.getSelectedItem().toString();
                if(selectedDayStudent.equals("Monday")) {
                    Intent myIntent = new Intent(view.getContext(), StudTimeSelect.class);
                    startActivityForResult(myIntent, 0);
                }
            }

        });
    }

}
