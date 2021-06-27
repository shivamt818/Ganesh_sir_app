package com.example.ganesh_sir_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

public class Imagebutton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagebutton);

        ImageButton imageButton=findViewById(R.id.IB);
        imageButton.setOnClickListener(v->{
            Toast.makeText(getApplicationContext(),"ImageButton with all Attributes",Toast.LENGTH_LONG).show();
        });

    }
}