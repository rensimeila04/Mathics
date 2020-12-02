package com.rensimyl.www.mathics;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Mateksponen1 extends AppCompatActivity {
    WebView vid1;
    Button btnBackmat1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mateksponen1);
        vid1 = findViewById(R.id.video1);
        btnBackmat1 = findViewById(R.id.materi1_back);
        btnBackmat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        vid1.loadUrl("file:///android_asset/video1.html");
        vid1.getSettings().setJavaScriptEnabled(true);
    }
}