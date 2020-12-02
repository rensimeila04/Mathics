package com.rensimyl.www.mathics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MateriList extends AppCompatActivity {
    Button btnBackMateri, btnEksponen, btnMatriks, btnAritmatika, btnGeometri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_list);

        btnBackMateri = findViewById(R.id.btn_back_materiList);
        btnEksponen = findViewById(R.id.eksponen_go);
        btnMatriks = findViewById(R.id.matrix_go);
        btnAritmatika = findViewById(R.id.aritmethic_go);
        btnGeometri = findViewById(R.id.geometry_go);
        btnAritmatika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MateriList.this, Aritmatika.class);
                startActivity(intent);
            }
        });
        btnGeometri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MateriList.this, Geometri.class);
                startActivity(intent);
            }
        });
        btnMatriks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MateriList.this, matriks.class);
                startActivity(intent);
            }
        });
        btnEksponen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MateriList.this, Eksponen.class);
                startActivity(intent);
            }
        });
        btnBackMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
