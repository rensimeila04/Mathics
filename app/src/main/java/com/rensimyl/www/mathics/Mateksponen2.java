package com.rensimyl.www.mathics;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Mateksponen2 extends AppCompatActivity {
    WebView vide2;
    Button btnBackmat2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mateksponen2);
        vide2 = findViewById(R.id.video2);
        btnBackmat2 = findViewById(R.id.materi2_back);
        btnBackmat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        vide2.loadUrl("file:///android_asset/videoe2.html");
        vide2.getSettings().setJavaScriptEnabled(true);
    }
}