package com.example.tutorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.tutorapplication.MyApplication.timesScheduled;

public class TutorTimeSelect extends HomeScreen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_time_select);

        final Button tutB0 = findViewById(R.id.tutButton0);
        final Button tutB1 = findViewById(R.id.tutButton1);
        final Button tutB2 = findViewById(R.id.tutButton2);
        final Button tutB3 = findViewById(R.id.tutButton3);
        final Button linksButton2 = findViewById(R.id.linksButton2);

        if(timesScheduled[0]) {
            tutB0.setBackgroundResource(R.drawable.my_button_bg_other);
        }
        if(timesScheduled[1]) {
            tutB1.setBackgroundResource(R.drawable.my_button_bg_other);
        }
        if(timesScheduled[2]) {
            tutB2.setBackgroundResource(R.drawable.my_button_bg_other);
        }
        if(timesScheduled[3]) {
            tutB3.setBackgroundResource(R.drawable.my_button_bg_other);
        }

        //links button
        linksButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), LinksPage.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }



}