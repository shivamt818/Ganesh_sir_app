package com.example.ganesh_sir_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Button extends AppCompatActivity implements View.OnClickListener {

  AppCompatButton btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        btn1=findViewById(R.id.btn);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Set  OnclickListener Type click", Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(v->{
            Toast.makeText(getApplicationContext(), "Lambada Expression Type Click", Toast.LENGTH_SHORT).show();
        });

        btn3.setOnClickListener(this);
    }
///
    public void onClickMethod(View view) {

        Toast.makeText(this, "OnClick Attribute Type Click", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "implements ViewListener Type Click", Toast.LENGTH_SHORT).show();
    }
}