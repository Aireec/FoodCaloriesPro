package com.example.foodcaloriespro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    // These are the calories of items that stores in ArrayLists.
    ArrayList<Integer> bread_Cereal_Cal = new ArrayList<Integer>(Arrays.asList(140,86,48,96,88,250,130,17,35,93,
            320,238,195,300,175,330,315,193,210,420,420,500,405,28,37,180,303));

    ArrayList<Integer> meat_Fish_Cal = new ArrayList<Integer>(Arrays.asList(300,250,150,300,320,220,50,150,400,200,
            400,90,50,320,200,220,6,300,200,200,200,150,300,200,300,320,90,200,140,180,320,320,200,220,220,180,
            250,220,290,400,400,130,200,100,180,200,300));

    ArrayList<Integer> fruit_Veg_Cal = new ArrayList<Integer>(Arrays.asList(44,107,170,180,25,30,27,15,16,20,5,
            35,8,3,100,55,32,40,10,150,4,14,3,12,100,50,14,49,3,86,40,210,200,35,45,6,40,30,8,10,95,70,30,6,70,5));

    ArrayList<Integer> milk_Dairy_Cal = new ArrayList<Integer>(Arrays.asList(110,130,90,40,49,200,128,160,340,480,
            210,90,120,125,200,175,125,95,90,120,300,290,90,70));

    ArrayList<Integer> fat_Sugar_Cal = new ArrayList<Integer>(Arrays.asList(9,250,112,8,200,135,125,100,42,38,
            225,50,50,240,10,135,150,20,100,15,100));

    ArrayList<Double> fruit_Cal = new ArrayList<Double>(Arrays.asList(44.0,35.0,30.0,150.0,107.0,1.0,1.1,49.0,2.4,
            24.0,5.0,28.0,5.0,250.0,10.0,2.6,50.0,3.0,100.0,24.0,34.0,20.0,3.0,40.0,36.0,25.0,42.0,6.8,35.0,100.0,
            67.0,30.0,28.0,35.0,45.0,50.0,25.0,9.0,5.0,1.1,8.0,29.0,35.0,2.7,5.0,26.0,9.0,2.0));

    CheckBox bread_Cereal_Chk,
             meat_Fish_Chk,
             fruit_Veg_Chk,
             milk_Dairy_Chk,
             fats_Sugar_Chk,
             fruit_Chk;

    double sumOfCalories = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bread_Cereal_Chk = (CheckBox)findViewById(R.id.bread_Cereals_checkBox);
        meat_Fish_Chk = (CheckBox)findViewById(R.id.meats_Fish_checkBox);
        fruit_Veg_Chk = (CheckBox)findViewById(R.id.fruits_Veg_checkBox);
        milk_Dairy_Chk = (CheckBox)findViewById(R.id.milk_Dairy_checkBox);
        fats_Sugar_Chk = (CheckBox)findViewById(R.id.fats_Sugar_checkBox);
        fruit_Chk = (CheckBox)findViewById(R.id.fruit_checkBox);
    }

    public void calories_OnClickBtn(View view) {

        if (bread_Cereal_Chk.isChecked()){
            for (int c:bread_Cereal_Cal){
                sumOfCalories += c;
            }
        }

        if (meat_Fish_Chk.isChecked()){
            for (int c:meat_Fish_Cal){
                sumOfCalories += c;
            }
        }

        if (fruit_Veg_Chk.isChecked()){
            for (int c:fruit_Veg_Cal){
                sumOfCalories += c;
            }
        }

        if (milk_Dairy_Chk.isChecked()){
            for (int c:milk_Dairy_Cal){
                sumOfCalories += c;
            }
        }

        if (fats_Sugar_Chk.isChecked()){
            for (int c:fat_Sugar_Cal){
                sumOfCalories += c;
            }
        }

        if (fruit_Chk.isChecked()){
            for (double c:fruit_Cal){
                sumOfCalories += c;
            }
        }

        startActivity(new Intent(this,CaloriesDisplayActivity.class).
                putExtra("caloriesVal",sumOfCalories));
        sumOfCalories = 0.0;


    }
}
