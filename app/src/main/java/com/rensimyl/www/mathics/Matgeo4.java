package com.rensimyl.www.mathics;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Matgeo4 extends AppCompatActivity {
    Button backgeo4;
    WebView vidg4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matgeo4);

        backgeo4 = findViewById(R.id.geo4_back);
        vidg4 = findViewById(R.id.videog4);
        vidg4.loadUrl("file:///android_asset/videog3.html");
        vidg4.getSettings().setJavaScriptEnabled(true);
        backgeo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}