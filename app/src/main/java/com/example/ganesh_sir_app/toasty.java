package com.example.ganesh_sir_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class toasty extends AppCompatActivity {
    private AppCompatButton btnn1;
    private AppCompatButton btnn2;
    private AppCompatButton btnn3;
    private AppCompatButton btnn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toasty);

        btnn1 = findViewById(R.id.btnn1);
        btnn2 = findViewById(R.id.btnn2);
        btnn3 = findViewById(R.id.btnn3);
        btnn4 = findViewById(R.id.btnn4);

        btnn1.setOnClickListener(v->{
            Toasty.error(getApplicationContext(), "This is an error toast.", Toast.LENGTH_SHORT, true).show();

        });
        btnn2.setOnClickListener(v->{
            Toasty.success(getApplicationContext(), "Success!", Toast.LENGTH_SHORT, true).show();

        });
        btnn3.setOnClickListener(v->{
            Toasty.info(getApplicationContext(), "Here is some info for you.", Toast.LENGTH_SHORT, true).show();

        });
        btnn4.setOnClickListener(v->{
            Toasty.warning(getApplicationContext(), "Beware of the dog.", Toast.LENGTH_SHORT, true).show();

        });

    }
}