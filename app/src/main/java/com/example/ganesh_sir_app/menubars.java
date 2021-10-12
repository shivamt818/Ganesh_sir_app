package com.example.ganesh_sir_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class menubars extends AppCompatActivity {

    private AppCompatButton mbbtn1;
    private AppCompatButton mbbtn2;
    private AppCompatButton mbbtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menubars);

        mbbtn1 = findViewById(R.id.mbbtn1);
        mbbtn2 = findViewById(R.id.mbbtn2);
        mbbtn3 = findViewById(R.id.mbbtn3);

        registerForContextMenu(mbbtn2);// for context menu part

        //for popUp menu bar
        mbbtn3.setOnClickListener(v->{
            PopupMenu popupMenu=new PopupMenu(this,mbbtn3);
            popupMenu.getMenuInflater().inflate(R.menu.option_menubar,popupMenu.getMenu());
            popupMenu.show();
            //now listener for popup menu
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    int id=item.getItemId();
                    switch (id){
                        case R.id.refresh:
                            Toasty.success(getApplicationContext(), "Refresh Success!", Toast.LENGTH_SHORT, true).show();
                            break;
                        case  R.id.help:
                            Toasty.success(getApplicationContext(), "Help Success!", Toast.LENGTH_SHORT, true).show();
                            break;
                        case R.id.checkforupdates:
                            Toasty.success(getApplicationContext(), "Check Updates Success!", Toast.LENGTH_SHORT, true).show();
                    }
                    return true;
                }
            });
        });
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//option menu bar outside the oncreate method
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
           getMenuInflater().inflate(R.menu.option_menubar,menu);
           return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case R.id.refresh:
                Toast.makeText(this, "Refresh case", Toast.LENGTH_LONG).show();
                break;
            case  R.id.help:
                Toast.makeText(this, "help case", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkforupdates:
                Toast.makeText(this, "checkForUpdate case", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     //context menu bar outside the oncreate method
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.option_menubar,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Choose any Options");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case R.id.refresh:
                Toast.makeText(this, "Refresh case", Toast.LENGTH_LONG).show();
                break;
            case  R.id.help:
                Toast.makeText(this, "help case", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkforupdates:
                Toast.makeText(this, "checkForUpdate case", Toast.LENGTH_LONG).show();
        }
        return true;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}