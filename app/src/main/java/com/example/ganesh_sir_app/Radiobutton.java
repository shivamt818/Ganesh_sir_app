package com.example.ganesh_sir_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.Toast;

public class Radiobutton extends AppCompatActivity {
    private RadioButton java;
    private RadioButton python;
    private RadioButton angular;
    private RadioButton C;
    private AppCompatButton rbbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton);


        rbbtn = findViewById(R.id.rbbtn);
        java = findViewById(R.id.java);
        python = findViewById(R.id.python);
        angular = findViewById(R.id.angular);
        C = findViewById(R.id.C);

        rbbtn.setOnClickListener(v->{
            String result="Selected Course";
                 result+=(java.isChecked())?"-Java":(python.isChecked())?"-python":(angular.isChecked())?"-angular":(C.isChecked())?"-C":"";
            Toast.makeText(this,result, Toast.LENGTH_SHORT).show();
        });



    }
}