package com.example.ganesh_sir_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class Datepicker extends AppCompatActivity {

    AppCompatButton dpbtn1,dpbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datepicker);

       DatePicker x=findViewById(R.id.x);
       DatePicker y=findViewById(R.id.y);
        dpbtn1=findViewById(R.id.xbtn1);
        dpbtn2=findViewById(R.id.ybtn2);

        dpbtn1.setOnClickListener(v->{
            Toast.makeText(this,x.getDayOfMonth()+"-"+(x.getMonth()+1)+"-"+x.getYear(), Toast.LENGTH_SHORT).show();
        });

        dpbtn2.setOnClickListener(v->{
            Toast.makeText(this,y.getDayOfMonth()+"-"+y.getMonth()+"-"+y.getYear()+1, Toast.LENGTH_SHORT).show();
        });


    }
}