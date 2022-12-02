package com.example.reivanrickyprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Dos extends AppCompatActivity {

    private Button buttonNext;
    private Button buttonClose;

    private EditText editTextNames;
    private EditText editTextLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);
        editTextNames = findViewById(R.id.editTextName);
        editTextLastName = findViewById(R.id.editTextLastName);

        String Name = editTextNames.getText().toString();
        String LastName =editTextLastName.getText().toString();

        buttonNext = findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Dos.this, Tres.class);

                startActivity(intent);
            }
        });

        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }



}