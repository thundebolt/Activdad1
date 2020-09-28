package com.merino.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;

public class Generar_registro extends AppCompatActivity {
    Button btn_agregar;
    EditText txt_name,txt_apellido;
    CheckBox check_edad;
    RatingBar rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generar_registro);
        btn_agregar = findViewById(R.id.btn_agregar);
        txt_name = findViewById(R.id.txt_name);
        txt_apellido = findViewById(R.id.txt_apellido);
        check_edad = findViewById(R.id.check_edad);
        rating = findViewById(R.id.rating);
    }
}