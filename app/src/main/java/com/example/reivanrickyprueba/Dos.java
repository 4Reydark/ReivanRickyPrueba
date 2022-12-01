package com.example.reivanrickyprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dos extends AppCompatActivity {

    private Button ButtonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);



        private void OnClick_SiguienteActivity3(View view){

            Intent intent = new Intent(this, Tres.class);
            startActivity(intent);

        }

        private void OnClick_Close2(View view){



        }
    }


}