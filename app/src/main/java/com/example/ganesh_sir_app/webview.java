package com.example.ganesh_sir_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class webview extends AppCompatActivity {

    private WebView wb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        wb = findViewById(R.id.wb);

       wb.loadUrl("https://www.youtube.com/watch?v=TlBcHCd2Jeg");

    }
}