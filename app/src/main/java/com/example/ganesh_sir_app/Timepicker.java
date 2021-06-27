package com.example.ganesh_sir_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

public class Timepicker extends AppCompatActivity {

    TimePicker tp1,tp2;
    AppCompatButton tpbtn1,tpbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timepicker);

        tp1=findViewById(R.id.tp1);
        tp2=findViewById(R.id.tp2);
        tpbtn1=findViewById(R.id.tpbtn1);
        tpbtn2=findViewById(R.id.tpbtn2);

       tpbtn1.setOnClickListener(v->{
           Toast.makeText(this,tp1.getCurrentHour()+"Hours "+" "+tp1.getCurrentMinute()+":Minutes", Toast.LENGTH_SHORT).show();
       });

        tpbtn2.setOnClickListener(v->{
            Toast.makeText(this,tp2.getCurrentHour()+"Hours "+"  "+tp2.getCurrentMinute()+"Minutes", Toast.LENGTH_SHORT).show();
        });



    }
}