package com.example.ganesh_sir_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;

public class Edittext extends AppCompatActivity {

    AppCompatButton et_btn;
    TextInputEditText et_username,et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edittext);

        et_btn=findViewById(R.id.et_btn);
        et_username=findViewById(R.id.et_username);
        et_password=findViewById(R.id.et_password);

        et_btn.setOnClickListener(v->{
            String et_username_String=et_username.getText().toString();
            String et_password_String=et_password.getText().toString();

            Intent intent=new Intent(Edittext.this,Edittext2.class);
            intent.putExtra("usrname1",et_username_String);
            intent.putExtra("psswrd1",et_password_String);
            startActivity(intent);

        });


    }
}