package com.example.reivanrickyprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tres extends AppCompatActivity {


    private Button buttonClose;
    private EditText editTextNames;
    private EditText editTextLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres);
        Bundle extras = getIntent().getExtras();

        String Names = extras.getString("Nombre");
        String LastName = extras.getString("Apellido");

        editTextNames=findViewById(R.id.editTextName);
        editTextLastName=findViewById(R.id.editTextLastName);
        editTextNames.setText(Names);
        editTextLastName.setText(LastName);
    }
    public void onClick_buttonFinish (View view) {
        finish();
    }





}