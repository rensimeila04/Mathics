package com.rensimyl.www.mathics;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Matmatriks3 extends AppCompatActivity {
    Button backmatriks3;
    WebView vidm3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matmatriks3);

        backmatriks3 = findViewById(R.id.matriks3_back);
        vidm3 = findViewById(R.id.vidmatriks3);
        vidm3.loadUrl("file:///android_asset/videom3.html");
        vidm3.getSettings().setJavaScriptEnabled(true);
        backmatriks3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}