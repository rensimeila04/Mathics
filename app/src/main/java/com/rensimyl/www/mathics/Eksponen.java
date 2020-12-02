package com.rensimyl.www.mathics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Eksponen extends AppCompatActivity {
    Button eksponenBack, materieksponen1, materieksponen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eksponen);

        eksponenBack = findViewById(R.id.eksponen_back);
        materieksponen1 = findViewById(R.id.materi_eksponen1_go);
        materieksponen2 = findViewById(R.id.materi_eksponen2_go);
        materieksponen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Eksponen.this, Mateksponen1.class);
                startActivity(intent);
            }
        });
        materieksponen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Eksponen.this, Mateksponen2.class);
                startActivity(intent);
            }
        });
        eksponenBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}