package com.example.lauron_datatypes;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView display;
        display = findViewById(R.id.displaytext);
        String firstname = "Vaughn Drake";
        String lastname = "Lauron";
        char middleInitial = 'B';
        int myAge =  18;
        double myMoney= 100;
        float myGrade= 99;

        //String.valueof(myMoney);
        display.setText("My name is "+firstname+" "+middleInitial+" "+lastname+"\nand my age is "+myAge+".\nI want my grade in TVL3 to be "+myGrade);

        boolean amISingle = true;
    }
}