package com.example.ganesh_sir_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigation extends AppCompatActivity {
    private BottomNavigationView bottomnavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        bottomnavigation = findViewById(R.id.bottomnavigation);
        bottomnavigation.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.item1:
                        Toast.makeText(getApplicationContext(),""+item.getTitle(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item2:
                        Toast.makeText(getApplicationContext(),""+item.getTitle(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item3:
                        Toast.makeText(getApplicationContext(),""+item.getTitle(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item4:
                        Toast.makeText(getApplicationContext(),""+item.getTitle(), Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}