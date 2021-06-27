package com.example.ganesh_sir_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Edittext2 extends AppCompatActivity {

    TextView textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edittext2);

        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);

        Intent intent=getIntent();
      String usrnme= intent.getStringExtra("usrname1");
       String psswd= intent.getStringExtra("psswrd1");

       textView2.setText("Usernamme-"+usrnme);
        textView3.setText("Password-"+psswd);


    }
}