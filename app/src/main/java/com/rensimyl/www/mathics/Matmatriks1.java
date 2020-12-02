package com.rensimyl.www.mathics;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Matmatriks1 extends AppCompatActivity {
    Button backmatriks1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matmatriks1);

        backmatriks1 = findViewById(R.id.matriks1_back);
        backmatriks1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}