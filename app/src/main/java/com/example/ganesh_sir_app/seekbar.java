package com.example.ganesh_sir_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSeekBar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class seekbar extends AppCompatActivity {
    private AppCompatSeekBar sb;
    private TextView sbtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);

        sb = findViewById(R.id.sb);
        sbtv = findViewById(R.id.sbtv);

        sb.setMax(100);



        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                sbtv.setText("Your Progress"+sb.getProgress()+"/"+sb.getMax());
               /* if(sb.getProgress()>=80){
                    sbtv.setTextColor(android.R.color.holo_red_light);
                }else{
                    sbtv.setTextColor(android.R.color.holo_green_light);
                }*/
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(seekbar.this, "Seekbar Start Touch", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(seekbar.this, "Seekbar Stop Touch", Toast.LENGTH_SHORT).show();

            }
        });

    }
}