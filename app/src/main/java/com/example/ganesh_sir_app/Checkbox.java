package com.example.ganesh_sir_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;

public class Checkbox extends AppCompatActivity {
    AppCompatCheckBox cb1,cb2,cb3,cb4;
    AppCompatButton cbbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        cb4=findViewById(R.id.cb4);
        cbbtn=findViewById(R.id.cbbtn);

        cbbtn.setOnClickListener(v->{
            String result="Selected Course";
            if(cb1.isChecked()){
                result+="-Java";
            }
            if(cb2.isChecked()){
                result+="-python";
            }
            if(cb3.isChecked()){
                result+="-Angular";
            }
            if(cb4.isChecked()){
                result+="-C";
            }
            Toast.makeText(this,result, Toast.LENGTH_SHORT).show();
            result="";
        });



    }
}