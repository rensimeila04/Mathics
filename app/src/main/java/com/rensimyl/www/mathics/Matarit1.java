package com.rensimyl.www.mathics;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Matarit1 extends AppCompatActivity {
    Button backaritmatika1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matarit1);

        backaritmatika1 = findViewById(R.id.aritmatika1_back);
        backaritmatika1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}