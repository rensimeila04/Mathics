package com.rensimyl.www.mathics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Aritmatika extends AppCompatActivity {
    Button backaritmatika, Aritmatika1, Aritmatika2, Aritmatika3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aritmatika);

        backaritmatika = findViewById(R.id.aritmatika_back);
        Aritmatika1 = findViewById(R.id.materi_aritmatika1_go);
        Aritmatika2 = findViewById(R.id.materi_aritmatika2_go);
        Aritmatika3 = findViewById(R.id.materi_aritmatika3_go);
        Aritmatika1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aritmatika.this, Matarit1.class);
                startActivity(intent);
            }
        });
        Aritmatika2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aritmatika.this, Matarit2.class);
                startActivity(intent);
            }
        });
        Aritmatika3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aritmatika.this, Matarit3.class);
                startActivity(intent);
            }
        });
        backaritmatika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}