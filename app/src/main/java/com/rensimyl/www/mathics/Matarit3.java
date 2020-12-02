package com.rensimyl.www.mathics;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Matarit3 extends AppCompatActivity {
    Button backaritmatika3;
    WebView vida3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matarit3);

        backaritmatika3 = findViewById(R.id.aritmatika3_back);
        vida3 = findViewById(R.id.videoa1);
        vida3.loadUrl("file:///android_asset/videoa3.html");
        vida3.getSettings().setJavaScriptEnabled(true);
        backaritmatika3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}