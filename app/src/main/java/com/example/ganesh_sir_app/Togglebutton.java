package com.example.ganesh_sir_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Togglebutton extends AppCompatActivity {

    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_togglebutton);

        toggleButton=findViewById(R.id.toggleButton);
        toggleButton.setTextOff("Bluetooth Off");
        toggleButton.setTextOn("Bluetooth On");
        toggleButton.setChecked(false);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Toast.makeText(getApplicationContext(),"Bluetooth On",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Bluetooth Off",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}