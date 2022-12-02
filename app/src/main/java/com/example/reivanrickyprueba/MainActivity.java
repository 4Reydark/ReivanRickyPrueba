package com.example.reivanrickyprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private Button buttonNext;
    private Button buttonMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonNext = findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, Dos.class);

                startActivity(intent);
            }
        });



    }




}