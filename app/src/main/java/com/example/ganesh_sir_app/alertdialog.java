package com.example.ganesh_sir_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AlertDialogLayout;
import androidx.appcompat.widget.AppCompatButton;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class alertdialog extends AppCompatActivity {
    private AppCompatButton adbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alertdialog);

        adbtn = findViewById(R.id.adbtn);

        adbtn.setOnClickListener(v ->{

            final AlertDialog.Builder alertdialog=new AlertDialog.Builder(alertdialog.this);
            alertdialog.setTitle("Do You Want Delete");
            alertdialog.setCancelable(false).setMessage("click yes To Delete")
                                          .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                              @Override
                                              public void onClick(DialogInterface dialog, int which) {
                                                  Toast.makeText(alertdialog.this, "Record Deleted", Toast.LENGTH_SHORT).show();
                                              }
                                          }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                                                @Override
                                              public void onClick(DialogInterface dialog, int which) {
                                            dialog.dismiss();
                                                    Toast.makeText(alertdialog.this, "Record Not Deleted", Toast.LENGTH_SHORT).show();
                                                }
                                            });
                          AlertDialog alertDialog1=alertdialog.create();
                          alertDialog1.show();


        });

    }
}