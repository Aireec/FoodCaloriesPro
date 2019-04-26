package com.example.foodcaloriespro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CaloriesDisplayActivity extends AppCompatActivity {
    TextView dis_Cal_TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories_display);

        dis_Cal_TV = (TextView)findViewById(R.id.textViewDis_CalAct);

        Intent intent = getIntent();
        double calories = intent.getDoubleExtra("caloriesVal",0.0);

        dis_Cal_TV.setText(String.valueOf(new DecimalFormat("##.##").format(calories)));
    }
}
