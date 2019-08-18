package com.example.project299;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout tbId;
    private LinearLayout choleraId;
    private LinearLayout aidsId;
    private LinearLayout dengueId;
    private LinearLayout chikungunyaId;
    private LinearLayout astmaId;
    private LinearLayout dustAllergy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dustAllergy =findViewById(R.id.dustAllergyId);
        dustAllergy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DustAllergyActivity.class);
                startActivity(intent);
            }
        });
        //............
        astmaId =findViewById(R.id.astmaId);
        astmaId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AstmaActivity.class);
                startActivity(intent);
            }
        });
        //.............
        chikungunyaId =findViewById(R.id.chikungunyaId);
        chikungunyaId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ChikungunyaActivity.class);
                startActivity(intent);
            }
        });
        //..............
        dengueId =findViewById(R.id.dengueId);
        dengueId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DengueActivity.class);
                startActivity(intent);
            }
        });
        //...............
        aidsId =findViewById(R.id.aidsId);
        aidsId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AidsActivity.class);
                startActivity(intent);
            }
        });


        //.................
        choleraId =findViewById(R.id.choleraId);
        choleraId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DiarrhoeaActivity.class);
                startActivity(intent);
            }
        });

        //...................
        tbId = findViewById(R.id.tbId);
        tbId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TbActivity.class);
                startActivity(intent);
            }
        });


    }
}
