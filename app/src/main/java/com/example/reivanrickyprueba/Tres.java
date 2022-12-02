package com.example.reivanrickyprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tres extends AppCompatActivity {



    private EditText editTextNames;
    private EditText editTextLastName;

    private EditText editTextDividendo;
    private EditText editTextDivisor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres);

        Bundle extras = getIntent().getExtras();

        String Names = extras.getString("Nombre");
        String LastName = extras.getString("Apellido");

        editTextNames=findViewById(R.id.editTextName1);
        editTextLastName=findViewById(R.id.editTextLastName1);
        editTextNames.setText(Names);
        editTextLastName.setText(LastName);
    }
    public void onClick_buttonFinish (View view) {
        String Dividendo = editTextDividendo.getText().toString();
        String Divisor =editTextDivisor.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("Divdd",Dividendo);
        intent.putExtra("Divs",Divisor);
        setResult(Activity.RESULT_OK, intent);
        finish();


    }





}