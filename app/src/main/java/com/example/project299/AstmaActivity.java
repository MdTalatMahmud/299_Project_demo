package com.example.project299;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AstmaActivity extends AppCompatActivity {

    private Button astmaSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_astma);


        astmaSubmit = findViewById(R.id.astmaSubmitBtn);

        astmaSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AstmaActivity.this,AstmaResultActivity.class);
                startActivity(intent);
            }
        });
    }
}
