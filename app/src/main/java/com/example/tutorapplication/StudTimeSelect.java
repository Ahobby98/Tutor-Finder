package com.example.tutorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.tutorapplication.MyApplication.timesScheduled;

public class StudTimeSelect extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stud_time_select);

        final Button b0 = findViewById(R.id.button0);
        final Button b1 = findViewById(R.id.button1);
        final Button b2 = findViewById(R.id.button2);
        final Button b3 = findViewById(R.id.button3);
        final Button submit = findViewById(R.id.submitButton);

        if(timesScheduled[0]) {
            b0.setBackgroundResource(R.drawable.my_button_bg_final);
        }
        if(timesScheduled[1]) {
            b1.setBackgroundResource(R.drawable.my_button_bg_final);
        }
        if(timesScheduled[2]) {
            b2.setBackgroundResource(R.drawable.my_button_bg_final);
        }
        if(timesScheduled[3]) {
            b3.setBackgroundResource(R.drawable.my_button_bg_final);
        }

        //time 0
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean check = checkIfScheduled(timesScheduled);
                if (!timesScheduled[0] && !check) { //if this time slot has not been scheduled
                                                    // yet and student has no other sessions
                        b0.setBackgroundResource(R.drawable.my_button_bg_final);
                        timesScheduled[0] = true;
                } else {
                    b0.setBackgroundResource(R.drawable.my_button_bg);
                    timesScheduled[0] = false;
                }
            }
        });

        //time 1
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean check = checkIfScheduled(timesScheduled);
                if (!timesScheduled[1] && !check) { //if this time slot has not been scheduled
                    // yet and student has no other sessions
                    b1.setBackgroundResource(R.drawable.my_button_bg_final);
                    timesScheduled[1] = true;
                } else {
                    b1.setBackgroundResource(R.drawable.my_button_bg);
                    timesScheduled[1] = false;
                }
            }
        });

        //time 2
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean check = checkIfScheduled(timesScheduled);
                if (!timesScheduled[2] && !check) { //if this time slot has not been scheduled
                    // yet and student has no other sessions
                    b2.setBackgroundResource(R.drawable.my_button_bg_final);
                    timesScheduled[2] = true;
                } else {
                    b2.setBackgroundResource(R.drawable.my_button_bg);
                    timesScheduled[2] = false;
                }
            }
        });

        //time 3
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean check = checkIfScheduled(timesScheduled);
                if (!timesScheduled[3] && !check) { //if this time slot has not been scheduled
                    // yet and student has no other sessions
                    b3.setBackgroundResource(R.drawable.my_button_bg_final);
                    timesScheduled[3] = true;
                } else {
                    b3.setBackgroundResource(R.drawable.my_button_bg);
                    timesScheduled[3] = false;
                }
            }
        });

        //submit button
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), HomeScreen.class);
                startActivityForResult(myIntent, 0);
            }
        });


    }

    public boolean checkIfScheduled(Boolean[] times) {
        for(boolean t: times) {
            if (t)
                return true;
        }
        return false;
    }




}