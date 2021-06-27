package com.example.ganesh_sir_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatRatingBar;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ratingbar extends AppCompatActivity {

    private AppCompatRatingBar rb;
    private AppCompatButton rbbtn;
    private TextView rbtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingbar);


        rbtv = findViewById(R.id.rbtv);
        rb = findViewById(R.id.rb);
        rbbtn = findViewById(R.id.rbbtn);


        rbbtn.setOnClickListener(v->{
         String numstars_string="/numOfstar-"+rb.getNumStars();
           String rating_string="userRating-"+rb.getRating();
            Toast.makeText(this,rating_string+numstars_string, Toast.LENGTH_LONG).show();

        });

    }
}