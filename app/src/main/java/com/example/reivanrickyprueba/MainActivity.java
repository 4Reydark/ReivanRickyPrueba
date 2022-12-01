package com.example.reivanrickyprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private void Bloquear(EditText editText){
        editText.setText(null);
        editText.setEnabled(false);
        editText.setCursorVisible(false);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}