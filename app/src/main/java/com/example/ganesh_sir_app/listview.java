package com.example.ganesh_sir_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class listview extends AppCompatActivity {

    private SearchView sv;
    private ListView lv;
    private ArrayList<CharSequence> arraylist;
    private ArrayAdapter<CharSequence> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        sv = findViewById(R.id.sv);
        lv = findViewById(R.id.lv);

        arraylist=new ArrayList<CharSequence>();
        arraylist.add("aam");
        arraylist.add("santara");
        arraylist.add("kela");
        arraylist.add("angoor");

        arrayAdapter=new ArrayAdapter<CharSequence>(this, android.R.layout.simple_list_item_1,arraylist);
        lv.setAdapter(arrayAdapter);

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if(arraylist.contains(query)){
                    arrayAdapter.getFilter().filter(query);
                }else{
                    Toast.makeText(listview.this, "search Not Found", Toast.LENGTH_SHORT).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });

    }
}