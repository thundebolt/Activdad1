package com.merino.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Generar_registro extends AppCompatActivity {
    Button btn_agregar;
    EditText txt_name,txt_apellido;
    CheckBox check_si ,check_no;
    RatingBar rating;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generar_registro);
        btn_agregar = findViewById(R.id.btn_agregar);
        txt_name = findViewById(R.id.txt_name);
        txt_apellido = findViewById(R.id.txt_apellido);
        check_si = findViewById(R.id.check_si);
        check_no = findViewById(R.id.check_no);
        rating = findViewById(R.id.rating);
        spinner = findViewById(R.id.spinner);


        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Santiago");
        ciudades.add("Concepcion");
        ciudades.add("Temuco");

        ArrayAdapter<String> adaptador2 = new ArrayAdapter<>(Generar_registro.this ,
                android.R.layout.simple_spinner_item,ciudades);
        spinner.setAdapter(adaptador2);

        //Datos nombre , apellidos,rating,edad.
            final ArrayList<String> datos = new ArrayList<>();
           final ArrayAdapter<String> datosr =
                   new ArrayAdapter<String>(Generar_registro.this,android.R.layout.simple_list_item_1,datos);

           //boton guardar datosss
            btn_agregar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    datos.add(txt_name.getText().toString());
                    datos.add(txt_apellido.getText().toString());
                    datos.add(Float.toString(rating.getRating()));
                    datos.add(Boolean.toString(check_si.isChecked()));
                    datos.add(Boolean.toString(check_no.isChecked()));
                    Toast.makeText(Generar_registro.this,"Registro guardado",Toast.LENGTH_LONG).show();

                }
            });
    }
}