package com.example.tutorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Button tutorOnwards = findViewById(R.id.studButton);
        tutorOnwards.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), StudClassSelect.class);
                startActivityForResult(myIntent, 0);
            }

        });

        Button tutButton = findViewById(R.id.tutButton);
        tutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), TutorTimeSelect.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }
}