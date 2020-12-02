package com.rensimyl.www.mathics;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Matmatriks5 extends AppCompatActivity {
    Button backmatriks5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matmatriks5);

        backmatriks5 = findViewById(R.id.matriks5_back);
        backmatriks5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}