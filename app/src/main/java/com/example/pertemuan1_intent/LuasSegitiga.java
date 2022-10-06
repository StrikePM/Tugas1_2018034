package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasSegitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);

        final EditText alas = findViewById(R.id.edtAlas);
        final EditText tinggi = findViewById(R.id.edtTinggi);
        final TextView hasil = findViewById(R.id.txtHasil);
        final Button hitung = findViewById(R.id.btnHitung);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double wAlas = Double.parseDouble(alas.getText().toString());
                Double wTinggi = Double.parseDouble(tinggi.getText().toString());
                Double wHasil = (wAlas * wTinggi) / 2;
                hasil.setText(wHasil.toString());
            }
        });
    }
}