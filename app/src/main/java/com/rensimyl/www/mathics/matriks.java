package com.rensimyl.www.mathics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class matriks extends AppCompatActivity {
    Button backmatriks, matriks1, matriks2, matriks3, matriks4, matriks5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matriks);

        backmatriks = findViewById(R.id.matriks_back);
        matriks1 = findViewById(R.id.materi_matriks1_go);
        matriks2 = findViewById(R.id.materi_matriks2_go);
        matriks3 = findViewById(R.id.materi_matriks3_go);
        matriks4 = findViewById(R.id.materi_matriks4_go);
        matriks5 = findViewById(R.id.materi_matriks5_go);
        matriks1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matriks.this, Matmatriks1.class);
                startActivity(intent);
            }
        });
        matriks2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matriks.this, Matmatriks2.class);
                startActivity(intent);
            }
        });
        matriks3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matriks.this, Matmatriks3.class);
                startActivity(intent);
            }
        });
        matriks4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matriks.this, Matmatriks4.class);
                startActivity(intent);
            }
        });
        matriks5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matriks.this, Matmatriks5.class);
                startActivity(intent);
            }
        });
        backmatriks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}