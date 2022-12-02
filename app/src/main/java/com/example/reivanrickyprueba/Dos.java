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

    private int code = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);
        editTextNames = findViewById(R.id.editTextName);
        editTextLastName = findViewById(R.id.editTextLastName);



        buttonNext = findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = editTextNames.getText().toString();
                String LastName =editTextLastName.getText().toString();
                Intent intent = new Intent( Dos.this, Tres.class);
                intent.putExtra("Nombre",Name);
                intent.putExtra("Apellido",LastName);
                startActivity(intent);
            }
        });



    }

    public void onClick_buttonFinish (View view) {
        finish();
    }

}