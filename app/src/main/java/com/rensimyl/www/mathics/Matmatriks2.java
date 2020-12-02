package com.rensimyl.www.mathics;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Matmatriks2 extends AppCompatActivity {
    Button backmatriks2;
    WebView vidm2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matmatriks2);

        backmatriks2 = findViewById(R.id.matriks2_back);
        vidm2 = findViewById(R.id.vidmatriks2);
        vidm2.loadUrl("file:///android_asset/videom1.html");
        vidm2.getSettings().setJavaScriptEnabled(true);
        backmatriks2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}