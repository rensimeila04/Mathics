package com.rensimyl.www.mathics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Geometri extends AppCompatActivity {
    Button backGeometri, geometri1, geometri2, geometri3, geometri4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometri);

        backGeometri = findViewById(R.id.geo_back);
        geometri1 = findViewById(R.id.materi_geo1_go);
        geometri2 = findViewById(R.id.materi_geo2_go);
        geometri3 = findViewById(R.id.materi_geo3_go);
        geometri4 = findViewById(R.id.materi_geo4_go);
        geometri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Geometri.this, Matgeo1.class);
                startActivity(intent);
            }
        });
        geometri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Geometri.this, Matgeo2.class);
                startActivity(intent);
            }
        });
        geometri3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Geometri.this, Matgeo3.class);
                startActivity(intent);
            }
        });
        geometri4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Geometri.this, Matgeo4.class);
                startActivity(intent);
            }
        });
        backGeometri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}