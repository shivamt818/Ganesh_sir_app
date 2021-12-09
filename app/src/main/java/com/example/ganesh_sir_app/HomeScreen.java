package com.example.ganesh_sir_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HomeScreen extends AppCompatActivity {

   AppCompatButton one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,
                   fourteen,fifteen,sixteen,seventeen,eighteen,nineteen, twenty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        ten=findViewById(R.id.ten);
        eleven=findViewById(R.id.eleven);
        twelve=findViewById(R.id.twelve);
        thirteen=findViewById(R.id.thirteen);
        fourteen=findViewById(R.id.fourteen);
        fifteen=findViewById(R.id.fifteen);
        sixteen=findViewById(R.id.sixteen);
        seventeen=findViewById(R.id.seventeen);
        eighteen=findViewById(R.id.eighteen);
        nineteen=findViewById(R.id.nineteen);
        twenty=findViewById(R.id.twenty);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //TextView
        one.setOnClickListener(v->{
            Intent intent1=new Intent(HomeScreen.this,Textview.class);
            Toast.makeText(getApplicationContext(),"TextView Section With All Attributes",Toast.LENGTH_LONG).show();
            startActivity(intent1);
        });

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //EditText
        two.setOnClickListener(v->{
            Intent intent2=new Intent(HomeScreen.this,Edittext.class);
            Toast.makeText(getApplicationContext(),"EditText Section With All Attributes",Toast.LENGTH_LONG).show();
            startActivity(intent2);
        });
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //ImageButton
        three.setOnClickListener(v->{
            Intent intent3=new Intent(HomeScreen.this,Imagebutton.class);
            startActivity(intent3);

        });
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         //Button
        four.setOnClickListener(v->{
            Intent intent4=new Intent(HomeScreen.this,Button.class);
            startActivity(intent4);
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //TimePicker
        five.setOnClickListener(v ->{
            Intent intent5=new Intent(HomeScreen.this,Timepicker.class);
            startActivity(intent5);
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Datepicker
        six.setOnClickListener(v ->{
            Intent intent6=new Intent(HomeScreen.this,Datepicker.class);
            startActivity(intent6);
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Togglebutton
        seven.setOnClickListener(v->{
            Intent intent7=new Intent(HomeScreen.this,Togglebutton.class);
            startActivity(intent7);
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Checkbox
        eight.setOnClickListener(v->{
            Intent intent8=new Intent(HomeScreen.this,Checkbox.class);
            startActivity(intent8);
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //RadioButton
        nine.setOnClickListener(v->{
            Intent intent9=new Intent(HomeScreen.this,Radiobutton.class);
            startActivity(intent9);
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //toast
        ten.setOnClickListener(v->{
            Intent intent10=new Intent(HomeScreen.this,toast.class);
            startActivity(intent10);
        });

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //toasty
        eleven.setOnClickListener(v->{
            Intent intent11=new Intent(HomeScreen.this,toasty.class);
            startActivity(intent11);
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //spinner
        twelve.setOnClickListener(v->{
            Intent intent12=new Intent(HomeScreen.this,spinner.class);
            startActivity(intent12);
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Ratingbar
        thirteen.setOnClickListener(v->{
            Intent intent13=new Intent(HomeScreen.this,ratingbar.class);
            startActivity(intent13);
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //seekbar
        fourteen.setOnClickListener(v->{
            Intent intent14=new Intent(HomeScreen.this,seekbar.class);
            startActivity(intent14);
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Webview
        fifteen.setOnClickListener(v->{
            Intent intent15=new Intent(HomeScreen.this,webview.class);
            startActivity(intent15);
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Youtube Dependency
        sixteen.setOnClickListener(v->{
            Intent intent16=new Intent(HomeScreen.this,youtube.class);
            startActivity(intent16);
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //alertDialog
        seventeen.setOnClickListener(v->{
            Intent intent17=new Intent(HomeScreen.this,alertdialog.class);
            startActivity(intent17);
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //listview
        eighteen.setOnClickListener(v->{
            Intent intent18=new Intent(HomeScreen.this,listview.class);
            startActivity(intent18);
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //menubars
        nineteen.setOnClickListener(v->{
            Intent intent19=new Intent(HomeScreen.this,menubars.class);
            startActivity(intent19);
        });
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Bottom Navigation
        twenty.setOnClickListener(v->{
            Intent intent20=new Intent(this,BottomNavigation.class);
            startActivity(intent20);
        });
    }
}