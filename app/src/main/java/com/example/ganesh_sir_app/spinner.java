package com.example.ganesh_sir_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class spinner extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    AppCompatSpinner spinner;
    String [] data_test={"ahmedabad","mathura","bhopal","allahabad","Mumbai"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter abc=new ArrayAdapter(this, android.R.layout.simple_spinner_item,data_test);
        spinner.setAdapter(abc);

    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int data, long id) {
        Toast.makeText(this,data_test[data] , Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}