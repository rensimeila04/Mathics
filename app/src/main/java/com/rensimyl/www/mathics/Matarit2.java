package com.rensimyl.www.mathics;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Matarit2 extends AppCompatActivity {
    Button backaritmatika2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matarit2);

        backaritmatika2 = findViewById(R.id.aritmatika2_back);
        backaritmatika2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}