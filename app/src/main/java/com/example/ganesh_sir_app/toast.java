package com.example.ganesh_sir_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.Toast;

public class toast extends AppCompatActivity {
    private AppCompatButton tbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);


        tbtn = findViewById(R.id.tbtn);
        tbtn.setOnClickListener(v->{
            Toast.makeText(this, "Hello Ganesh Sir, I am Normal Toast\"", Toast.LENGTH_LONG).show();
        });

    }
}